public class TestePolimorfismo {
    public static void main(String[] args) {
        Criatura c1 = new CriaturaFogo();
        Criatura c2 = new CriaturaAgua();

        c1.atacar(); 
        c2.atacar(); 
        c1.atacar("Explosão flamejante"); 
    }
}

