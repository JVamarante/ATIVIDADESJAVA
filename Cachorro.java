class Cachorro extends Animal implements Corrida {
    public Cachorro(String nome, TipoAnimal tipo) {
        super(nome, tipo);
        this.setSom("Au au");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    public void correr() {
        System.out.println("Cachorro está Correndo");
    }
}
