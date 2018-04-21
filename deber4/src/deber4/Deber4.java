package deber4;
import java.util.Scanner;

public class Deber4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ent=new Scanner (System.in);
       System.out.println ("Por favor ingrese un numero");
       int num=ent.nextInt();
       if (num%2==0){
           System.out.println("El numero ingresado es par");
       }
       else{
           System.out.println("El numero ingresado es impar");
       }
    }
    
}
