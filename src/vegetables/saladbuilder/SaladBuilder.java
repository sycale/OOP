package vegetables.saladbuilder;

//import vegetables.Vegetable.Vegetable;
import vegetables.AbstractVegetable.AbstractVegetable;
import vegetables.salad.Salad;

import java.util.ArrayList;

public class SaladBuilder {
    private Salad salad;
    public SaladBuilder() {
        salad = new Salad();
    }
    public SaladBuilder(ArrayList<AbstractVegetable> veggies) {
        salad = new Salad(veggies);
    }
    public String buildSalad(ArrayList<AbstractVegetable> veggies) {
        return salad.buildSalad(veggies);
    }
    public String getSaladReport() {
        return salad.toString();
    }
}
