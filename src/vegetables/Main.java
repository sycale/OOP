package vegetables;
import vegetables.AbstractVegetable.AbstractVegetable;
import vegetables.cucumber.Cucumber;
import vegetables.saladbuilder.SaladBuilder;
import vegetables.stockroom.StockRoom;
import vegetables.tomato.Tomato;
import vegetables.vegetableFactory.VegetableEnum;
import vegetables.vegetableFactory.VegetableFactory;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        StockRoom stockRoom = new StockRoom();
        SaladBuilder saladBuilder = new SaladBuilder();
        stockRoom.fillStockRoom(VegetableEnum.GARLIC, VegetableEnum.TOMATO, VegetableEnum.CUCUMBER);

        saladBuilder.buildSalad(stockRoom.takeSomeVegetables());

        System.out.println(saladBuilder.getSaladReport());
    }
}
