/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominique.applecontroladora;


public class ProductosApple {

    protected final String marca="Apple"; 
    protected int precio;
    protected String nombreProducto;
    
    
    
    public ProductosApple(int precio, String nombre){
      this.precio=precio;
      nombreProducto=nombre;
    }
    
    public void Reparar(){
        System.out.println("Su "+ nombreProducto+" se reparara, su costo sera"+ (precio/10));
    }
    
    public  int getPrecio(){
        return precio;
    }
    
    public void MostrarDatos(){
        System.out.print("Marca:"+marca+"/nPrecio: "+ precio+ "/nNombreProducto:"+ nombreProducto); 
    }
}
