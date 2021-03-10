package vegetables.garlic;

import vegetables.AbstractVegetable.AbstractVegetable;
import vegetables.vegetableEnum.VegetableEnum;

public class Garlic extends AbstractVegetable {
    private Double calories = 5.4;
    private Double proteins = 7.4;
    private Double fats = 3.5;
    private Double carbs = 0.6;

    public Garlic() {
        super(VegetableEnum.GARLIC);
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
