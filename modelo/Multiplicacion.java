package modelo;

public class Multiplicacion extends Operacion {
    // Constructor
    public Multiplicacion(double x, double y) {
        super(x, y);
    }
    
    // Métodos
    public void multiplicar() {
        resultado = x * y;
    }
}