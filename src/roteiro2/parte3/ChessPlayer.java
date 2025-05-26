package roteiro2.parte3;

public class ChessPlayer extends Player {
    public ChessPlayer(String nome, RunBehavior runBehavior) {
        super(nome, runBehavior);
    }

    @Override
    public void definirTatica() {
        System.out.println(super.nome + " - Domina o centro do tabuleiro");
    }

    @Override
    public void compete() {
        System.out.println(super.nome + " está jogando uma partida de xadrez.");
    }

    // O método correr() foi removido para usar a Strategy corretamente.
}