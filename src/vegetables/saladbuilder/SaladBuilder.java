package vegetables.saladbuilder;

//import vegetables.Vegetable.Vegetable;
import vegetables.AbstractVegetable.AbstractVegetable;
import vegetables.salad.Salad;
import vegetables.vegetableFactory.VegetableEnum;

import java.util.ArrayList;

public class SaladBuilder {
    private Salad salad;

    public SaladBuilder() {
        salad = new Salad();
    }

    public String buildSalad(ArrayList<AbstractVegetable> veggies) {
        return salad.buildSaladReport(veggies);
    }

    public String getSaladReport() {
        return salad.toString();
    }
}
