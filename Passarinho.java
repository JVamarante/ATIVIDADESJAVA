public class Passarinho extends Animal implements Voar{
    public Passarinho(String nome){
        super(nome);
    }
    @Override
    public void emitirSom(){
        System.out.println("Piu");
    }
    public void voar(){
        System.out.println("Estou Voando!");
    }
}