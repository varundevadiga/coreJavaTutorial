public class Car {
    private final String name;
    private int ageOfCar;

    public Car(String name, int ageOfCar) {
        this.name = name;
        this.ageOfCar = ageOfCar;
    }

    public String getName() {
        return name;
    }

    public int getAgeOfCar() {
        return ageOfCar;
    }

    public void setAgeOfCar(int ageOfCar) {
        this.ageOfCar = ageOfCar;
    }

    public void getCarName() {
        System.out.println("Heyy this is Ferari");
    }

    private void getMyPrivateCarName() {
        System.out.println("Heyy how can u check my private car, anyways u tried accessing it , it's Porsche");
    }

    public static void getPublicStaticCar() {
        System.out.println("this is public static car");
    }

    private static void getPrivateStaticCar() {
        System.out.println("this is private static car");
    }
}
