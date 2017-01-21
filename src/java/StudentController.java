import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author pshekhter
 */
@Named(value = "studentController")
@SessionScoped
public class StudentController implements Serializable {
    
    String firstName;
    String lastName;
    String emailAddress;
    String dateOfBirth;
    String response;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getResponse() {
        response = "";
        if ((firstName != null) && (lastName != null) && (emailAddress != null) && (dateOfBirth != null)) {
            response = response.concat("<h3>Hello " + firstName + " " + lastName + "</h3>");
            response = response.concat("<h4>Your email address is " + emailAddress + "</h4>");
            response = response.concat("<h4>Your date of birth is " + dateOfBirth + "</h4>");
        }
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    /**
     * Creates a new instance of StudentController
     */
    public StudentController() {
    }
    
}
