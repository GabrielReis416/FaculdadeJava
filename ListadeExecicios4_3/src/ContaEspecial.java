public class ContaEspecial extends ContaCorrente {
    private double limite;

    public ContaEspecial(String titular, double saldoInicial, double limite) {
        super(titular, saldoInicial);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        if (limite >= 0) {
            this.limite = limite;
        } else {
            throw new IllegalArgumentException("O limite deve ser positivo.");
        }
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && saldo + limite >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Limite: " + String.format("%.2f", limite);
    }
}