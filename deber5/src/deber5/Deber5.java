package deber5;
import java.util.Scanner;
public class Deber5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ent=new Scanner (System.in);
      System.out.println("Este programa le dira el mes correspondiente dependiendo el numero ingresado");
      System.out.println("Por favor ingrese un numero del 1 al 12");
      int num=ent.nextInt ();
      switch (num){
          case 1:
              System.out.println("ENERO");
          break;
          case 2:
              System.out.println("FEBRERO");
          break;
          case 3:
              System.out.println("MARZO");
          break;
          case 4:
              System.out.println("ABRIL");
          break;
          case 5:
              System.out.println("MAYO");
          break;
          case 6:
              System.out.println("JUNIO");
          break;
          case 7:
              System.out.println("JULIO");
          break;
          case 8:
              System.out.println("AGOSTO");
          break;
          case 9:
              System.out.println("SEPTIEMBRE");
          break;
          case 10:
              System.out.println("OCTUBRE");
          break;
          case 11:
              System.out.println("NOVIEMBRE");
          break;
          case 12:
              System.out.println("DICIEMBRE");
          break;
          default:
              System.out.println("El numero ingresado esta fuera del rango establecido");
      }
    }
    
}
