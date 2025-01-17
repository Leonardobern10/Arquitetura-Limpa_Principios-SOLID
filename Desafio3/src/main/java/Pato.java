public class Pato implements Animal {
    @Override
    public void comer() {
        System.out.println("Comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("Dormindo...");
    }

    @Override
    public void voar() {
        System.out.println("Voando...");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando...");
    }
}