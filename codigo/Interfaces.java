interface Voar {
    void voar();
}

interface Nadar {
    void nadar();
}

abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void fazerSom();
}

class Pato extends Animal implements Voar, Nadar {
    public Pato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " diz: Quack!");
    }

    @Override
    public void voar() {
        System.out.println(nome + " está voando.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando.");
    }
}

class Cachorro extends Animal implements Nadar {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(nome + " late: Au Au!");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " está nadando.");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Pato pato = new Pato("Donald");
        Cachorro cachorro = new Cachorro("Rex");

        pato.fazerSom();
        pato.voar();
        pato.nadar();

        cachorro.fazerSom();
        cachorro.nadar();
    }
}
