package vegetables.cucumber;

import vegetables.AbstractVegetable.AbstractVegetable;
import vegetables.vegetableEnum.VegetableEnum;

public class Cucumber extends AbstractVegetable {
    private Double calories = 6.6;
    private Double proteins = 7.7;
    private Double fats = 8.8;
    private Double carbs = 9.9;

    public Cucumber() {
        super(VegetableEnum.CUCUMBER);
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
