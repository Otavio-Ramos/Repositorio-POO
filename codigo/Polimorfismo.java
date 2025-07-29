class Animal {
    public void fazerSom() {
        System.out.println("Este animal faz um som.");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato mia: Miau!");
    }
}

class Passaro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O pássaro canta: Piu Piu!");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        Animal[] animais = {new Cachorro(), new Gato(), new Passaro()};

        for (Animal animal : animais) {
            animal.fazerSom();
        }
    }
}
