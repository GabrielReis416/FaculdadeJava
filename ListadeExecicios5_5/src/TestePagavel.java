import java.util.ArrayList;
import java.util.List;

public class TestePagavel {
    public static void main(String[] args) {
        
        Empregado empregado = new Empregado("Gabriel", "123456789", 3000.00);
        Fornecedor fornecedor = new Fornecedor("Ana", "987654321", 5000.00);

        
        List<Pagavel> pagaveis = new ArrayList<>();
        pagaveis.add(empregado);
        pagaveis.add(fornecedor);

       
        for (Pagavel pagavel : pagaveis) {
            System.out.println("Pagamento: R$ " + pagavel.calcularPagamento());
        }
    }
}