public class Empregado {
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    // 
    public Empregado(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        
        this.salarioMensal = salarioMensal > 0 ? salarioMensal : 0.0;
    }

    
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    
    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    
    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0.0;
        }
    }

        public double getSalarioAnual() {
        return salarioMensal * 12;
    }

    
    public void aumentarSalario() {
        salarioMensal *= 1.10;
    }

    public static void main(String[] args) {
        
        Empregado empregado1 = new Empregado("Ana", "Silva", 3000.0);
        Empregado empregado2 = new Empregado("Carlos", "Oliveira", 2500.0);

        
        System.out.printf("Salário anual de %s %s: R$ %.2f%n",
                empregado1.getPrimeiroNome(), empregado1.getSobrenome(), empregado1.getSalarioAnual());
        System.out.printf("Salário anual de %s %s: R$ %.2f%n",
                empregado2.getPrimeiroNome(), empregado2.getSobrenome(), empregado2.getSalarioAnual());

        
        empregado1.aumentarSalario();
        empregado2.aumentarSalario();

        
        System.out.printf("Salário anual de %s %s após aumento: R$ %.2f%n",
                empregado1.getPrimeiroNome(), empregado1.getSobrenome(), empregado1.getSalarioAnual());
        System.out.printf("Salário anual de %s %s após aumento: R$ %.2f%n",
                empregado2.getPrimeiroNome(), empregado2.getSobrenome(), empregado2.getSalarioAnual());
    }
}