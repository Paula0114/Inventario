/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventarios;

/**
 *
 * @author PGARRIA
 */
public class Main {
    public static void main(String[] args) {
        // Creación de inventario de equipos
        InventarioEquipo inventario = new InventarioEquipo();

        // Agregar equipos al inventario
        inventario.agregarEquipo(new Equipo("1", "Apple", "Macbook Pro"));
        inventario.agregarEquipo(new Equipo("2", "Lenovo", "ThinkPad X1 Carbon"));
        inventario.agregarEquipo(new Equipo("3", "Dell", "XPS 13"));

        // Asignación de usuario a un equipo
        Equipo equipo = inventario.buscarEquipo("1");
        Usuario usuario = new Usuario("Juan", "Perez", "juanperez@example.com");
        equipo.setUsuario(usuario.getNombre() + " " + usuario.getApellido());

        // Cambio de disponibilidad de un equipo
        Equipo equipo2 = inventario.buscarEquipo("2");
        equipo2.setDisponible(false);

        // Mostrar inventario de equipos
        for (Equipo e : inventario.getEquipos()) {
            System.out.println("ID: " + e.getId());
            System.out.println("Marca: " + e.getMarca());
            System.out.println("Modelo: " + e.getModelo());
            System.out.println("Disponible: " + (e.isDisponible() ? "Sí" : "No"));
            System.out.println("Usuario: " + e.getUsuario());
            System.out.println();
        }
    }
}
