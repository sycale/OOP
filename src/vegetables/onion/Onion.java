package vegetables.onion;

import vegetables.AbstractVegetable.AbstractVegetable;
import vegetables.vegetableFactory.VegetableEnum;

public class Onion extends AbstractVegetable {
    private Double calories = 1.1;
    private Double proteins = 2.2;
    private Double fats = 3.3;
    private Double carbs = 4.4;

    public Onion() {
        super(VegetableEnum.ONION);
    }

    @Override
    public Double getCarbs() {
        return carbs;
    }

    @Override
    public Double getProteins() {
        return proteins;
    }

    @Override
    public Double getFats() {
        return fats;
    }

    @Override
    public Double getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return String.format("fats - %s, proteins - %s, calories - %s, carbs - %s", this.fats, this.proteins, this.calories, this.carbs);
    }
}
