public abstract class MediaItem {

    private String name;
    private String url;
    private int baseCreditCost;
    private int numDays;

    // --- Accessors (Getters) ---
    public String getName() { return name; }
    public String getUrl() { return url; }
    public int getBaseCreditCost() { return baseCreditCost; }
    public int getNumDays() { return numDays; }

    // --- Mutators (Setters) ---
    public void setName(String name) { this.name = name; }
    public void setUrl(String url) { this.url = url; }
    public void setBaseCreditCost(int baseCreditCost) { this.baseCreditCost = baseCreditCost; }
    public void setNumDays(int numDays) { this.numDays = numDays; }

    public MediaItem(String name, String url, int baseCreditCost, int numDays){
        this.name = name;
        this.url = url;
        this.baseCreditCost = baseCreditCost;
        this.numDays = numDays;
    }

    public abstract int finalCost(int numDays);
}
