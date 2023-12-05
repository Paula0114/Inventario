/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventarios;

/**
 *
 * @author PGARRIA
 */
public class Equipo {
    private String id;
    private String marca;
    private String modelo;
    private boolean disponible;
    private String usuario;

    public Equipo(String id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.disponible = true; // inicialmente el equipo está disponible
        this.usuario = ""; // ningún usuario asignado
    }

    public String getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
