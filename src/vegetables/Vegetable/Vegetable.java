package vegetables.Vegetable;

public enum Vegetable {
    GARLIC(6.0, 30, 0.5, 149),
    ONION(1.1, 9, 0.1, 40),
    CABBAGE(1.3, 6, 0.1, 25),
    BROCCOLI(2.8, 7, 0.4, 34),
    CAULIFLOWER(1.8, 5, 0.3, 25),
    CUCUMBER(0.6, 3.6, 0.1, 16),
    PUMPKIN(1, 4.2, 0.1, 25),
    ZUCCHINI(1.2, 3.1, 0.3, 17),
    CARROT(0.9, 10, 0.2, 41),
    CELERY(0.7, 3, 0.2, 16),
    RADISH(0.7, 3.4, 0.1, 16),
    POTATO(2, 17, 0.1, 77),
    SWEETPOTATO(1.6, 20, 0, 86),
    CORN(3.3, 18.7, 1.3, 86),
    PARSLEY(3.7, 8.1, 0, 45),
    PEAS(5.4, 14.4, 0.4, 81),
    TOMATO(0.6, 3.6, 0.1, 16);

    private final double proteins;
    private final double carbohydrates;
    private final double fats;
    private final double calories;

    Vegetable(double proteins, double carbs, double fats, double cal) {
        this.proteins = proteins;
        this.carbohydrates = carbs;
        this.fats = fats;
        this.calories = cal;
    }
    public double getProteins() {
        return this.proteins;
    }
    public double getCarbs() {
        return this.carbohydrates;
    }
    public double getFats() {
        return this.fats;
    }
    public double getCalories() {
        return this.calories;
    }
    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s is %s \n", proteins, carbohydrates, fats, calories, this.name());
    }
}
