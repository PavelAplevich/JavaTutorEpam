package aggregation.and.composition.TaskThree;

//Класс государства.
class State {
    private String name;
    private City capital;
    private Region[] regions;
    private double area;

    //Конструктор.
    State(String name ,City capital, Region[] regions){
        this.name = name;
        this.capital = capital;
        this.regions = regions;
    }

    //Метод вывода столицы.
    void printCapital(){
        System.out.println("State capital:\n\t" + capital.toString());
    }

    //Метод вывода областей.
    void printRegions(){
        System.out.println("State regions: ");
        for(Region x: regions){
            System.out.println("\t" + x.toString());
        }
    }

    //Метод вывода площади.
    void printArea(){
        System.out.println("State area:\n\t" + area);
    }

    //Метод вывода областных центров.
    void printRegionalCenters(){
        System.out.println("State regional centers :");
        for(Region x: regions){
            System.out.println("\t" + x.getRegionalCenter());
        }
    }

    //Набор сеттеров и геттеров.
    City getCapital() {
        return capital;
    }

    void setCapital(City capital) {
        this.capital = capital;
    }

    Region[] getRegions() {
        return regions;
    }

    void setRegions(Region[] regions) {
        this.regions = regions;
    }

    double getArea() {
        return area;
    }

    void setArea(double area) {
        this.area = area;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    //Переопределенный метод toString, выводящий название государства.
    @Override
    public String toString() {
        return name;
    }

}
