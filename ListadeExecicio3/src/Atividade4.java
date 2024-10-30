import java.util.ArrayList;


class Produto {
    String nome;
    double preco;

    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    
    public String getNome() {
        return nome;
    }

    
    public double getPreco() {
        return preco;
    }
}

public class Atividade4 {
    public static void main(String[] args) {
        
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        
        
        listaDeProdutos.add(new Produto("Celular", 1500.0));
        listaDeProdutos.add(new Produto("Notebook", 3500.0));
        listaDeProdutos.add(new Produto("TV", 2300.0));
        listaDeProdutos.add(new Produto("Tablet", 1200.0));
        listaDeProdutos.add(new Produto("Fone de Ouvido", 300.0));
        
        
        try {
            String nomeProdutoMaisCaro = encontrarProdutoMaisCaro(listaDeProdutos);
            System.out.println("O produto mais caro é: " + nomeProdutoMaisCaro);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    
    public static String encontrarProdutoMaisCaro(ArrayList<Produto> produtos) {
        
        if (produtos.isEmpty()) {
            throw new IllegalArgumentException("O ArrayList de produtos está vazio!");
        }
        
        
        Produto produtoMaisCaro = produtos.get(0);
        
        
        for (Produto produto : produtos) {
            if (produto.getPreco() > produtoMaisCaro.getPreco()) {
                produtoMaisCaro = produto;
            }
        }
        
        
        return produtoMaisCaro.getNome();
    }
}
