public class Empregado {
    private String nome;
    protected double salario; 

    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("O salário deve ser um valor positivo.");
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Salário: " + String.format("%.2f", salario);
    }
}