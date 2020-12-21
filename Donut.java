import java.util.Objects;

public class Donut extends Shorty implements DonutActions {

    Donut(String name, int weight, int height, int birthYear) {
        super(name, weight, height, birthYear);
    }
    @Override
    public String toString() {
        return this.getName() + " " + this.getBirthYear() + " года рождения ";
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Donut don = (Donut) o;
        return Objects.equals(getName(), don.getName()) &&
                Objects.equals(getBirthYear(), don.getBirthYear()) &&
                Objects.equals(getWeight(), don.getWeight()) &&
                Objects.equals(getHeight(), don.getHeight());
    }

    public void toChase(Crumb crumb) {
        System.out.println(this.getName() + " преследует " + crumb.getName() + "а");
    }
    public void becomeTired(){
        setStamina((int)(Math.random() * 50));
        System.out.println(this.getName() + " начал уставать и поэтому отставал");
    }
    public void toRun(){
        setStamina((int)(Math.random() * 10));
        System.out.println(this.getName() + " побежал за машиной");
    }
    public void toHook(){
        setStamina(-10);
        setLocation(Locations.Car);
        System.out.println(this.getName() + " прыгнул и зацепился за машину");
    }
    public void toFall(){
        setLocation(Locations.Road);
        System.out.println(this.getName() + " упал");
    }
    public class Hands{
        private boolean isHandsClenched = true;

        public void unclenchFingers(Donut donut){
            isHandsClenched = false;
            System.out.println("Пальцы на обеих руках " + donut.getName() + "а разжались");
        }
    }

    public class Eyes{
        protected int visibility = 100;

        public void loseVisibility(String name){
            visibility = 0;
            System.out.println("Способность " + name + "а видеть упала до " + visibility + "%");
        }
    }
}

