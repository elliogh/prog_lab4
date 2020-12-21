public class Car {
    private String model;
    private final int maxSpeed;
    private int speed;
    private static final int maxLiftingCapacity = 4000;
    private int currentLiftingCapacity = 2100;
    private boolean isGoingPossible;
    private int numberOfWheels = 4;

    Car(String model, int maxSpeed, int speed){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public static int getMaxLiftingCapacity() {
        return maxLiftingCapacity;
    }

    public int getCurrentLiftingCapacity() {
        return currentLiftingCapacity;
    }

    public boolean isGoingPossible() {
        return isGoingPossible;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void zeroException() throws zeroException {
        int a = (int)(Math.round(Math.random()+1));
        if (a!=0) {
            this.speed += speed / a;
        }
        else {
            throw new zeroException("zeroException");
        }
    }
    void comeToDestination(Crumb crumb) {
        crumb.setLocation(Locations.FoodlessCity);
        System.out.println(this.model + ", в котором ехал " + crumb.getName() + ", прибыл в " + Locations.FoodlessCity.getLocation());
    }
    public static class Drawing{
        public static int getMaxLiftingCapacity(){
            return maxLiftingCapacity;
        }
    }
    public void toStop(){
        this.speed = 0;
        System.out.println("Машина остановилась");
    }
    public void putPassenger(Crumb crumb){
        crumb.setLocation(Locations.Car);
        this.currentLiftingCapacity += crumb.getWeight();
        System.out.println(crumb.getName() +" залез в машину");
    }
    public void startGoing() throws CarLiftingCapacityException{
        if (this.currentLiftingCapacity < this.maxLiftingCapacity) {
            isGoingPossible = true;
            this.speed += (int)(Math.random() * 100);
            System.out.println("Машина начала движение и разогналась до " + this.speed + " км/ч");
        }
        else {
            isGoingPossible = false;
            throw new CarLiftingCapacityException("Машина не может начать движение");
        }
    }
    public void loseWheel(){
        this.numberOfWheels -= 1;
        System.out.println(this.model + " потеял колесо");
    }
    public void validateCar(){
        class CarProperties{
            protected int numberOfHeadlights;
            protected int numberOfBackLights;
            protected String carNumber;

            public CarProperties(String carNumber){
                this.numberOfHeadlights = 2;
                this.numberOfBackLights = 2;
                this.carNumber = carNumber;
            }

            public int getNumberOfHeadlights(){
                return numberOfHeadlights;
            }

            public int getNumberOfBackLights(){
                return numberOfBackLights;
            }

            public String getCarNumber(){
                return carNumber;
            }

            public void setCarNumber(String carNumber){
                this.carNumber = carNumber;
            }
        }
    }
}

class CarLiftingCapacityException extends Exception {
    public CarLiftingCapacityException(String message) {
        super(message);
    }
}
class zeroException extends RuntimeException{
    public zeroException(String message){
        super(message);
    }
}