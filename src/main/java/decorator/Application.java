package decorator;

public class Application {

    public static void main(String[] args) {


        MealSet set = new BasicSet();
        set = new LargeDrinkDecorator(set);
        set = new LargeDrinkDecorator(set);
        set = new LargeFriesDecorator(set);



        System.out.println(set.getParts());
        System.out.println(set.getPrice());

    }
}
