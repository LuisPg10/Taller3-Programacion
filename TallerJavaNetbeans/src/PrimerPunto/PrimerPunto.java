
package PrimerPunto;

import java.util.Scanner;

public class PrimerPunto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\tInforme de ventas");
        System.out.print("\n¿Cuantos productos se vendieron en el día?: ");
        int n = sc.nextInt();
        
        //Vectores
        String[] A = new String[n];
        int[] C = new int[n];
        float[] B = new float[n];
        
        //Variables para los datos solicitados
        double TotalIngresos = 0;
        int TotalProductos = 0;
        String MasVendido = "" ,MasCostoso = "";
        
        for (int i = 0;i<n;i++){
            
            System.out.printf("\nCodigo de producto No. %d: ",(i+1));A[i] = sc.next();
            System.out.printf("Valor de venta del producto No. %d: ",(i+1));B[i] = sc.nextFloat();
            System.out.print("Cantidad de unidades vendidas: ");C[i] = sc.nextInt();

            TotalIngresos += B[i] * C[i];
            TotalProductos += C[i];
            
            if(i==0){
                MasVendido = A[i];
                MasCostoso = A[i];                
            }else{
                if(C[i] > C[i-1]){
                    MasVendido = A[i];
                }
                if(B[i] > B[i-1]){
                    MasCostoso = A[i];
                }
            }
        }
        
        //Resultados solicitados
        System.out.println("\nEl total de productos vendidos en el día es de "+TotalProductos);
        System.out.printf("El total de ingresos es de %f pesos\n",TotalIngresos);
        System.out.println("El producto más vendido fue "+MasVendido);
        System.out.println("El producto más costoso fue "+MasCostoso);
    }
}