abstract class Animal {
    protected String nome;
    protected String som;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public abstract void emitirSom();

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", som='" + som + '\'' +
                '}';
    }
}
