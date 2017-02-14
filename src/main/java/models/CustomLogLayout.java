package models;


import org.apache.log4j.PatternLayout;
import org.apache.log4j.spi.LoggingEvent;

/**
 * Created by innopolis on 14.02.17.
 */
public class CustomLogLayout extends PatternLayout {
    public String format(LoggingEvent event) {

        UserObject user = (UserObject) event.getMessage();

        StringBuffer sb = new StringBuffer();

        String firstName = user.getFirstName();
        String phoneNumber = user.getPhoneNumber();
        String lastName = user.getLastName();

        sb.append("<user>");
        sb.append("<firstName>").append(firstName).append("</firstName>");
        sb.append("<phoneNumber>").append(phoneNumber).append("</phoneNumber>");
        sb.append("<lastName>").append(lastName).append("</lastName>");
        sb.append("</user>");
        sb.append("\n");

        return sb.toString();
    }
}
