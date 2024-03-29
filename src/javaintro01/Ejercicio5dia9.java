/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A
se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package javaintro01;

import java.util.Scanner;


public class Ejercicio5dia9 {

    /**
     * @param args the command line arguments
     */
    
       public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int[][] matriz=new int[3][3];
        int cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Escribe un valor para la matriz");
                int num=leer.nextInt();
                matriz[i][j]=num;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j]==-matriz[j][i]){
                    cont++;
                }
            }
        }
        if(cont==9){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz no es antisimetrica");
        }
    }
}
   
    

