public class Foodlesses {
    private String name;
    private static final String status = "Нееловецы";
    private static String city = "Нееловка";

    Foodlesses(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static String getStatus(){
        return status;
    }
    public static String getCity(){
        return city;
    }
    void toKnow(Crumb crumb){
        System.out.println(this.name + " узнал, что " + crumb.getName() + " приехал за гигантскими семенами");
    }
    void toTakeToTheAstronauts(Crumb crumb){
        crumb.setLocation(Locations.SpacePort);
        System.out.println(this.name + " отвел " + crumb.getName() + "а к космонавтам");
    }
    static void simpleTalk1(Crumb crumb) {
        System.out.println(status + ": Как дела," + crumb.getName() + "?");
    }
    static void simpleTalk2(Crumb crumb) {
        System.out.println(status + ": Как тебя к нам занесло," + crumb.getName() + "?");
    }
    static void toTell(Crumb crumb) {
        System.out.println("Кстати, мы посадили гигантские семена - сказали нееловцы " + crumb.getName() + "у");
    }
    static void toShow(Crumb crumb) {
        crumb.setLocation(Locations.Garden);
        System.out.println("Нееловцы отвели " + crumb.getName() + "а в " + Locations.Garden.getLocation() + " и показали первые ростки "  + Seeds.Apple.getType() + ", "
                                                                                                                                          + Seeds.Melon.getType() + ", "
                                                                                                                                          + Seeds.Peach.getType() + ", "
                                                                                                                                          + Seeds.Potato.getType() + ", "
                                                                                                                                          + Seeds.Tomato.getType() + ", которые выгладывали из-под земли"
        );
    }
}
