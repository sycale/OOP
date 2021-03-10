package vegetables.salad;


import vegetables.AbstractVegetable.AbstractVegetable;

import java.util.ArrayList;
import java.util.HashMap;

public class Salad {
    private ArrayList<AbstractVegetable> vegetables;
    private HashMap<String, Double> completeEnergy = new HashMap<String, Double>();
    public Salad(ArrayList<AbstractVegetable> veggies) {
        vegetables = veggies;
    }
    public String buildSalad(ArrayList<AbstractVegetable> veggies) {
        this.vegetables = veggies;
        calculateCalories();
        return this.toString();
    }
    public Salad() {
    }
    private void calculateCalories() {
        for (AbstractVegetable veggie : vegetables) {
            completeEnergy.put("Fats", completeEnergy.getOrDefault("Fats", 0.) + veggie.getFats());
            completeEnergy.put("Proteins", completeEnergy.getOrDefault("Proteins", 0.) + veggie.getProteins());
            completeEnergy.put("Carbs", completeEnergy.getOrDefault("Carbs", 0.) + veggie.getCarbs());
            completeEnergy.put("Calories", completeEnergy.getOrDefault("Calories", 0.) + veggie.getCalories());
        }
    }
    public HashMap<String, Double> getEnergyMap() {
        return completeEnergy;
    }
    @Override
    public String toString() {
        String strToReturn = "";
        for (String key : completeEnergy.keySet()) {
            strToReturn += String.format("%s is %s \n", key, completeEnergy.get(key));
        }
        strToReturn += "It also contains : \n";
        for (AbstractVegetable veggie : vegetables) {
            strToReturn += String.format("%s \n", veggie.getVeggieType().name());
        }
        return strToReturn;
    }
}
