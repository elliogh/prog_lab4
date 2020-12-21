abstract class Shorty {
    private String name;
    private int weight;
    private int height;
    private int birthYear;
    private int stamina = 100;
    static private String  status = "Коротышки";
    private Locations location;

    Shorty(String name, int weight, int height, int birthYear) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.birthYear = birthYear;
    }

    public Locations getLocation() {
        return location;
    }

    public void setLocation(Locations location) {
        this.location = location;
    }

    public String getName(){
        return name;
    }
    public String getStatus(){
        return status;
    }
    public int getWeight(){
        return weight;
    }
    public int getHeight(){
        return height;
    }
    public int getBirthYear(){
        return birthYear;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina -= stamina;
    }

    public void setWeight(int weight) {
        this.weight += weight;
    }

    void quitCity(){
        setLocation(Locations.Road);
        System.out.println(this.name + " вышел из города");
    }
    static void toHide(){
        System.out.println(status + " спрятались за забором");
    }
    static void toAttack(Donut donut){
        donut.setStamina(5);
        System.out.println(status + " напали на " + donut.getName() + "а");
    }
    static void toPutBag(Donut donut){
        donut.setLocation(Locations.Nowhere);
        System.out.println("Кто-то надел мешок на голову " + donut.getName() + "у");
    }
}
