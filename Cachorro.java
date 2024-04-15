public final class Cachorro extends Animal implements Corrida {
    public Cachorro(String nome) {
        super(nome, TipoAnimal.MAMIFERO);
        this.setSom("Au au");
        this.correr();
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    @Override
    public void correr() {
        System.out.println("Estou Correndo!");
    }
}