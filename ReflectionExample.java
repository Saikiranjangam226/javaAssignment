import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;

public class ReflectionExample {
    public static void main(String[] args) {
        try {

            Class<?> clazz = Example.class;
            System.out.println("Fields:");
            for (Field field : clazz.getDeclaredFields()) {
                System.out.println("  " + field);
            }
            System.out.println("\nMethods:");
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println("  " + method);
            }
            System.out.println("\nConstructors:");
            for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
                System.out.println("  " + constructor);
            }
            System.out.println("\nAnnotations:");
            for (Annotation annotation : clazz.getDeclaredAnnotations()) {
                System.out.println("  " + annotation);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Example {
    private int id;
    public String name;

    public Example() {}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

