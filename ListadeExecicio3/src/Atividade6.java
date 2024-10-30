import java.util.ArrayList;

class NoMatchingElementsException extends Exception {
    public NoMatchingElementsException(String message) {
        super(message);
    }
}

public class Atividade6 {
    public static void main(String[] args) {
       
        ArrayList<String> listaDePalavras = new ArrayList<>();
        
        
        listaDePalavras.add("cachorro");
        listaDePalavras.add("gato");
        listaDePalavras.add("elefante");
        listaDePalavras.add("casa");
        listaDePalavras.add("carro");
        listaDePalavras.add("unifeia");
        listaDePalavras.add("livro");
        listaDePalavras.add("python");
        listaDePalavras.add("carro");  
        listaDePalavras.add("java");
        
        try {
            
            ArrayList<String> palavrasFiltradas = filtrarPalavrasComMaisDe5Caracteres(listaDePalavras);
            
            System.out.println("Palavras com mais de 5 caracteres: " + palavrasFiltradas);
        } catch (NoMatchingElementsException e) {
            
            System.out.println(e.getMessage());
        }
    }

    
    public static ArrayList<String> filtrarPalavrasComMaisDe5Caracteres(ArrayList<String> palavras) throws NoMatchingElementsException {
        ArrayList<String> palavrasFiltradas = new ArrayList<>();

        
        for (String palavra : palavras) {
            if (palavra.length() > 5) {
                palavrasFiltradas.add(palavra);
            }
        }
        
        
        if (palavrasFiltradas.isEmpty()) {
            throw new NoMatchingElementsException("Nenhuma palavra com mais de 5 caracteres foi encontrada!");
        }

        return palavrasFiltradas;
    }
}