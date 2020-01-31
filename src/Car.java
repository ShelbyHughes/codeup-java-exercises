import java.util.Date;

public class Car {
    public String make;
    public String model;
    public int year;
    public int mileage;
    private Date lastOilChange;
    static int carsOutThere = 0;
    private boolean running;

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = 0;
        this.lastOilChange = new Date();
        this.running = false;
        carsOutThere++;
    }

    public String startYourEngine(String key){
        if(key.equals("Correct")){
            this.running = true;
            return "Vrrooom!!";
        }else{
            return "....";
        }
    }

    public String drive(){
        if(this.running){
            this.mileage++;
            return "Vrooom!";
        }
        else{
            return "...";
        }
    }
}
