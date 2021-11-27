package tn.essat.crudthymleaf.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity

@Data @NoArgsConstructor @ToString @AllArgsConstructor

public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String password;
    private boolean active;

    public Users(String firstName, String lastName, String password, boolean active) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.active = active;
    }
}
