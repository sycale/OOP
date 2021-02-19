package vegetables.saladbuilder;

import vegetables.Vegetable.Vegetable;
import vegetables.salad.Salad;

import java.util.ArrayList;

public class SaladBuilder {
    private Salad salad;
    public SaladBuilder() {
        salad = new Salad();
    }
    public SaladBuilder(ArrayList<Vegetable> veggies) {
        salad = new Salad(veggies);
    }
    public String buildSalad(ArrayList<Vegetable> veggies) {
        return salad.buildSalad(veggies);
    }
    public String getSaladReport() {
        return salad.toString();
    }
}
