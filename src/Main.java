public class Main {

    public static void main(String[] args){
        Car mercedes = new Car();
        Car honda = new Car();
        mercedes.setModel("G63-AMG");
        honda.setModel("civic");
        System.out.println(mercedes.getModel());
        System.out.println(honda.getModel());
    }

}
