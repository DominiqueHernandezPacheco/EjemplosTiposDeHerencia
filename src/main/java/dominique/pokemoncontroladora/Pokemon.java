/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominique.pokemoncontroladora;

/**
 *
 * @author SPARTAN PC
 */
public abstract class Pokemon {
       
   protected int numPokedex;              
  protected String nombrePokemon;
   protected double pesoPokemon;
   protected String sexo;
    protected int temporadaQueAparece;
   protected String tipo;
    
   public Pokemon(int numP, String nombre, double peso, String sexo, int temporada, String tipo){
       numPokedex=numP;
       nombrePokemon=nombre;
       pesoPokemon=peso;
       this.sexo=sexo;
       temporadaQueAparece=temporada;
       this.tipo=tipo;
    }
   
   protected abstract void atacarPlacaje();
   protected abstract void atacarArañazo();   
   protected abstract void atacarMordisco();
   
   protected void ImprimirInfo(){
       System.out.println(numPokedex);
       System.out.println(nombrePokemon);
       System.out.println(pesoPokemon);
       System.out.println(sexo);
       System.out.println(temporadaQueAparece);
       System.out.println(tipo);
   }
}
