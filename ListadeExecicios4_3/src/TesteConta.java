public class TesteConta {
    public static void main(String[] args) {
        
        ContaCorrente contaCorrente = new ContaCorrente("João", 1000);
        System.out.println(contaCorrente);

        
        contaCorrente.depositar(500);
        System.out.println("Após depósito: " + contaCorrente);

        boolean saqueCorrente = contaCorrente.sacar(2000);
        System.out.println("Saque de 2000 (Conta Corrente): " + saqueCorrente);
        System.out.println(contaCorrente);

        
        ContaEspecial contaEspecial = new ContaEspecial("Maria", 500, 1000);
        System.out.println(contaEspecial);

        
        boolean saqueEspecial1 = contaEspecial.sacar(1200);
        System.out.println("Saque de 1200 (Conta Especial): " + saqueEspecial1);
        System.out.println(contaEspecial);

        boolean saqueEspecial2 = contaEspecial.sacar(500);
        System.out.println("Saque de 500 (Conta Especial): " + saqueEspecial2);
        System.out.println(contaEspecial);

        boolean saqueEspecial3 = contaEspecial.sacar(1000);
        System.out.println("Saque de 1000 (Conta Especial): " + saqueEspecial3);
        System.out.println(contaEspecial);
    }
}