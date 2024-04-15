public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Toto");
        Gato gato = new Gato("Ana");
        Passarinho passarinho = new Passarinho("João");

        System.out.println("Nome do Cachorro: " + cachorro.getNome());
        System.out.println("Som do Cachorro: " + cachorro.getSom());

        System.out.println("Nome do Gato: " + gato.getNome());
        System.out.println("Som do Gato:" + gato.getSom());
        gato.correr();

        System.out.println("Nome do Passarinho: " + passarinho.getNome());
        System.out.println("Som do Passarinho: " + passarinho.getSom());
        passarinho.voar();
    }
}
