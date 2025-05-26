package roteiro1.parte4;

public class TennisPlayer extends Player {
    public TennisPlayer(String nome,RunBehavior runBehavior) {
        super(nome,runBehavior);
    }

    @Override
    public void definirTatica() {
        System.out.println(super.nome + " Rebate a bola por cima do oponente");
    }
}
