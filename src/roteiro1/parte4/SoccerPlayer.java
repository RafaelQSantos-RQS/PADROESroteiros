package roteiro1.parte4;

public class SoccerPlayer extends Player {
    public SoccerPlayer(String nome, RunBehavior runBehavior) {
        super(nome, runBehavior);
    }

    @Override
    public void definirTatica() {
        System.out.println(super.nome + " Trabalha em equipe !");
    }
}