package Page16.Task1603;

public class Test {
    public static void main(String[] args) {
        ParkingSystem ps = new ParkingSystem(1,1,0);
        System.out.println(ps.addCar(1));
        System.out.println(ps.addCar(2));
        System.out.println(ps.addCar(3));
        System.out.println(ps.addCar(1));
    }
}
