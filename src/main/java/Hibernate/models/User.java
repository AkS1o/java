package Hibernate.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="tbl_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 50, nullable = false)
    private String surname;

    @ManyToOne
    @JoinColumn(name="role_id", nullable=false)
    private Role role;
}
