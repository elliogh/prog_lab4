public enum Locations {
    Road("Дорога"),
    Car("Машина"),
    Trunk("Багажник"),
    FoodlessCity("Нееловка"),
    Garden("Сад"),
    SpacePort("Космодром"),
    Nowhere("Пустота")
    ;
    private String location;
    Locations(String location){
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
}
