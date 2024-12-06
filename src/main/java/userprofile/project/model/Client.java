package userprofile.project.model;

import jakarta.persistence.*;
import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    @Column(name = "firstName")
    private String fName;

    @Column(name = "lastName")
    private String lName;

    @Column(name = "midName")
    private String midName;

    @Column(name = "accUsername")
    private String accUsername;

    @Column(name = "accPass", nullable = false)
    private String accPass;

    @Lob
    @Column(name = "userPic")
    private Blob userPic;

    @Column(name = "accDateCreation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date accDateCreation;


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


    public void setUserPic(Blob userPic) {
        this.userPic = userPic;
    }

    public Date getAccDateCreation() {
        return accDateCreation;
    }

    public void setAccDateCreation(Date accDateCreation) {
        this.accDateCreation = accDateCreation;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }




}

