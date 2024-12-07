public class Vendedor extends Empregado {
    private double percentualComissao;

    public Vendedor(String nome, double salario, double percentualComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        if (percentualComissao >= 0) {
            this.percentualComissao = percentualComissao;
        } else {
            throw new IllegalArgumentException("O percentual de comissão deve ser positivo.");
        }
    }

    public double calcularSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Salário com Comissão: " + String.format("%.2f", calcularSalario()) +
                ", Percentual de Comissão: " + String.format("%.2f", percentualComissao) + "%";
    }
}
