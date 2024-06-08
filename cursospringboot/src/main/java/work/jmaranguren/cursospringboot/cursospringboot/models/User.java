package work.jmaranguren.cursospringboot.cursospringboot.models;

public class User {

    private String name;
    private String lastname;

    

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", lastname=" + lastname + "]";
    }

    

}
