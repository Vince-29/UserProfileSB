package userprofile.project.model;

import jakarta.persistence.*;
import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "f_name")
    private String fName;

    @Column(name = "l_name")
    private String lName;

    @Column(name = "acc_username", unique = true, nullable = false)
    private String accUsername;

    @Column(name = "acc_pass", nullable = false)
    private String accPass;

    @Lob
    @Column(name = "user_pic")
    private Blob userPic;

    @Column(name = "acc_date_creation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date accDateCreation;

    public int getId() {
        return userId;
    }

    public void setId(int id) {
        this.userId = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAccUsername() {
        return accUsername;
    }

    public void setAccUsername(String accUsername) {
        this.accUsername = accUsername;
    }

    public String getAccPass() {
        return accPass;
    }

    public void setAccPass(String accPass) {
        this.accPass = accPass;
    }

    public Blob getUserPic() {
        return userPic;
    }

    public Date getAccDateCreation() {
        return accDateCreation;
    }

    public void setAccDateCreation(Date accDateCreation) {
        this.accDateCreation = accDateCreation;
    }

    public void setUserPic(Blob userPic) {
        this.userPic = userPic;


    }
}

