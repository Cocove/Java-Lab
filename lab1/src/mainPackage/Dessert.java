package mainPackage;

public class Dessert extends Food {

    private String component1;
    private String component2;

    @Override
    public int setnum() {
        return 10;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void consume() {
        System.out.println(this + " съеден");
    }

    public Dessert(String component1, String component2) {
        super("десерт");
        this.component1 = component1;
        this.component2 = component2;
    }

    public String getcomponent1()
    {
        return component1;
    }

    public String getcomponent2()
    {
        return component2;
    }

    @Override
    public int calculateCalories() {
        int calories = 0;
        if (component1.equals("milk")) {
            calories += 400;
        } else if (component1.equals("chocolate")) {
            calories += 1000;
        }else if(component1.equals("strawberry")){
            calories+=500;
        }
        if (component2.equals("orange")) {
            calories += 33;
        } else if (component2.equals("banana")) {
            calories += 28;
        }else if(component2.equals("kiwi")){
            calories+=50;
        }else {
            calories+= 10;
        }
        return calories;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Dessert)) return false;
        return (component1.equals(((Dessert) obj).component1) && (component2.equals(((Dessert) obj).component2)));
    }

    public String toString() {
        return super.toString() + " c добавкой '" + component1.toUpperCase() + "'" + " и '" + component2.toUpperCase() + "'";
    }
}
