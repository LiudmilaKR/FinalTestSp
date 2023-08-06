package animals.view.menuPoints;

import animals.view.View;
import java.util.ArrayList;

public class PrintAll implements MenuPoint {

    @Override
    public void execute(View console) {
        console.printAllFriends();
    }

    @Override
    public String toString() {
        return "Печать списка друзей человека";
    }
    
}
