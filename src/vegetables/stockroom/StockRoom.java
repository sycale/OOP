package vegetables.stockroom;

/*
    Author: Alex Sychov
 */

import vegetables.AbstractVegetable.AbstractVegetable;

import java.util.ArrayList;

public class StockRoom {
    private ArrayList<AbstractVegetable> vegetableStock = new ArrayList<AbstractVegetable>();
    private int capacity;
    @Override
    public String toString() {
        String tempStr = "";
        for (AbstractVegetable v : vegetableStock) {
            tempStr += v.toString() + " --------- \n";
        }
        return tempStr;
    }
    public ArrayList<AbstractVegetable> takeSomeVegetables(ArrayList<AbstractVegetable> veggiesToRemove) {
        vegetableStock.stream().filter((vegetable) -> veggiesToRemove.contains(vegetable));
        return (ArrayList<AbstractVegetable>) veggiesToRemove;
    }
    public StockRoom(AbstractVegetable veggie) {
        vegetableStock.add(veggie);
        capacity = vegetableStock.size();
    }
    public StockRoom(ArrayList<AbstractVegetable> veggies) {
        vegetableStock = veggies;
        capacity = vegetableStock.size();
    }
    public StockRoom() {
        capacity = 0;
    }
    public int getCapacity() {
        return capacity;
    }
    public void addVeggies(AbstractVegetable veggie) {
        vegetableStock.add(veggie);
        this.capacity += 1;
    }
}
