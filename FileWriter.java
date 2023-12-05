/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventarios;

/**
 *
 * @author PGARRIA
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InventarioEquipo {
    private ArrayList<Equipo> equipos;
    private String archivo;

    public InventarioEquipo(String archivo) {
        equipos = new ArrayList<Equipo>();
        this.archivo = archivo;
        leerArchivo();
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
    
    // Método para leer los equipos desde un archivo
    public void leerArchivo() {
        try {
            File file = new File(this.archivo);
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            while ((line = reader.readLine()) != null) { // leer cada línea del archivo
                String[] datos = line.split(","); // dividir los datos en columnas usando la coma como separador
                Equipo equipo = new Equipo(datos[0], datos[1], datos[2]); // crear el objeto Equipo
                equipo.setDisponible(Boolean.parseBoolean(datos[3])); // definir si el equipo está disponible o no
                equipo.setUsuario(datos[4]); // definir el usuario asignado al equipo si lo hubiera

                this.agregarEquipo(equipo); // agregar el equipo a la lista
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
