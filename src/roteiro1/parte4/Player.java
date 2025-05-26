package roteiro1.parte4;

public abstract class Player {
    protected String nome;
    protected RunBehavior habilidadeCorrer;

    public Player(String nome, RunBehavior habilidadeCorrer) {
        this.habilidadeCorrer = habilidadeCorrer;
        this.nome = nome;
    }

    public void treinar() {
        System.out.println(this.nome + " Executando o treino !");
    }

    public void estiloCompetidor() {
        System.out.println(this.nome + " Muito competitivo !");
    }

    public void correr() {
        this.habilidadeCorrer.correr();
    }

    public abstract void definirTatica();
}