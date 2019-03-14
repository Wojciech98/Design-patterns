package builder.Samochod;

public class App {
    public static void main(String[] args) {


        Car BMWm4 = new CarBuilder()
                .withBodyType(BodyType.HATCHBACK)
                .buildCar();

        Engine silnikDisel = new EngineBuilder()
                .withHorsePower(2000)
                .build();
        Car BMWx5 = new CarBuilder()
                .withBodyType(BodyType.HATCHBACK)
                .buildCar();






    }
}
