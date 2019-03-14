package builder.Subway;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Data
public class SubwaySandwichBuilder {


    private SubwaySandwich sandwich;
    public SubwaySandwichBuilder(){
        sandwich = new SubwaySandwich();

        sandwich.setAddons(new HashSet<Addon>());
        sandwich.setBunTyp(BunType.STANDARD);
        sandwich.setMeatType(MeatType.CHICKEN);
        sandwich.setSauce(Sauce.CHILLI);
    }
    public SubwaySandwichBuilder withBunType(BunType type){
        sandwich.setBunTyp(type);
        return this;
    }
    public SubwaySandwichBuilder withAddon(Addon addon){
        sandwich.getAddons().add(addon);
        return  this;
    }
    public SubwaySandwichBuilder withAddons(Set<Addon> addons){
        sandwich.setAddons(addons);
        return this;
    }
    public SubwaySandwichBuilder withMeatType(MeatType meatType){
        sandwich.setMeatType(meatType);
        return this;
    }
    public SubwaySandwichBuilder withSauce(Sauce sauce){
        sandwich.setSauce(sauce);
        return this;
    }
    public SubwaySandwich build(){
        return sandwich;
    }

}
