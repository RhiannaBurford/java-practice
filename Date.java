public class Date {
    // Attributes
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year){
        this.month = (month > 0 && month < 13) ? month : 1;
        this.day = (day > 0 && day < 32) ? day : 1;
        this.year = year;
    }

    public void setMonth(int month){
        this.month = (month > 0 && month < 13) ? month : 1;
    }
    public void setDay(int day){
        this.day = (day > 0 && day < 32) ? day : 1; // Generic input validation, not 100% correct
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getMonth(){
        return this.month;
    }
    public int getDay(){
        return this.day;
    }
    public int getYear(){
        return this.year;
    }

    public void displayDate(){
        System.out.println(month + "/" + day + "/" + year);
    }
}
