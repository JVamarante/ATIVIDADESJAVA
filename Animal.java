abstract class Animal {
    protected String nome;
    protected String som;
    protected TipoAnimal tipo;

    public Animal(String nome, TipoAnimal tipo) {
        this.nome = nome;
        this.tipo = tipo;
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

    public TipoAnimal getTipo() {
        return tipo;
    }

    public abstract void emitirSom();

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", som='" + som + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}