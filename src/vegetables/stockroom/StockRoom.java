package vegetables.stockroom;

/*
    Author: Alex Sychov
 */

import vegetables.Vegetable.Vegetable;

import java.util.ArrayList;

public class StockRoom {
    private ArrayList<Vegetable> vegetableStock = new ArrayList<Vegetable>();
    private int capacity;
    @Override
    public String toString() {
        String tempStr = "";
        for (Vegetable v : vegetableStock) {
            tempStr += v.toString() + " --------- \n";
        }
        return tempStr;
    }
    public ArrayList<Vegetable> takeSomeVegetables(ArrayList<Vegetable> veggiesToRemove) {
        vegetableStock.stream().filter((vegetable) -> veggiesToRemove.contains(vegetable));
        return (ArrayList<Vegetable>) veggiesToRemove;
    }
    public StockRoom(Vegetable veggie) {
        vegetableStock.add(veggie);
        capacity = vegetableStock.size();
    }
    public StockRoom(ArrayList<Vegetable> veggies) {
        vegetableStock = veggies;
        capacity = vegetableStock.size();
    }
    public StockRoom() {
        capacity = 0;
    }
    public int getCapacity() {
        return capacity;
    }
    public void addVeggies(Vegetable veggie) {
        vegetableStock.add(veggie);
        this.capacity += 1;
    }
}
