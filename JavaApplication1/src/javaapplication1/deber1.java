
package javaapplication1;
import java.io.*;
import java.util.*;
public class deber1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        double farenheit, celsius;
        System.out.println("cantidad en grados farenheit");
        farenheit=leer.nextInt();
        celsius=(((farenheit-32)*5)/9);
        System.out.println("en grados celsius es: "+celsius);
    }

}
