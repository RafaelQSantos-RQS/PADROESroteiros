// parte4/TesteJogo.java
package roteiro2.parte3;

public class TesteJogo {
    public static void main(String[] args) {
        RunBehavior correRapido = new RunFast();
        RunBehavior naoCorre = new RunNoWay();

        System.out.println("--- Dia de Competição do Jogador de Tenis ---");
        Player guga = new TennisPlayer("Gustavo Kuerten", correRapido);
        guga.performCompetitionRoutine();

        System.out.println("\n******************\n");

        System.out.println("--- Dia de Competição do Jogador de Futebol ---");
        Player ronaldo = new SoccerPlayer("Ronaldinho Gaucho", correRapido);
        ronaldo.performCompetitionRoutine();

        System.out.println("\n******************\n");

        // Exemplo com o jogador de Xadrez usando a nova estrutura
        System.out.println("--- Dia de Competição do Jogador de Xadrez ---");
        Player kasparov = new ChessPlayer("Kasparov", naoCorre);
        kasparov.performCompetitionRoutine();

        System.out.println("\n******************\n");
    }
}