package app;

import configuration.ConfigClass;
import model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Objects;
import java.util.Properties;

public class AppTest {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);

        User user=context.getBean("user",User.class);

        System.out.println(user.getMainInfo());

        System.out.println("id "+user.getId());

        if (Objects.nonNull(user.getContactInfo())){
            user.getContactInfo().forEach((k,v)->{
                System.out.println(k);
                v.forEach(con->{
                    System.out.println("Contact id: "+con.getId());
                    System.out.println("Contact name: "+con.getName());
                    System.out.println("Contact info: "+con.getInfo());
                });
                System.out.println("----------------");
            });
        }

        Properties properties=user.getUserAbout();
        System.out.println("User about");
        System.out.println("User name: "+properties.get("name"));
        System.out.println("User surname: "+properties.get("surname"));
        System.out.println("User age: "+properties.get("age"));
        System.out.println("User address: "+properties.get("address"));
        ((AnnotationConfigApplicationContext) context).close();
    }
}
