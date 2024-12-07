
abstract class Forma {
 
    public abstract double calcularArea();
}


class Circulo extends Forma {
    private double raio;


    public Circulo(double raio) {
        this.raio = raio;
    }

 
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio; 
    }
}


class Retangulo extends Forma {
    private double largura;
    private double altura;

    // Construtor
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return largura * altura; 
    }
}
