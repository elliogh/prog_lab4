interface CrumbActions {
    void toSuspect(Donut donut);
    void tryToEscape();
    void toEscape();
    void simpleAnswer1();
    void simpleAnswer2();
    void toCry();
}
interface DonutActions {
    void toChase(Crumb crumb);
}