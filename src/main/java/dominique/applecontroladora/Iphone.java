/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominique.applecontroladora;

/**
 *
 * @author SPARTAN PC
 */
public class Iphone extends ProductosApple {
    
    private String tipoDePantalla;
    
    public Iphone(int precio, String nombre, String pantalla) {
        super(precio, nombre);
        tipoDePantalla=pantalla;
    }
    @Override
    public void MostrarDatos(){
         System.out.println("Marca: "+marca+" Precio: "+ precio+ " NombreProducto: "+ nombreProducto+" Tipo de pantalla: "+tipoDePantalla);
    }
    
    public void CambiarPantalla(){
        System.out.println("Cambiando su pantalla "+ tipoDePantalla+" por una nueva");
    }
    
    
}
