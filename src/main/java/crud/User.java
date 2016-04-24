package crud;

/**
 * Created by Цымбалюк Сергей on 24.04.2016.
 */
public class User {
    private int id;
    private String name;
    private String city;
    private int age;

    public User( String name, String sity, int age) {
        this.name = name;
        this.city = sity;
        this.age = age;
    }

    public User(int id, String name, String city, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
