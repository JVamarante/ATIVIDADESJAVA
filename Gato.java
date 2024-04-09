public class Gato extends Animal implements Corrida{
    public Gato(String nome){
        super(nome);
    }

    public void emitirSom(){
        System.out.println("Miau");

    }
    public void correr(){
        System.out.println("Correndo");
    }
}
