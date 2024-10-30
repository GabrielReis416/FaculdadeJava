import java.util.ArrayList;
import java.util.Iterator;

public class Atividade3 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        
        numeros.add(2);
        numeros.add(5);
        numeros.add(8);
        numeros.add(3);
        numeros.add(10);
        numeros.add(4);
        numeros.add(7);
        numeros.add(6);
        numeros.add(12);
        numeros.add(9);
        numeros.add(3);
        numeros.add(14);
        numeros.add(16);
        numeros.add(5);
        numeros.add(18);
        
        
        System.out.println("ArrayList original: " + numeros);
        
        
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 0) { 
                it.remove();
            }
        }
        
        
        System.out.println("ArrayList após remover números pares: " + numeros);
    }
}