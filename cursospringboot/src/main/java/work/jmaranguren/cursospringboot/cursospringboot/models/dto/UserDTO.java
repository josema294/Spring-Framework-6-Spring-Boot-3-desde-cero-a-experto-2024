package work.jmaranguren.cursospringboot.cursospringboot.models.dto;

import work.jmaranguren.cursospringboot.cursospringboot.models.User;

public class UserDTO {

    private String title;
    private User user;

    

    public UserDTO(String title, User user) {
        this.title = title;
        this.user = user;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    @Override
    public String toString() {
        return "UserDTO [title=" + title + ", user=" + user + "]";
    }   

    
    
}
