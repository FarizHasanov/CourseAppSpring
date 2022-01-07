package model;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class User {

    private Integer id;
    private Map<String, List<UserContact>> contactInfo;
    private Properties userAbout;

    @Autowired
    private UserContact mainInfo;

    public void start() {
        System.out.println("run before......");
    }

    public void end() {
        System.out.println("run after.......");
    }

    public User() {

    }

    public User(Integer id, Map<String, List<UserContact>> contactInfo, Properties userAbout, UserContact mainInfo) {
        this.id = id;
        this.contactInfo = contactInfo;
        this.userAbout = userAbout;
        this.mainInfo = mainInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Map<String, List<UserContact>> getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Map<String, List<UserContact>> contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Properties getUserAbout() {
        return userAbout;
    }

    public void setUserAbout(Properties userAbout) {
        this.userAbout = userAbout;
    }

    public UserContact getMainInfo() {
        return mainInfo;
    }

    public void setMainInfo(UserContact mainInfo) {
        this.mainInfo = mainInfo;
    }
}
