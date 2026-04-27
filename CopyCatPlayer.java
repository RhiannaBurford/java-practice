import java.util.List;

public class CopyCatPlayer extends MemoryComputerPlayer{

    public CopyCatPlayer(List<String> choices, String name, int wins, int loss, int ties, int difficulty) {
        super(choices, name, wins, loss, ties, difficulty);
    }

    @Override
    public String returnChoice(){
        if (choices.size() < 2){ // I have made choices protected in the MemoryComputerPlayer class
            return "Rock";
        }
        else {
            return choices.get(choices.size() - 2);
        }
    }
}
