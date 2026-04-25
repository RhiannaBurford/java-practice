public class MethodTestQ4 {

    public void logActivity(User user, MediaItem media){
        String name = media.getName();
        switch(name){
            case "Book":
                System.out.println("A user reads a book");
                break;
            case "Comic":
                System.out.println("A user reads a comic");
                break;
            case "Movie":
                System.out.println("A user watches a movie");
                break;
            case "Album":
                System.out.println("A user listens to an album");
                break;
            default:
                System.out.println("None of above.");
                break;
        }
    }
}
