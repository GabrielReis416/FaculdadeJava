interface Pagavel {
    double calcularPagamento();
}


abstract class Pessoa {
    protected String nome;
    protected String documento;


    public Pessoa(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }


    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }
}


class Empregado extends Pessoa implements Pagavel {
    private double salario;

 
    public Empregado(String nome, String documento, double salario) {
        super(nome, documento);
        this.salario = salario;
    }


    @Override
    public double calcularPagamento() {
        return salario; 
    }

 
    public double getSalario() {
        return salario;
    }
}


class Fornecedor extends Pessoa implements Pagavel {
    private double valorProduto;


    public Fornecedor(String nome, String documento, double valorProduto) {
        super(nome, documento);
        this.valorProduto = valorProduto;
    }

 
    @Override
    public double calcularPagamento() {
        return valorProduto * 0.9; 
    }

    
    public double getValorProduto() {
        return valorProduto;
    }
}