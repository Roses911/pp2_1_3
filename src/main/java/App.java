import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());
        Cat beanCat =
                applicationContext.getBean("cat", Cat.class);
        System.out.println(beanCat.getName());
        Cat beanCat1 =
                applicationContext.getBean("cat", Cat.class);
        System.out.println(beanCat.getName());
        boolean world = bean == bean1;
        System.out.println(world);
        boolean cat = beanCat == beanCat1;
        System.out.println(cat);

    }
}