public class Driver {
    protected String name;
    protected String status = "Водитель";

    Driver(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return this.status + " " + this.name;
    }
    protected void toAnswer(){
        System.out.println(this.name + ": Конечно, залезай!");
    }
    protected void increaseSpeed (Car car) {
        car.setSpeed(150);
        System.out.println(toString() + " прибавил скорость");
    }
}
