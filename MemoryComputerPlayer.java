/* Assume the existence of a HumanPlayer class that has 
getLastChoice(), which returns option selected by user in 
previous game */

import java.util.ArrayList;
import java.util.List;

public abstract class MemoryComputerPlayer extends ComputerPlayer{

    private List<String> choices = new ArrayList<>(); // use choices.size(); 

    public MemoryComputerPlayer(String name, int wins, int loss, int ties, int difficulty) {
        super(name, wins, loss, ties, difficulty);
    }

    public void saveChoice(HumanPlayer h) {
        if (choices.size() >= 10) {
            choices.remove(0); // Remove the oldest choice to keep it at 10
        }
        choices.add(h.getLastChoice());
    }
}
