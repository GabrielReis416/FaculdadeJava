import java.util.ArrayList;
import java.util.Collections;

public class Atividade2 {
    public static void main(String[] args) {
        
        ArrayList<Double> numerosDecimais = new ArrayList<>();
        
        
        numerosDecimais.add(12.5);
        numerosDecimais.add(3.4);
        numerosDecimais.add(7.8);
        numerosDecimais.add(1.2);
        numerosDecimais.add(9.6);
        numerosDecimais.add(5.5);
        numerosDecimais.add(4.7);
        numerosDecimais.add(8.9);
        numerosDecimais.add(6.3);
        numerosDecimais.add(2.1);
        
        
        System.out.println("ArrayList original: " + numerosDecimais);
        
        
        Collections.sort(numerosDecimais);
        System.out.println("ArrayList em ordem crescente: " + numerosDecimais);
        
        
        Collections.sort(numerosDecimais, Collections.reverseOrder());
        System.out.println("ArrayList em ordem decrescente: " + numerosDecimais);
    }
}