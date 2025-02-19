package domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login")

public class login {
    public String getUsername() {
        return username;
    }
    public login() {
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Id
    private String username;
    private String password;
}
