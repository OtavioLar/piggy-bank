package empresa;

public abstract class Moeda {
    protected double valor; // Valor da moeda

    public Moeda(double valor) {
        this.valor = valor;
    }

    // Metodo abstrato que cada moeda deve implementar
    public abstract void info();

    // Método abstrato para converter para Real
    public abstract double converter();
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Moeda other = (Moeda) obj;
        return Double.compare(other.valor, valor) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(valor);
    }
}