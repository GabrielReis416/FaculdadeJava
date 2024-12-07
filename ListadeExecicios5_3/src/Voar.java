interface Voar {
    void decolar();
}

interface Nadar {
    void mergulhar();
}
class Pato implements Voar, Nadar {

    @Override
    public void decolar() {
        System.out.println("O pato está voando.");
    }


    @Override
    public void mergulhar() {
        System.out.println("O pato está mergulhando.");
    }
}
