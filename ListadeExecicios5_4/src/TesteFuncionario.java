public class TesteFuncionario {
    public static void main(String[] args) {
        
        Funcionario gerente = new Gerente("Gabriel", 7000.00);
        Funcionario analista = new Analista("Pedro", 3000.00);
        
        
        System.out.println("Bônus do Gerente " + gerente.nome + ": R$ " + gerente.calcularBonus());
        System.out.println("Bônus do Analista " + analista.nome + ": R$ " + analista.calcularBonus());
    }
}