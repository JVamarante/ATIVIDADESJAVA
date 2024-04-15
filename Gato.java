class Gato extends Animal implements Corrida {
    public Gato(String nome) {
        super(nome);
        this.setSom("Miau");
    }

    public void emitirSom() {
        System.out.println("Miau");

    }

    public void correr() {
        System.out.println("Correndo");
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", som='" + som + '\'' +
                '}';
    }
}
