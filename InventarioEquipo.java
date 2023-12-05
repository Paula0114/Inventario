/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventarios;

/**
 *
 * @author PGARRIA
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class InventarioEquipo {
    private ArrayList<Equipo> equipos;
    private String archivo;

    public InventarioEquipo(String archivo) {
        equipos = new ArrayList<Equipo>();
        this.archivo = archivo;
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void quitarEquipo(Equipo equipo) {
        equipos.remove(equipo);
    }

    public Equipo buscarEquipo(String id) {
        for (Equipo equipo : equipos) {
            if (equipo.getId().equals(id)) {
                return equipo;
            }
        }
        return null;
    }
    
    // Método para guardar los equipos en un archivo
    public void guardarEnArchivo() {
        try {
            File file = new File(this.archivo);
            FileWriter writer = new FileWriter(file);

            for (Equipo equipo : equipos) {
                writer.write(equipo.getId() + "," + equipo.getMarca() + "," + equipo.getModelo() + "," + equipo.isDisponible() + "," + equipo.getUsuario() + "\n");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
