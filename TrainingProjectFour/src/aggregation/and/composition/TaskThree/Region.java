package aggregation.and.composition.TaskThree;

//Класс области.
class Region {
    private City regionalCenter;
    private District[] districts;

    //Конструктор.
    Region(City regionalCenter, District[] districts) {
        this.regionalCenter = regionalCenter;
        this.districts = districts;
    }

    //Набор геттеров и сеттеров.
    City getRegionalCenter() {
        return regionalCenter;
    }

    void setRegionalCenter(City regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    District[] getDistricts() {
        return districts;
    }

    void setDistricts(District[] districts) {
        this.districts = districts;
    }

    //Переопределенный метод toString, выводящий имя области, через её областной центр.
    @Override
    public String toString() {
        return regionalCenter.toString() + " Region";
    }
}
