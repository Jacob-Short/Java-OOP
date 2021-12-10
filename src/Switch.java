public class Switch {
    public static void main(String[] args) {
        int loopValue = 1;
        int switchValue = 10;

        if (loopValue == 1) {
            System.out.println("Numba 1!");
        }
        else if (loopValue == 2){
            System.out.println("Numba is 2!");
        }
        else{
            System.out.println("Numa is not 1 or 2!");
        }

        switch(switchValue){
            case 11:
                System.out.println("Switch Number Is 11");
                break;

            case 12:
                System.out.println("Switch Number Is 12");

            case 7:case 8:case 9:case 10:
                System.out.println("Switch Number is 7, 8, 9, or 10!!!");
                System.out.println("And The Switch Number was " + switchValue);
            default:
                System.out.println("The switch number was not 7-12");
        }
    }
}
