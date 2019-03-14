package builder.Subway;

public class App {
    public static void main(String[] args) {

        SubwaySandwich sandwich = new SubwaySandwichBuilder()
                .withBunType(BunType.WHOLEMEAL)
                .withMeatType(MeatType.CHICKEN)
                .withAddon(Addon.CORN)
                .withAddon(Addon.PARMEZAN)
                .withSauce(Sauce.CHILLI)
                .build();

                System.out.println(sandwich);

    }

}
