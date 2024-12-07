interface Transporte {
    void mover();
    void parar();
}


class Carro implements Transporte {
    @Override
    public void mover() {
        System.out.println("O carro está se movendo.");
    }

    @Override
    public void parar() {
        System.out.println("O carro parou.");
    }
}
class Bicicleta implements Transporte {
    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo.");
    }

    @Override
    public void parar() {
        System.out.println("A bicicleta parou.");
    }
}

class Garagem {
    
    public void adicionarTransporte(Transporte t) {
        System.out.println("Transporte adicionado à garagem.");
        t.mover(); 
        t.parar(); 
    }
}