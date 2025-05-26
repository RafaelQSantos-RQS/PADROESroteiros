package roteiro1.parte4;

public class ChessPlayer extends Player {
    public ChessPlayer(String nome, RunBehavior runBehavior) {
        super(nome, runBehavior);
    }

    @Override
    public void definirTatica() {
        System.out.println(super.nome + " - Domina o centro do tabuleiro");
    }

    @Override
    public void correr() {
        System.out.println(super.nome + " - Não Corre ! Ele pensa !");
    }
}
