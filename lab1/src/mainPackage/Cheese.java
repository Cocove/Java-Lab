package mainPackage;

public class Cheese extends Food{

    public void consume() {
        System.out.println(this + " съеден");
    }

    public Cheese(){
        super("Сыр");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int setnum() {
        return 0;
    }

    @Override
    public int calculateCalories() {
        return 300;
    }
}
