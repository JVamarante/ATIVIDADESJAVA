public class Main {
    public static void main(String[] args) {
        Animal a = new Cachorro("Pedro", TipoAnimal.MAMIFERO);
        Animal b = new Gato("Felipe");
        Animal c = new Passarinho("Carlos");

        Cachorro c2 = new Cachorro("Gabriel", TipoAnimal.MAMIFERO);
        Transformacao t = new Transformacao();

        t.particarCorrida(c2);
        t.fazerSom(new Cachorro(c2.getNome(), TipoAnimal.MAMIFERO));
        t.praticarVoo(new Passarinho(c.getNome()));
        t.fazerSom(new Passarinho(c.getNome()));

        // System.out.println("Informação do Cachorro: \n");
        // System.out.println("Nome do Cachorro: " + cachorro.getNome());
        // System.out.println("Som do Cachorro: "+ cachorro.getSom());

        // System.out.println("Informação do Gato: \n");
        // System.out.println("Nome do Gato: " + gato.getNome());
        // System.out.println("Som do Gato:" + gato.getSom());

        // System.out.println("Informação do Passarinho: \n");
        // System.out.println("Nome do Passarinho: " + passarinho.getNome());
        // System.out.println("Som do Passarinho: " + passarinho.getSom());

        // System.out.println("polimorfismo 1");
        // System.out.println(a.getNome());
        // a.emitirSom();
        // ((Cachorro)a).correr();

        // System.out.println("polimorfismo 2");
        // System.out.println(b.getNome());
        // b.emitirSom();
        // ((Gato)b).correr();

        //System.out.println("polimorfismo 3 ");
        //System.out.println(c.getNome());
        //((Passarinho) c).voar();

        //System.out.println("polimorfismo 3 ");
        //System.out.println(c.getNome());
        //c.emitirSom();
        //(Passarinho c).voar();

    }
}