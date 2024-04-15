public final class Passarinho extends Animal implements Voar {
    public Passarinho(String nome) {
        super(nome, TipoAnimal.AVE);
        this.setSom("Piu");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu");
    }

    public void voar() {
        System.out.println("Estou Voando!");
    }
}