package devPeople;
import devCat.Cat;

public class Sportsman extends People{

    private String typeSport;
    public Sportsman(String name, String surname, int age, Cat cat,String typeSport) {
        super(name, surname, age, cat);
        this.typeSport=typeSport;
    }

    public String getTypeSport() {
        return typeSport;
    }

    public void setTypeSport(String typeSport) {
        this.typeSport = typeSport;
    }

    @Override
    public String toString() {
        return super.toString()+",Тип-"+typeSport;
    }
}
