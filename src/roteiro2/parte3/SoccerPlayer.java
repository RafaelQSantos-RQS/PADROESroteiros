package roteiro2.parte3;

public class SoccerPlayer extends Player {
    public SoccerPlayer(String nome, RunBehavior runBehavior) {
        super(nome, runBehavior);
    }

    @Override
    public void definirTatica() {
        System.out.println(super.nome + " - Trabalha em equipe!");
    }

    @Override
    public void compete() {
        System.out.println(super.nome + " está jogando uma partida de futebol.");
    }
}