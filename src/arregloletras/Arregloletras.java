/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloletras;

import java.util.Scanner;

/**
 *
 * @author HERMANOS MEJIA
 */
public class Arregloletras {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    String cadena;
    int cont1 = 0, cont2 = 0, consonantes;
    System.out.println("Introdusca una palabra:");
    cadena = entrada.nextLine();
    for (int i = 0; i < cadena.length(); i++) {
      cont1++;
    }
    for (int i = 0; i < cadena.length(); i++) {
      if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'i') || (cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'u')) {
        System.out.println("Vocal" + " (" + cadena.charAt(i) + ")" + " esta en la pocision:" + "[" + i + "]");
        cont2++;
      }
    }
    consonantes = cont1 - cont2;
    System.out.println("La palabra" + cadena + "contiene" + cont2 + "vocales");
    System.out.println("La palabra" + cadena + "contiene" + consonantes + "consonantes");
  }
}
