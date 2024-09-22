import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondHelloWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("HW Beans: " + (helloWorldBean == secondHelloWorldBean));
        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat secondCatBean = (Cat) applicationContext.getBean("cat");
        System.out.println("Cat beans: " + (catBean == secondCatBean));
    }
}