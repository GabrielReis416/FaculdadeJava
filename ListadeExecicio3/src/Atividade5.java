import java.util.ArrayList;

public class Atividade5 {
    public static void main(String[] args) {
       
        ArrayList<String> listaDeStrings = new ArrayList<>();
        
        
        listaDeStrings.add("10");
        listaDeStrings.add("20");
        listaDeStrings.add("abc");  
        listaDeStrings.add("30");
        listaDeStrings.add("xyz");  
        
        
        ArrayList<Integer> numerosConvertidos = new ArrayList<>();
        
        
        for (String str : listaDeStrings) {
            try {
                
                int numero = Integer.parseInt(str);
                numerosConvertidos.add(numero);  
            } catch (NumberFormatException e) {
                
                System.out.println("Erro ao converter '" + str + "' para número: " + e.getMessage());
            }
        }
        
        
        System.out.println("Números convertidos com sucesso: " + numerosConvertidos);
    }
}