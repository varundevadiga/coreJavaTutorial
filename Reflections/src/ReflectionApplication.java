import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApplication {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Car car = new Car("Hyundai creta",1);
        System.out.println(car.getAgeOfCar());
        System.out.println(car.getName());
        Field[] res = car.getClass().getDeclaredFields();
        for(Field result : res) {
            if(result.getName().equals("name")) {
                result.setAccessible(true);
                result.set(car,"alto 800");
            }
        }
        System.out.println(car.getName());

        var methodNames = car.getClass().getDeclaredMethods();
        for(Method method : methodNames) {
            //System.out.println(method.getName());
            method.setAccessible(true);
            if(method.getName().equals("getPrivateStaticCar"))
                method.invoke(null);
        }
    }
}
