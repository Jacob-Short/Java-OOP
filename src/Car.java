

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        // can do toLowerCase() as well or other validation
            // as a pro to the setter ( ESCAPSULATION)
        if (model.equals("G63-AMG") || model.equals("civic")) {
            this.model = model;
        }
        else {
            this.model = "N/A";
        }
    }

    public String getModel(){
        return this.model;
    }
}




