import java.util.ArrayList;
import java.util.List;

public class SuperiorPlayer extends MemoryComputerPlayer{

    public SuperiorPlayer(List<String> choices, String name, int wins, int loss, int ties, int difficulty) {
        super(choices, name, wins, loss, ties, difficulty);
    }


    @Override
    public String returnChoice(){

        String lastChoice = HumanPlayer.getLastChoice();

        if (lastChoice.equals("Rock")){
            return "Paper";
        }
        else if (lastChoice.equals("Scissors")){
            return "Rock";
        }
        else {
            return "Scissors";
        }
    }
}
