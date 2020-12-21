public class Main {
    public static void main(String[] args) {
        Donut donut = new Donut("Пончик", 100, 20, 2002);
        Donut.Hands hands = donut.new Hands();
        Crumb crumb = new Crumb("Мякиш",70, 20, 2000);

        crumb.quitCity();
        donut.quitCity();
        donut.toChase(crumb);
        donut.becomeTired();
        crumb.toSuspect(donut);
        crumb.goFaster();
        crumb.tryToEscape();
        Car car = new Car("Mercedes-benz", (int)(1 + Math.random()) * 200,60);
        Driver driver = new Driver("Арсен");

        EngineMonitoringSystem engineSpeedControl = new EngineMonitoringSystem() {
            @Override
            public void runMonitoringSystem() {
                System.out.println(driver.toString() +" включил систему контроля оборотов двигателя");
            }
        };
        crumb.askToStop(car);
        car.toStop();
        System.out.println();

        crumb.toAsk();
        driver.toAnswer();
        System.out.println();

        car.putPassenger(crumb);
        engineSpeedControl.runMonitoringSystem();
        donut.toRun();
        try {
            car.startGoing();
        } catch (CarLiftingCapacityException e){
            System.out.println("Масса машины " + car.getCurrentLiftingCapacity() + "кг, что больше допустимой "+ car.getMaxLiftingCapacity() + "кг" );
            car.loseWheel();
            System.out.println(e.getMessage());
        }

        if (car.isGoingPossible()) {
            donut.toHook();
            crumb.moveToTrunk();
            crumb.findWrench();
            crumb.toBeat(donut);
            hands.unclenchFingers(donut);
            donut.toFall();
            driver.increaseSpeed(car);
            System.out.println();

            try {
                car.zeroException();
            } catch (zeroException e){
                System.out.println(e.getMessage());
            }

            crumb.toEscape();
            car.comeToDestination(crumb);
            System.out.println();
            Foodlesses.simpleTalk1(crumb);
            crumb.simpleAnswer1();
            Foodlesses.simpleTalk2(crumb);
            crumb.simpleAnswer2();
            Foodlesses.toTell(crumb);
            System.out.println();
            Foodlesses.toShow(crumb);
            crumb.toCry();
            Foodlesses spica = new Foodlesses("Колосок");
            spica.toKnow(crumb);
            spica.toTakeToTheAstronauts(crumb);
            Astronauts.toWantToGo();
            crumb.toSee(donut);
            Shorty.toHide();
            Shorty.toAttack(donut);
            Shorty.toPutBag(donut);
            Donut.Eyes eye = donut.new Eyes();
            eye.loseVisibility(donut.getName());
        }
    }
}
