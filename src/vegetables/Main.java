package vegetables;
import vegetables.AbstractVegetable.AbstractVegetable;
import vegetables.cucumber.Cucumber;
import vegetables.garlic.Garlic;
import vegetables.onion.Onion;
import vegetables.saladbuilder.SaladBuilder;
import vegetables.stockroom.StockRoom;
import vegetables.tomato.Tomato;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StockRoom newStockRoom = new StockRoom();
        SaladBuilder saladBuilder = new SaladBuilder();

        for(AbstractVegetable _veggie: new ArrayList<AbstractVegetable>(Arrays.asList(new Onion(), new Cucumber(), new Garlic(), new Tomato()))) {
            newStockRoom.addVeggies(_veggie);
        }

        saladBuilder.buildSalad(newStockRoom.takeSomeVegetables(new ArrayList<AbstractVegetable>(Arrays.asList(new Onion(), new Cucumber()))));

        System.out.println(saladBuilder.getSaladReport());
    }
}
