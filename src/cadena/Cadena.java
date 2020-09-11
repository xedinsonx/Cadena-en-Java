
package cadena;

import javax.swing.JOptionPane;


public class Cadena {

   
    public static void main(String[] args) {
        
             String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
        
        JOptionPane.showConfirmDialog(null,"La cadena es: "+cadena);
        JOptionPane.showConfirmDialog(null,"El numero entero es: "+entero);
        JOptionPane.showConfirmDialog(null,"El caracter es: "+letra);
        JOptionPane.showConfirmDialog(null,"El decimal es: "+decimal);
    }
    
}
