package models;

import javax.mail.internet.MimeBodyPart;

/**
 * Created by innopolis on 14.02.17.
 */
public class UserObject {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public UserObject(String firstName, String phoneNumber, String lastName) {
        super();
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
    }


}
