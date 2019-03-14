package builder.Samochod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Engine {

    private FuelType fuelType;
    private double capacity;
    private int horsePower;
}
