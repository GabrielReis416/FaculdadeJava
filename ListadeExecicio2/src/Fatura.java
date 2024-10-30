public class Fatura {
    private String numeroItem;
    private String descricaoItem;
    private int quantidade;
    private double precoUnitario;

    
    public Fatura(String numeroItem, String descricaoItem, int quantidade, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        this.quantidade = quantidade > 0 ? quantidade : 0;
        this.precoUnitario = precoUnitario > 0 ? precoUnitario : 0.0;
    }

    
    public String getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(String numeroItem) {
        this.numeroItem = numeroItem;
    }

    
    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    
    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
    }

    
    public double getValorFatura() {
        return quantidade * precoUnitario;
    }

    
    public void aplicarDesconto(double porcentagemDesconto) {
        if (porcentagemDesconto > 0 && porcentagemDesconto <= 100) {
            double desconto = precoUnitario * (porcentagemDesconto / 100);
            precoUnitario -= desconto;
        }
    }

    public static void main(String[] args) {
        
        Fatura fatura1 = new Fatura("1234", "Teclado Mecânico", 2, 150.0);
        
        
        System.out.printf("Valor total da fatura de %s (%s): R$ %.2f%n", 
                fatura1.getDescricaoItem(), fatura1.getNumeroItem(), fatura1.getValorFatura());

        
        fatura1.aplicarDesconto(10);
        
        
        System.out.printf("Valor total da fatura de %s (%s) após desconto: R$ %.2f%n", 
                fatura1.getDescricaoItem(), fatura1.getNumeroItem(), fatura1.getValorFatura());
    }
}
