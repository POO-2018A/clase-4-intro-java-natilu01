package deber3;
import java.util.Scanner;
public class Deber3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ent=new Scanner(System.in);
       System.out.println("Por favor ingrese su edad");
       int edad=ent.nextInt ();
       if (edad >= 18){
           System.out.println("usted es mayor de edad");
       }
       else {
           System.out.println("usted es menor de edad");
       }
    }
    
}
