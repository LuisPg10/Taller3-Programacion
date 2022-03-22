
package TercerPunto;

import java.util.Scanner;

public class TercerPunto {
    public static void main(String[] args) {
        
        double[] ventas = new double[7];
        char categoria;
        double VentaSemana = 0;
        double PagoBase,PagoSemana = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Categoria del vendedor: ");
        categoria = sc.next().charAt(0);
        System.out.println();
        
        for (int i = 0;i<7;i++){
            
            System.out.printf("Ventas día %d: ",(i+1));
            ventas[i] = sc.nextDouble();
            VentaSemana += ventas[i];
        }
        PagoBase = 200+VentaSemana*0.09;
        
        switch(categoria){
            case 'A': 
                if(VentaSemana >= 3000 && VentaSemana <= 5000){
                    PagoSemana = PagoBase+PagoBase*0.05;
                    
                }else if(VentaSemana >= 5000 && VentaSemana <= 7000){
                    PagoSemana = PagoBase+PagoBase*0.07;
                    
                }else if (VentaSemana > 7000){
                    PagoSemana = PagoBase+PagoBase*0.1;
                }else{
                    PagoSemana = PagoBase;
                }
                break;
            case 'B':
                if(VentaSemana >= 5000 && VentaSemana <= 10000){
                    PagoSemana = PagoBase+PagoBase*0.07;
                    
                }else if(VentaSemana >= 10000 && VentaSemana <= 15000){
                    PagoSemana = PagoBase+PagoBase*0.1;
                    
                }else if (VentaSemana > 7000){
                    PagoSemana = PagoBase+PagoBase*0.13;
                }else{
                    PagoSemana = PagoBase;
                }
                break;
        }
        System.out.printf("\nEl pago para el vendedor es de %.3f\n",PagoSemana);
    }
}