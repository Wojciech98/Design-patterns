package builder.Samochod;

import lombok.Data;

@Data
public class EngineBuilder {

    private  Engine engine;

    public EngineBuilder(){
        engine = new Engine();

        engine.setCapacity(2.0);
        engine.setFuelType(FuelType.DIESEL);
        engine.setHorsePower(159);
    }

    public EngineBuilder withHorsePower(int horsePower){
        engine.setHorsePower(horsePower);
        return this;
    }
    public Engine build(){
        return engine;
    }




}
