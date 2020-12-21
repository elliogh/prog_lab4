import java.util.Objects;

public class Crumb extends Shorty implements CrumbActions{

    Crumb(String name, int weight, int height, int birthYear) {
        super(name, weight, height, birthYear);
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getBirthYear() + " года рождения ";
    }
    @Override
    public boolean equals(Object o){
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()){
            return false;
        }
        Crumb cr = (Crumb) o;
        return Objects.equals(getName(), cr.getName()) &&
                Objects.equals(getBirthYear(), cr.getBirthYear());
    }
    @Override
    public int hashCode (){
        return Objects.hash(getName(), getWeight(), getHeight(), getBirthYear());
    }

    public void toSuspect(Donut donut) {
        System.out.println(this.getName() + " подозревает, что " + donut.getName() + " следит за ним" );
    }

    public void tryToEscape() {
        setStamina((int)(Math.random() * 10));
        System.out.println(this.getName() +" пытается сбежать");
    }

    public void toEscape(){
        System.out.println(this.getName() + " скрылся за горизонтом");
    }

    public void askToStop(Car car){
        System.out.println(this.getName() + " увидел, едущий сзади " + car.getModel() + ", и начал махать руками");
    }

    public void toAsk(){
        System.out.println("Здравствуйте, не подвезете меня до Нееловки - спросил " + this.getName());
    }

    public void moveToTrunk(){
        setLocation(Locations.Trunk);
        System.out.println(this.getName() + " переместился в " + Locations.Trunk.getLocation());
    }

    public void findWrench(){
        this.setWeight(2);
        System.out.println(this.getName() + " нашел гаечный ключ");
    }

    public void toBeat(Donut donut){
        donut.setStamina(5);
        System.out.println(this.getName() + " начинает бить по пальцам " + donut.getName() + "а");
    }

    public void simpleAnswer1(){
        System.out.println(this.getName() + ": Все отлично!");
    }

    public void simpleAnswer2(){
        System.out.println(this.getName() + ": Я специально ехал к Вам, чтобы вы мне что-то показали");
    }

    public void toCry() {
        System.out.println(this.getName() + " заплакал от радости");
    }

    public void goFaster(){
        setStamina((int)(Math.random() * 10));
        System.out.println(this.getName() + " начал идти быстрее");
    }
    public void toSee(Donut donut){
        System.out.println(this.getName() + " увидел " + donut.getName() + "а, который подходил к " + Locations.FoodlessCity.getLocation());
    }
}
