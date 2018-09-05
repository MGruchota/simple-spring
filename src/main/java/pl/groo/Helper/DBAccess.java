package pl.groo.Helper;

import javax.persistence.*;

@Entity
@Table(name="banks")
public class DBAccess {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String bankNr;

    private String bankName;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankNr() {
        return bankNr;
    }

    public void setBankNr(String bankNr) {
        this.bankNr = bankNr;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "DBAccess{" +
                "id=" + id +
                ", bankNr='" + bankNr + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
