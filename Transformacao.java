class Transformacao {
    public void fazerSom(Animal a) {
        System.out.println("Fazendo som: " + a.getNome());
        a.emitirSom();
    }

    public void particarCorrida(Corrida inter) {
        System.out.println("Participando de corrida: " + ((Animal) inter).getNome());
        inter.correr();
    }

    public void praticarVoo(Voar v) {
        System.out.println("Praticando voo: " + ((Animal) v).getNome());
        v.voar();
    }
}