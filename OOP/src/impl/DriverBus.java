package impl;
import devPeople.People;

public class DriverBus implements Transport,Driver {

    People people;
    String category;
    int speed=60;

    @Override
    public void setCategory(String category) {
        this.category=category;
        people=new People("Bob","Singer",20,null);
    }

    @Override
    public void go() {
        if(people!=null)
        {
            System.out.printf("Ми їдемо");
        }
        else
        {
            System.out.println("Не їдемо");
        }
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}
