package ua.dbase.entitis;

import javax.persistence.*;

/**
 * Created by liny on 29.11.15.
 */
@Entity
@Table(name = "phone_book", schema = "phonebase")
public class PhoneBookEntiti {
    private int id;
    private int idUser;
    private String suname;
    private String fistName;
    private String middleName;
    private String phoneMobile;
    private String phoneHome;
    private String address;
    private String eMail;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_user", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "suname", nullable = true, length = 20)
    public String getSuname() {
        return suname;
    }

    public void setSuname(String suname) {
        this.suname = suname;
    }

    @Basic
    @Column(name = "fist_name", nullable = true, length = 20)
    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    @Basic
    @Column(name = "middle_name", nullable = true, length = 20)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "phone_mobile", nullable = true, length = 20)
    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }

    @Basic
    @Column(name = "phone_home", nullable = true, length = 20)
    public String getPhoneHome() {
        return phoneHome;
    }

    public void setPhoneHome(String phoneHome) {
        this.phoneHome = phoneHome;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 50)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "e_mail", nullable = true, length = 50)
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneBookEntiti that = (PhoneBookEntiti) o;

        if (id != that.id) return false;
        if (idUser != that.idUser) return false;
        if (suname != null ? !suname.equals(that.suname) : that.suname != null) return false;
        if (fistName != null ? !fistName.equals(that.fistName) : that.fistName != null) return false;
        if (middleName != null ? !middleName.equals(that.middleName) : that.middleName != null) return false;
        if (phoneMobile != null ? !phoneMobile.equals(that.phoneMobile) : that.phoneMobile != null) return false;
        if (phoneHome != null ? !phoneHome.equals(that.phoneHome) : that.phoneHome != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (eMail != null ? !eMail.equals(that.eMail) : that.eMail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idUser;
        result = 31 * result + (suname != null ? suname.hashCode() : 0);
        result = 31 * result + (fistName != null ? fistName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (phoneMobile != null ? phoneMobile.hashCode() : 0);
        result = 31 * result + (phoneHome != null ? phoneHome.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (eMail != null ? eMail.hashCode() : 0);
        return result;
    }
}
