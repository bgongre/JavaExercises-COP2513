public class Main {

    public static void main(String args[]){

        //default constructor
        Fan Fan = new Fan();
        Fan.toString();

        //Break up results
        System.out.println("*****************************");

        //specific constructor
        Fan brandNewFan = new Fan();
        brandNewFan.setOn(true);
        brandNewFan.setColor("purple");
        brandNewFan.setRadius(8);
        brandNewFan.setSpeed(Fan.MEDIUM);
        brandNewFan.toString();

    }
}
