public class Main {

    public static void main(String[] args) {

        // car exercise

        Car mercedes = new Car();
        Car honda = new Car();
        mercedes.setModel("G63-AMG");
        honda.setModel("civic");
        System.out.println(mercedes.getModel());
        System.out.println(honda.getModel());


        // account exercise

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

        // vip person exercise

        VipPerson newPerson = new VipPerson();
        System.out.println("no params");
        System.out.println(newPerson.getName());

        VipPerson newPerson2 = new VipPerson("new person", 25000.00);
        System.out.println("two params");
        System.out.println(newPerson2.getName());

        VipPerson newPerson3 = new VipPerson("new person 3", 1000000.00, "newperson@email.com");
        System.out.println("three params");
        System.out.println(newPerson3.getName());

        // animals exercise
        Animal animal1 = new Animal("Animal1", 1, 1, 5, 5);

        Dog dog1 = new Dog("Lab", 8, 15, 2, 4, 1, 20, "Glossy Black");

        dog1.eat();
        dog1.walk();
        dog1.run();


    }

}
