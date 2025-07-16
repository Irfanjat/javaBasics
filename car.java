
public class car {
    private String carName;
    private String model;
    private int carNumber;
    
    public car(String carName,String model,int carNumber){
        this.carName=carName;
        this.model=model;
        this.carNumber=carNumber;
        
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }
    public static void main(String[] args) {
        
        car ob1= new car("Lambo", "audi", 23432);

        System.out.println("Cars Details are bellow:");
        System.out.println("The car name is:"+ob1.getCarName());
        System.out.println("The car number is:"+ob1.getCarNumber());
        System.out.println("THe Model of this car is:"+ob1.getModel());
    }
}
