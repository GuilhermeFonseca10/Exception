
package trabalho;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class trabalho2 {
      public static void main(String [] args){
             //try         
          try {
                  int vetor [] = new int [4];
           System.out.println("Antes da exeção");
           vetor[4]=1;
           System.out.println("Esse texto não será impresso");
}        
          //catch
          catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("Exeção ao acessar um índece do vetor");
}
       //finally  
    finally  {
    System.out.println("Terminando a execução do bloco try");
    
}
          //throw
             System.out.println("Entre com um número decimal");
         
          try {
              double num = leNumero();
                System.out.println("Você digitou "+num);
          } catch (Exception ex) {
            System.out.println("Entrada inválida");
            ex.printStackTrace();
          }
    
      }
        public static double leNumero() throws Exception{
          Scanner scan = new Scanner(System.in);
          double num = scan.nextDouble();
          return num;
}
}

