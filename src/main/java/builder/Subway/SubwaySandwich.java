package builder.Subway;

import lombok.Data;
import java.util.Set;

@Data
public class SubwaySandwich {

    private BunType bunTyp;
    private MeatType meatType;
    private Set<Addon> addons;
    private Sauce sauce;

}
