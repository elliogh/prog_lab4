public class Astronauts {
    private static final String status = "Космонавты";

    public static String getStatus() {
        return status;
    }
    protected static void toWantToGo(){
        System.out.println(status + " хотели отправиться в путь");
    }
}
