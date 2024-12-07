public class Gerente extends Empregado {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if (departamento != null && !departamento.isEmpty()) {
            this.departamento = departamento;
        } else {
            throw new IllegalArgumentException("O departamento não pode ser vazio.");
        }
    }   
    public String toString() {
        return super.toString() + ", Departamento: " + departamento;
    }
}