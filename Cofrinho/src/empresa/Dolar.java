package empresa;

// Gerenciando o Dolar
public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Dólar: " + valor);
    }

    @Override
    public double converter() {
        return valor * 5.0;
    }
}