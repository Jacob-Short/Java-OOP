public class Main {

    public static void main(String[] args) {
        Car mercedes = new Car();
        Car honda = new Car();
        mercedes.setModel("G63-AMG");
        honda.setModel("civic");
        System.out.println(mercedes.getModel());
        System.out.println(honda.getModel());


//        Account jacobsAccount = new Account();
//        jacobsAccount.setNumber("1");
//        jacobsAccount.setEmailAddress("j.short2@snhu.edu");
//        jacobsAccount.setPhoneNumber("503-503-5033");
//        jacobsAccount.setName("Jacob");

        Account jacobsAccount = new Account("1", 100.0, "Jacob", "j.short2@snhu.edu", "5038498572");


        jacobsAccount.deposit(50.0);
        jacobsAccount.withdrawal((100.0));
        jacobsAccount.deposit(1000.0);
        jacobsAccount.withdrawal((100.0));
        System.out.println(jacobsAccount.getEmailAddress());
        System.out.println(jacobsAccount.getPhoneNumber());
        System.out.println(jacobsAccount.getName());


    }

}
