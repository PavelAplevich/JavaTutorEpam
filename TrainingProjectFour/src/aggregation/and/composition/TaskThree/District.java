package aggregation.and.composition.TaskThree;

//Класс района.
class District {
    private City districtCentre;

    //Конструктор.
    District(City districtCentre) {
        this.districtCentre = districtCentre;
    }

    //Набор геттеров и сеттеров.
    City getDistrictCentre() {
        return districtCentre;
    }

    void setDistrictCentre(City districtCentre) {
        this.districtCentre = districtCentre;
    }

    //Переопределенный метод toString, возвращающий имя района.
    @Override
    public String toString() {
        return districtCentre.toString() + " District";
    }
}
