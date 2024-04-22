import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro("Toto");
        Gato gato = new Gato("Ana");
        Passarinho passarinho = new Passarinho("João");

        Animal a = new Cachorro("pedro") ;
        Animal b = new Gato("Felipe");
        Animal c = new Passarinho("Carlos");

        //System.out.println("Informação do Cachorro: \n");
        //System.out.println("Nome do Cachorro: " + cachorro.getNome());
        //System.out.println("Som do Cachorro: "+ cachorro.getSom());

        //System.out.println("Informação do Gato:  \n");
        //System.out.println("Nome do Gato: " + gato.getNome());
        //System.out.println("Som do Gato:" + gato.getSom());

        //System.out.println("Informação do Passarinho:  \n");
        //System.out.println("Nome do Passarinho: " + passarinho.getNome());
        //System.out.println("Som do Passarinho: " + passarinho.getSom());

        System.out.println("polimorfismo 1");
        System.out.println(a.getNome());
        a.emitirSom();
        ((Cachorro)a).correr();

        System.out.println("polimorfismo 2");
        System.out.println(b.getNome());
        b.emitirSom();
        ((Gato)b).correr();

        System.out.println("polimorfismo 3 ");
        System.out.println(c.getNome());
        c.emitirSom();
        ((Passarinho)c).voar();



    }
}
