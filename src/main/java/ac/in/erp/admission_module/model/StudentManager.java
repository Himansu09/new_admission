package ac.in.erp.admission_module.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="student_manager")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentManager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "source")
    private String source;

    @Column(name = "First_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "permanent_adress")
    private String permanentAdress;

    @Column(name = "present_adress")
    private String presentAdress;

    @Column(name = "age")
    private String age;

    @Column(name = "birth_date")
    private String dateOfBirth;

    @Column(name = "maritial_status")
    private String maritalStatus;

    @Column(name = "qualification")
    private String qualification;

    @Column(name = "selection")
    private Boolean selection;

}
