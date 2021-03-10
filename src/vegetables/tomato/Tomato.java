package vegetables.tomato;

import vegetables.AbstractVegetable.AbstractVegetable;
import vegetables.vegetableEnum.VegetableEnum;

public class Tomato extends AbstractVegetable {
    private Double calories = 1.6;
    private Double proteins = 3.9;
    private Double fats = 4.1;
    private Double carbs = 5.6;

    public Tomato() {
        super(VegetableEnum.TOMATO);
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
