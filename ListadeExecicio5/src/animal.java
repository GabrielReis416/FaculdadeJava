abstract class Animal {

    public abstract void fazerSom();
}


class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}


class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato mia");
    }
}


class Pato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O pato grasna");
    }
}


class SomDosAnimais {
    
    public void fazerSomDoAnimal(Animal animal) {
        animal.fazerSom();
    }
}

