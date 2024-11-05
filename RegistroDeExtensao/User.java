/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class User {
    protected String email;
    protected String password;
    protected String name;

    public User(String email, String password, String name) {
        this.email = email;
        this.password = hashPassword(password);
        this.name = name;
    }

    private String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void update(String name, String email, String password) {
        this.name = name;
        this.email = email;
        if (password != null && !password.isEmpty()) {
            this.password = hashPassword(password);
        }
    }

    public boolean checkPassword(String rawPassword) {
        return BCrypt.checkpw(rawPassword, this.password);
    }
}
