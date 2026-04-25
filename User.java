import java.util.ArrayList;


public class User {
    
    private String name;
    private String ID;
    private String membership;
    private int credits;
    private ArrayList<MediaItem> library;
    
    
    public User(String name, String ID, String membership, int credits){
        this.name = name;
        this.ID = ID;
        this.membership = membership;
        this.credits = credits;
        this.library = new ArrayList<MediaItem>();
    }

    public String getName(){ return name;}
    public String getID(){ return ID;}
    public String getMembership() { return membership;}
    public int getCredits(){ return credits;}
    public void setName(String name){ this.name = name;}
    public void setID(String ID) { this.ID = ID;}
    public void setMembership(String membership) { this.membership = membership;}
    public void setCredits(int credits){this.credits = credits;}

   public void addMedia(MediaItem m) {
        // Rule 1: Limit of 100
        // Rule 2: Unique (doesn't already contain it)
        if (library.size() < 100 && !library.contains(m)) {
            library.add(m);
        }
    }

    // 4. Remove Method
    public void removeMedia(MediaItem m) {
        library.remove(m);
    }
}
