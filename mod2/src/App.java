package src;


public class App {
    public static void main(String[] args){
        NationalForest one = new NationalForest("Dixie", "Utah", 123);

        System.out.println("Forest Name: " + one.getName());
        System.out.println("Location:" + one.getLocation());
        System.out.println("Acres: " + one.getAcres());
        System.out.println("Square km: " + one.getSquareKilometers());

        System.out.println(one.toLine());

        // acres is worng, need to fix
        one.setAcres(189443);
        System.out.println("Fixed ---");
        System.out.println("Acres: " + one.getAcres());
        System.out.println("Square km: " + one.getSquareKilometers());
}
}
