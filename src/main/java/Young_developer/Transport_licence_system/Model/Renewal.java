package Young_developer.Transport_licence_system.Model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "renewals")
public class Renewal{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private int age;
    private String fullname;
    private String gender;
    private String dateofbirth;
    private String restriction;
    private String issued;
    private String expirydate;
    private String bloodgroup;
    private String carclass;
        private String address;

}
