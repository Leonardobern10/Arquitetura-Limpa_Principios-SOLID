public class Cachorro implements Animal {
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
        // Cachorros não voam! Violação aqui
        throw new UnsupportedOperationException("Cachorros não voam");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando...");
    }
}