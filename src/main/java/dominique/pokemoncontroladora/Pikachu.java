/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominique.pokemoncontroladora;

/**
 *
 * @author SPARTAN PC
 */
public  class Pikachu extends Pokemon implements IElectrico {
 
    
    public Pikachu(int numP, String nombre, double peso, String sexo, int temporada, String tipo){
       super(numP,nombre,peso,sexo,temporada,tipo);
    }
   
    
    
 @Override
 protected  void atacarPlacaje(){
     System.out.println("Hola soy el tonto de pikachu y estoy atacando tus placas wero"); 
 }
 @Override
   protected  void atacarArañazo(){
     System.out.println("Hola soy el tonto de pikachu y te ando arañando por nub");   
   } 
 @Override
   protected void atacarMordisco(){
    System.out.println("Hola soy el tonto de pikachu y te ando mordiendo wapo");    
   }   
   
   
 @Override
    public void atacarImpactrueno(){
     System.out.println("Hola soy Pikachu y este es mi ataque Impactrueno");    
    }
   
 @Override
   public void atacarPuñoTrueno(){
     System.out.println("Hola soy Pikachu y este es mi ataque PuñoTrueno");  
   }
   
 @Override
   public void atacarRayo(){
    System.out.println("Hola soy Pikachu y este es mi ataque Rayo");   
   }
   
 @Override
   public void atacarRayoCarga(){
   System.out.println("Hola soy Pikachu y este es mi ataque Rayo carga");    
   }
   
   
}
