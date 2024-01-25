package src;


public class App {
    public static void main(String[] args){
        NationalForest one = new NationalForest("Allegheny", "Pennsylvania", 513655);
        NationalForest two = new NationalForest("Angeles", "California", 661565);
        NationalForest three = new NationalForest("Angelina", "Texas", 154140);

        System.out.println(one.toLine());
        System.out.println(two.toLine());
        System.out.println(three.toLine());
}
}
