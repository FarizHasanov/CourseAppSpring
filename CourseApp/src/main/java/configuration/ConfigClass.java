package configuration;

import model.User;
import model.UserContact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.*;

@Configuration
public class ConfigClass {

    @Bean(name = "user",initMethod = "start")
    @Scope("singleton")
    public User user() {
        User user = new User();
        user.setId(1);

        Map<String, List<UserContact>> contactInfo= new HashMap<>();
        List<UserContact> contacts=new ArrayList<>();
        UserContact userContactMobileHome=new UserContact(1,"mobile","0125434654");
        contacts.add(userContactMobileHome);
        contactInfo.put("mobile",contacts);
        user.setContactInfo(contactInfo);

        Properties properties=new Properties();
        properties.put("name","Fariz");

        user.setUserAbout(properties);
        return user;
    }

    @Bean
    public UserContact getContact(){
        UserContact userContactmobileHome=new UserContact(1,"main","9919");
        return userContactmobileHome;
    }
}
