public class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    
    public String toString() {
        return String.format("Valor do ingresso: R$ %.2f", valor);
    }
}