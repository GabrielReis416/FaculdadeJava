public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade > 0 ? quantidade : 0; 
    }

    
    public void comprarProduto() {
        double valorTotal = preco * quantidade;
        double desconto = calcularDesconto(valorTotal);
        double valorFinal = valorTotal - desconto;

       
        System.out.printf("Produto comprado: %s%n", nome);
        System.out.printf("Valor total a ser pago: R$ %.2f%n", valorFinal);
    }

   
    private double calcularDesconto(double valorTotal) {
        if (valorTotal <= 100) {
            return 0; 
        } else if (valorTotal > 100 && valorTotal <= 200) {
            return valorTotal * 0.10; 
        } else if (valorTotal > 200 && valorTotal <= 500) {
            return valorTotal * 0.20; 
        } else {
            return valorTotal * 0.25; 
        }
    }

    public static void main(String[] args) {
 
        Produto produto1 = new Produto("Cadeira Gamer", 450.0, 1);
        Produto produto2 = new Produto("Teclado Mecânico", 150.0, 2);
        Produto produto3 = new Produto("Monitor 4K", 700.0, 1);

         produto1.comprarProduto();
        produto2.comprarProduto();
        produto3.comprarProduto();
    }
    
}  