package model.entity;

import java.util.Date;
import java.util.List;

/**
 * Entity class Note
 * Created by daniel.volkov on 05/11/16.
 */
public class Note {
    private String surname;
    private String firstName;
    private String shrotName;
    private String patronimic;
    private String nickName;
    private String comment;
    private String group;
    private String homePhone;
    private String mobilePhone;
    private String mobilePhoneSecond;
    private String email;
    private String skype;
    private String index;
    private String city;
    private String street;
    private String houseNumber;
    private String appartment;
    private String address;
    private String creationDate;
    private String changingDate;

    /**
     * Setters for note entity
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setShrotName(){
        this.shrotName = surname+" "+firstName.substring(0,1)+".";
    }

    public void setPatronimic(String patronimic) {
        this.patronimic = patronimic;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setMobilePhoneSecond(String mobilePhoneSecond) {
        this.mobilePhoneSecond = mobilePhoneSecond;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public void setAddress() {
        this.address= String.format("%s %s %s %s %s",index,city,street,houseNumber,appartment);
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setAppartment(String appartment) {
        this.appartment = appartment;
    }

    public void setCreationDate() {
        this.creationDate = new Date().toString();
    }

    public void setChangingDate() {
        this.changingDate = new Date().toString();
    }


}
