public class Decisions {
    public static void main(String[] args){
       int milesPerHour = 67;
       int speedLimit = 55;
       boolean knowsOfficer = false;

       if (milesPerHour > speedLimit) {
        System.out.println("Officially, you are speeding");
       }
       if (milesPerHour > speedLimit + 5 && !knowsOfficer) {
        System.out.println("You get a speeding ticker");
       }

    }

}
