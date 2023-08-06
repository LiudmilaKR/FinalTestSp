package animals.model.pets;

import animals.model.Commands;
import animals.model.HumanFriends;
import animals.model.MarkFriends;

public class Dogs extends HumanFriends {
    
    private MarkFriends markAnimal;
    
    public Dogs(int id, String name, int yearBirthday) {
        super(id, name, yearBirthday);
        markAnimal = MarkFriends.Pets;
    }

    @Override
    public String commands() {
        Commands command1 = new Commands("сидеть!");
        Commands command2 = new Commands("лежать!");
        Commands command3 = new Commands("голос!");
        return "Я - собака, я выполняю команды: " + command1 + " " + command2 + " " + command3;
    }

    @Override
    public String toString() {
        return "Dog [animal=" + markAnimal + ", id=" + getId() + ", name=" + getName() + ", yearBirthday=" + 
            getYearBirthday() + ", age=" + getAge()+ "]";
    }
    
        
}
