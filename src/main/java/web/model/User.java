package web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @Size(min = 3, max = 30, message = "Name should be between 2 and 30 chars")
    @NotEmpty(message = "Name should not be empty")
    private String name;

    @Column(name = "lastname")
    @Size(min = 3, max = 30, message = "lastName should be between 2 and 30 chars")
    @NotEmpty(message = "Name should not be empty")
    private String lastName;

    @Column(name = "email")
    @Email(message = "Email should be valid")
    @NotEmpty(message = "Name should not be empty")
    private String email;

    @Column(name = "age")
    @Min(value = 0, message = "Age should be greater than 0")
    private int age;

    public User() {}

    public User( String name, String lastName, String email, int age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
