package roteiro2.parte3;

public abstract class Player {
    protected String nome;
    protected RunBehavior habilidadeCorrer; // Strategy

    public Player(String nome, RunBehavior habilidadeCorrer) {
        this.nome = nome;
        this.habilidadeCorrer = habilidadeCorrer;
    }

    // O Template Method
    public final void performCompetitionRoutine() {
        warmUp();
        definirTatica(); // Passo a ser definido pela subclasse
        estiloCompetidor();
        compete(); // Novo passo abstrato a ser definido pela subclasse
        correr(); // Passo que utiliza a Strategy
        coolDown();
    }

    private void warmUp() {
        System.out.println(this.nome + " está aquecendo.");
    }

    public void estiloCompetidor() {
        System.out.println(this.nome + " é muito competitivo!");
    }

    // Delega para a Strategy
    public void correr() {
        this.habilidadeCorrer.correr();
    }

    private void coolDown() {
        System.out.println(this.nome + " está se recuperando (cooldown).");
    }

    public void treinar() {
        System.out.println(this.nome + " executando o treino!");
    }

    // Métodos abstratos (passos do template)
    public abstract void definirTatica();
    public abstract void compete();
}