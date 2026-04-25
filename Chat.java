import java.util.List;

public class Chat {

    /* Assume a GPSPoint object exists that holds the longitude and
    latitude of a location */

    /* Assume a User class exists - username + current location as
    GPSPoint object, appropriate accessors */

    private List<User> users;
    private String ID;
    private GPSPoint area;
    private double distance;

    public Chat(List<User> users, String ID, GPSPoint area){
        // Could include a check for 6 digit ID
        // Maybe add some validifcation to improve the design
        this(users, ID, area, 10.0);
    }

    public Chat(List<User> users, String ID, GPSPoint area, double distance){
        this.users = users;
        this.ID = ID;
        this.area = area;
        this.distance = distance;
    }

    public List<User> getUsers(){
        return users;
    }
    public String getID(){
        return ID;
    }
    public GPSPoint getArea(){
        return area;
    }
    public double getDistance(){
        return distance;
    }
    public void setUsers(List<User> user){
        this.users = users;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public void setArea(GPSPoint area){
        this.area = area;
    }
    public void setDistance(double distance){
        this.distance = distance;
    }
}
