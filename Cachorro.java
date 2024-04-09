public class Cachorro extends Animal implements Corrida{
    public Cachorro(String nome){
        super(nome);
        this.correr();
    }
    @Override
    public void emitirSom(){
        System.out.println("Au au");
    }

    @Override
    public void correr(){
        System.out.println("Estou Correndo!");
    }

}
