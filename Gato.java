public final class Gato extends Animal implements Corrida {
    public Gato(String nome) {
        super(nome, TipoAnimal.MAMIFERO);
        this.setSom("Miau");
    }

    public void emitirSom() {
        System.out.println("Miau");
    }

    public void correr() {
        System.out.println("Correndo");
    }
}