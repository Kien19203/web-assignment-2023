package vn.ed.hcmuaf.bean;

public class User {
   private String email;
   private String password;
   private int id;

   private String name;

    public User(String email, String password, int id, String name) {
        this.email = email;
        this.password = password;
        this.id = id;
        this.name = name;
    }
    public User() {
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                "}\n";
    }
}
