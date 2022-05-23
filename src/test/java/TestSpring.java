import Model.User;
import Service.CalculateService;
import Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void testSpring(){
        // 1、获取工厂
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        // 2、通过工厂类获得对象
        UserService userService = (UserService)act.getBean("userService");
        // 3.调用方法
        userService.print();

        // 2、通过工厂类获得对象
        User user = (User)act.getBean("user");
        System.out.println(user);
        CalculateService calculateService = (CalculateService) act.getBean("calculateService");
        // 3.调用方法
        int result = calculateService.add(1, 2);
        System.out.println("result:" + result);
    }

}
