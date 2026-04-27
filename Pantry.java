import java.util.List;

public class Pantry {

    private List<Ingredient> ings;

    public Pantry(List<Ingredient> ings){
        this.ings = ings;
    }

    public void addNewIngredients(Ingredient ing){

        // Check the ingredient is not currently in list

        boolean inList = false;

        for (int i = 0; i < ings.size(); i++){
            Ingredient current = ings.get(i);
            if (ing.getName().equals(current.getName())
            && ing.getUnit().equals(current.getUnit())
        && ing.getAmount() == current.getAmount()){
            inList = true;

        }

        if (!inList){
            ings.add(ing);
        }

        }
    }


    public void removeIngredients(Ingredient ing){

        for (int i = 0; i < ings.size(); i++){
            Ingredient current = ings.get(i);
            if (ing.getName().equals(current.getName())
            && ing.getUnit().equals(current.getUnit())
            && ing.getAmount() == current.getAmount()){
                ings.remove(ing);

        }
        }
    }
}


