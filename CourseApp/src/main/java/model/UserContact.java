package model;

public class UserContact {

    private Integer id;
    private String name;
    private String info;

    public void start() {
        System.out.println("run before......");
    }

    public void end() {
        System.out.println("run after.......");
    }

    public UserContact() {

    }

    public UserContact(Integer id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "UserContact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
