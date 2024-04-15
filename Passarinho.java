class Passarinho extends Animal implements Voar {
    public Passarinho(String nome) {
        super(nome);
        this.setSom("Piu");
    }

    @Override
    public void emitirSom() {
        System.out.println("Piu");
    }

    public void voar() {
        System.out.println("Estou Voando!");
    }

    @Override
    public String toString() {
        return "Passarinho{" +
                "nome='" + nome + '\'' +
                ", som='" + som + '\'' +
                '}';
    }
}