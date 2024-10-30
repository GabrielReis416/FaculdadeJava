public class IngressoVIP extends Ingresso {
    private double valorAdicional;

    public IngressoVIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }


    public String toString() {
        double valorTotal = valor + valorAdicional;
        return String.format("Valor do ingresso VIP: R$ %.2f (Valor base: R$ %.2f + Valor adicional: R$ %.2f)", valorTotal, valor, valorAdicional);
    }
}