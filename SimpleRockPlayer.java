public class SimpleRockPlayer extends ComputerPlayer {

    public SimpleRockPlayer(String name, int wins, int loss, int ties, int difficulty){
        super(name, wins, loss, ties, difficulty);
    }

    @Override
    public String returnChoice(){
        return "Rock";
    }
}
