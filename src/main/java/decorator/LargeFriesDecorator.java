package decorator;

import java.util.HashSet;
import java.util.Set;

public class LargeFriesDecorator implements MealSet {

    private MealSet set;

    public LargeFriesDecorator(MealSet set) {
        this.set = set;
    }

    @Override
    public Set<SetParts> getParts() {
        Set<SetParts> parts = new HashSet<>(this.set.getParts());
        if (parts.contains(SetParts.SMALL_FRIES)) {
            parts.remove(SetParts.SMALL_FRIES);
            parts.add(SetParts.LARGE_FRIES);
        }
        return parts;
    }

    @Override
    public double getPrice() {
        if(this.set.getParts().contains(SetParts.LARGE_FRIES)){
            return this.set.getPrice();
        }


        return this.set.getPrice() +  1d;
    }


}
