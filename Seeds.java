enum Seeds {
    Apple("яблок"),
    Melon("арбузов"),
    Peach("персиков"),
    Potato("картошки"),
    Tomato("помидоров"),
    ;
    private String type;
    Seeds(String type){
        this.type = type;
    }
    protected String getType(){
        return type;
    }
}
