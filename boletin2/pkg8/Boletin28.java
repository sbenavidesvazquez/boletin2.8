// celsius a farenheit, y celsius /a kelvin.
package boletin2.pkg8;

import java.util.Scanner;


public class Boletin28 {

    
    public static void main(String[] args) {
    float celsius;
    
    System.out.print("celsius = ");
    Scanner dato= new Scanner(System.in);
    celsius=dato.nextFloat();
    
    System.out.println("Farenheit = 9/5*"+ celsius +"+32="+ (9/5*celsius+32));
    System.out.print("Kelvin ="+ celsius +"273="+ (celsius+273));
    
    }
    
}
