public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Gbariel", 3000);
        System.out.println(empregado);

        Gerente gerente = new Gerente("Pedro", 5000, "Recursos Humanos");
        System.out.println(gerente);

        Vendedor vendedor = new Vendedor("Julia", 2000, 10);
        System.out.println(vendedor);

        vendedor.setSalario(2500);
        vendedor.setPercentualComissao(15);
        System.out.println("Após atualização: " + vendedor);
    }
}