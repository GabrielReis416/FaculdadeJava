public class TesteTransporte {
    public static void main(String[] args) {
        
        Transporte carro = new Carro();
        Transporte bicicleta = new Bicicleta();
        
        
        Garagem garagem = new Garagem();
        
        
        garagem.adicionarTransporte(carro);
        System.out.println();
        garagem.adicionarTransporte(bicicleta);
    }
}