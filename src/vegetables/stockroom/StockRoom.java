package vegetables.stockroom;

/*
    Author: Alex Sychov
*/

import vegetables.AbstractVegetable.AbstractVegetable;
import vegetables.vegetableFactory.VegetableEnum;
import vegetables.vegetableFactory.VegetableFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.stream.Collectors;

public class StockRoom {
    private EnumMap<VegetableEnum, AbstractVegetable> vegetableStock = new EnumMap<VegetableEnum, AbstractVegetable>(VegetableEnum.class);

    private int capacity;

    @Override
    public String toString() {
        String tempStr = "";
        for (AbstractVegetable v : vegetableStock.values()) {
            tempStr += v.toString() + " --------- \n";
        }
        return tempStr;
    }

    public void fillStockRoom(VegetableEnum ...veggies) {
        for(VegetableEnum veggie : veggies) {
            try {
                vegetableStock.put(veggie, VegetableFactory.getInstance(veggie));
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public ArrayList<AbstractVegetable> takeSomeVegetables(VegetableEnum ...veggies) {
        return (ArrayList<AbstractVegetable>) vegetableStock.values().stream().filter((veggie) -> Arrays.asList(veggies).contains(veggie.getVeggieType())).collect(Collectors.toList());
    }

    public StockRoom() {
        capacity = 0;
    }

    public int getCapacity() {
        return capacity;
    }
}
