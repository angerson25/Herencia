package ejecutable;
import javax.swing.JOptionPane;

import modelo.*;

public class Test{
    public static void main(String[] args) {
        //entrada
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de X"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de Y"));

        //creacon de el objeto suma
        Suma miSuma = new Suma(x, y);
        miSuma.sumar();
        JOptionPane.showMessageDialog(null, "La suma de " + x + " y " + y + " es " + miSuma.mostrarResultado());
    }
}