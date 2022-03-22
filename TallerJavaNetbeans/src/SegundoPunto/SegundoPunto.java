
package SegundoPunto;

import javax.swing.JOptionPane;

public class SegundoPunto {
    public static void main(String[] args) {
        
        int SaldoInicial,abonos,deducciones,limite,saldo;
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de clientes que tiene"));
        
        for (int i = 1;i<=n;i++){
            
            SaldoInicial = Integer.parseInt(JOptionPane.showInputDialog("Saldo inicial al mes del cliente "+i));
            abonos = Integer.parseInt(JOptionPane.showInputDialog("Cantidad abonada durante el mes"));
            deducciones = Integer.parseInt(JOptionPane.showInputDialog("Total de las deudas en el mes"));
            limite = Integer.parseInt(JOptionPane.showInputDialog("Limite de credito para este usuario"));
            
            saldo = SaldoInicial + abonos - deducciones;
            
            if(saldo-limite > 0){
                JOptionPane.showMessageDialog(null,"Se ha exedido el limite de credito");
            }else{
                JOptionPane.showMessageDialog(null,"No se ha exedido el limite de credito");
            }
        }
    }
}
