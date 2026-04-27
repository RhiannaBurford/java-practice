public abstract class ComputerPlayer {
    
    private String name;
    private int wins;
    private int loss;
    private int ties;
    private int difficulty;

    public ComputerPlayer(String name, int wins, int loss, int ties, int difficulty){
        this.name = name;
        this.wins = wins;
        this.loss = loss;
        this.ties = ties;
        this.difficulty = difficulty;
    }

    public String getName(){return name;}
    public int getWins(){return wins;}
    public int getLoss(){return loss;}
    public int getTies(){return ties;}
    public int getDifficulty(){return difficulty;}
    public void setName(String name){this.name = name;}
    public void setWins(int wins){this.wins = wins;}
    public void setLoss(int loss){this.loss = loss;}
    public void setTies(int ties){this.ties = ties;}
    public void setDifficulty(int difficulty){this.difficulty = difficulty;}
    

    public abstract String returnChoice();
}
