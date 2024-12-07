
public class TesteAnimal {
    public static void main(String[] args) {
        
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal pato = new Pato();
        
        
        SomDosAnimais somDosAnimais = new SomDosAnimais();

        
        somDosAnimais.fazerSomDoAnimal(cachorro); 
        somDosAnimais.fazerSomDoAnimal(gato);    
        somDosAnimais.fazerSomDoAnimal(pato);     
    }
}