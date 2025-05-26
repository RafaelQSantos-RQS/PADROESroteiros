package roteiro2.parte3;

public class TennisPlayer extends Player {
    public TennisPlayer(String nome, RunBehavior runBehavior) {
        super(nome, runBehavior);
    }

    @Override
    public void definirTatica() {
        System.out.println(super.nome + " - Rebate a bola por cima do oponente");
    }

    @Override
    public void compete() {
        System.out.println(super.nome + " está jogando uma partida de tênis.");
    }
}
