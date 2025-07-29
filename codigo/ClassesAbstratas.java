abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void fazerSom();

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " late: Au Au!");
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " mia: Miau!");
    }
}

public class ClassesAbstratas {
    public static void main(String[] args) {
        Animal dog = new Cachorro("Rex");
        Animal cat = new Gato("Mimi");

        dog.fazerSom();
        dog.dormir();

        cat.fazerSom();
        cat.dormir();
    }
}
