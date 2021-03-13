package vegetables.vegetableFactory;

import vegetables.AbstractVegetable.AbstractVegetable;
import vegetables.cucumber.Cucumber;
import vegetables.garlic.Garlic;
import vegetables.onion.Onion;
import vegetables.tomato.Tomato;

public class VegetableFactory {
    public static AbstractVegetable getInstance(VegetableEnum veggie) throws Exception {
        switch(veggie) {
            case TOMATO:
                return new Tomato();
            case ONION:
                return new Onion();
            case GARLIC:
                return new Garlic();
            case CUCUMBER:
                return new Cucumber();
            default:
                throw new Exception("Cant handle this veggie type");
        }
    }
}
