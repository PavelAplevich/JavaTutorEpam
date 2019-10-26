package aggregation.and.composition.TaskTwo;

class Car {
    private Engine engine;
    private Wheel wheel;
    private String model;

    Car(String model){
        this.model = model;
        this.engine = new Engine();
        this.wheel = new Wheel();
    }

    void ride(){

    }

    void refuel(){

    }

    void changeWheel(){
        this.wheel = new Wheel();
    }

    void printModel(){
        System.out.println(model);
    }
}
