package builder.Samochod;


public class CarBuilder {

    private Car car;

    public CarBuilder() {
        car.setBodyType(BodyType.HATCHBACK);
        car.setMark("Audi");
        car.setNumbersOfDoors("5");
        car.setYearOfProduction("1998");

    }

    public CarBuilder  withBodyType(BodyType bodyType){
        car.setBodyType(bodyType);
        return  this;
    }

    public Car buildCar(){
        return car;
    }
}
