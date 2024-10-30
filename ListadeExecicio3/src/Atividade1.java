import java.util.ArrayList;
import java.util.Random;

public class Atividade1 {
    public static void main(String[] args) {
       
        ArrayList<Integer> numeros = new ArrayList<>();
        
        
        Random random = new Random();
        
        
        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(100)); 
        }

        
        System.out.println("ArrayList original: " + numeros);

        
        if (numeros.size() > 2) {
            numeros.remove(2);
        }
        System.out.println("Após remover o número na terceira posição: " + numeros);

       
        numeros.add(0, random.nextInt(100));
        System.out.println("Após adicionar um número no início: " + numeros);

      
        if (numeros.contains(15)) {
            System.out.println("O número 15 está presente no ArrayList.");
        } else {
            System.out.println("O número 15 NÃO está presente no ArrayList.");
        }
    }
}
