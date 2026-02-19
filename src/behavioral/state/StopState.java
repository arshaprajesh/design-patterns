package behavioral.state;

public class StopState implements State{
    @Override
    public void handle(){
        System.out.println("Machine is in STOP state");
    }
}
