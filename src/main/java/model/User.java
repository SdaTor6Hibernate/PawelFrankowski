package model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USR_ID")
    private int userId;
    @Column(name = "USR_FIRSTNAME")
    private String userFirstname;
    @Column(name = "USR_LASTNAME")
    private String userLastName;
    @Column(name = "USR_PASSWORD")
    private String userPassword;
    @Column(name = "USR_EMAIL")
    private String userEmail;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="USR_ADD_ID", referencedColumnName =  "ADD_ID")
    private Address userAddressId;
    @Column(name = "USR_BIRTH_DATE")
    private LocalDateTime userBirthDate;

}
