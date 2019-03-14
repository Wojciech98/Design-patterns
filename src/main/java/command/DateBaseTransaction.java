package command;

import java.util.ArrayList;
import java.util.List;

public class DateBaseTransaction {
    private List<DateBaseOpration> oprations = new ArrayList<>();

    public void addOperation(DateBaseOpration opration) {
        oprations.add(opration);


    }

    public void commit() {

        oprations.stream().sorted((elem1,elem2)->{
            System.out.println(elem1);
            System.out.println(elem2);
            return 1;
        });
        oprations.forEach((opration) -> opration.exrcute());



        for(DateBaseOpration opration : oprations ){
            if(!opration.exrcute()){
                break;
            }
        }

    }
}
