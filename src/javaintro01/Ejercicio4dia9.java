/*
 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y 
se obtiene cambiando sus filas por columnas (o viceversa).
 */
package javaintro01;



/**
 *
 * @author User
 */
public class Ejercicio4dia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 int matriz[][] = new int[4][4];
        System.out.println("MATRIZ ORIGINAL");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 100);

                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("");
        System.out.println("MATRIZ TRASNPUESTA");
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
    
    

