package vegetables.AbstractVegetable;

import vegetables.vegetableEnum.VegetableEnum;

public abstract class AbstractVegetable {

    public AbstractVegetable(VegetableEnum veggieType) {
        this.vegetableType = veggieType;
    }
    VegetableEnum vegetableType;

    public VegetableEnum getVeggieType() {
        return this.vegetableType;
    }

    public abstract Double getCarbs();
    public abstract Double getProteins();
    public abstract Double getFats();
    public abstract Double getCalories();
}
