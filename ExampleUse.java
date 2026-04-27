public class ExampleUse {

    public void checkIllegal(String move) throws IllegalMoveException{

        if (!move.equals("Rock") && !move.equals("Scissors")
        && !move.equals("Paper")){
    throw new IllegalMoveException("No valid move was chosen");
    }
    }

    public void applyMove(String move){

        try {
            checkIllegal(move);
            System.out.println(move);
        }
        catch (IllegalMoveException e){
            System.out.println("ERROR! " + e.getMessage());
        }
    }
}
