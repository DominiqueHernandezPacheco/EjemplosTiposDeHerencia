/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dominique.pokemoncontroladora;

/**
 *
 * @author SPARTAN PC
 */
public class PokemonControladora {

    public static void main(String[] args) {
      
       Pikachu pikachu=new Pikachu(20,"Pika",3.6,"Macho",4,"Electrico"); 
       
       pikachu.ImprimirInfo();
       pikachu.atacarMordisco();
    }
}
