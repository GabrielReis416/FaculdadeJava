import java.util.ArrayList;
import java.util.List;

public class TesteForma {
    public static void main(String[] args) {
        
        Forma circulo = new Circulo(5.0); 
        Forma retangulo = new Retangulo(4.0, 6.0); 

 
        List<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(retangulo);

 
        imprimirAreas(formas);
    }

 
    public static void imprimirAreas(List<Forma> formas) {
        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}