package vegetables;
import vegetables.Vegetable.Vegetable;
import vegetables.saladbuilder.SaladBuilder;
import vegetables.stockroom.StockRoom;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StockRoom newStockRoom = new StockRoom();
        SaladBuilder saladBuilder = new SaladBuilder();

        newStockRoom.addVeggies(Vegetable.BROCCOLI);
        newStockRoom.addVeggies(Vegetable.CORN);
        newStockRoom.addVeggies(Vegetable.CABBAGE);
        newStockRoom.addVeggies(Vegetable.SWEETPOTATO);
        newStockRoom.addVeggies(Vegetable.CARROT);
        newStockRoom.addVeggies(Vegetable.CAULIFLOWER);
        newStockRoom.addVeggies(Vegetable.CELERY);
        newStockRoom.addVeggies(Vegetable.CUCUMBER);

        saladBuilder.buildSalad(newStockRoom.takeSomeVegetables(new ArrayList<Vegetable>
                (Arrays.asList(Vegetable.BROCCOLI, Vegetable.CELERY, Vegetable.CABBAGE)))
        );

        System.out.println(saladBuilder.getSaladReport());

    }
}
