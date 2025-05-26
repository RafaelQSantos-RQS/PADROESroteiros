package roteiro2.parte3;

public class RunNoWay implements RunBehavior {
    @Override
    public void correr() {
        System.out.println("Não corre! Usa o intelecto.");
    }
}