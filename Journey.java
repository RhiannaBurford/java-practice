import java.util.List;

public class Journey {

    private int startPoint;
    private int endPoint;
    private List<User> passengers;
    private int maxPassenger;
    private boolean started;
    private User initiatedUser;

    public Journey(int startPoint, int endPoint, List<User> passengers, int maxPassenger,
        boolean started, User initiatedUser){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.passengers = passengers;
        this.maxPassenger = maxPassenger;
        this.started = started;
        this.initiatedUser = initiatedUser;
    }

    public int getStartPoint(){
        return startPoint;
    }
    public int getEndPoint(){
        return endPoint;
    }
    public List<User> getPassengers(){
        return passengers;
    }
    public int getMaxPassenger(){
        return maxPassenger;
    }
     public boolean getStarted(){
        return started;
    }
    public User getInitiatedUser(){
        return initiatedUser;
    }
    public void setStartPoint(int startPoint){
        this.startPoint = startPoint;
    }
    public void setEndPoint(int endPoint){
        this.endPoint = endPoint;
    }
    public void setPassengers(List<User> passengers){
        this.passengers = passengers;
    }
    public void setMaxPassenger(int maxPassenger){
        this.maxPassenger = maxPassenger;
    }

    public void setStarted(boolean started){
        this.started = started;
    }
    public void setInitiatedUser(User initiatedUser){
        this.initiatedUser = initiatedUser;
    }

    public void addUser(User u){
        if (passengers.size() < maxPassenger && !started){
            passengers.add(u);
        }
    }
}
