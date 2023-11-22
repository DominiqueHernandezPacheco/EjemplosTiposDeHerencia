/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dominique.applecontroladora;

/**
 *
 * @author SPARTAN PC
 */
public class AppleControladora {

    public static void main(String[] args) {
        
        Iphone iphoneDeDominique = new Iphone(10000, "iPhone X", "OLED");
        iphoneDeDominique.MostrarDatos();
        iphoneDeDominique.CambiarPantalla();
    }
}
