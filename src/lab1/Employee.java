package lab1;

import java.util.Date;

/**
 * In this lab your challenge is to fix the code in both classes to use
 * proper encapsulation and the four other best practices as explained by 
 * your instructor.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.01
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private Date birthDate;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean isMovedIn;
    private String cubeId;

    public Employee() {
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        moveIntoCubicle();
    }

    // Assume this must be performed first
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
    }

    // Assume this is must be performed second
    private void meetDepartmentStaff() {
        if(metWithHr) {
            metDeptStaff = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot meet with "
                    + "department staff until you have met with HR.");
        }
    }

    // Assume this must be performed third
    private void reviewDeptPolicies() {
        if(metWithHr && metDeptStaff) {
            reviewedDeptPolicies = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot review "
                    + " department policies until you have first met with HR "
                    + "and then with department staff.");
        }
    }

    // Assume this must be performed 4th
    private void moveIntoCubicle() {
        if(metWithHr && metDeptStaff && reviewedDeptPolicies) {
            this.isMovedIn = true;
        } else {
            throw new IllegalStateException("Sorry, you cannot move in to a "
                    + "cubicle until you have first met with HR "
                    + "and then with department staff, and then reviewed"
                    + "department policies.");
        }

    }

    public String getStatus() {
        if(metWithHr && metDeptStaff
           && reviewedDeptPolicies && isMovedIn) {
            return "Orientation is complete";
        } else {
            return "Orientation in progress...";
        }
    }

    public void setFirstName(String firstName) {
        //needs validation
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String lastName) {
        //needs validation
        this.lastName = lastName;
    }
    
        public String getLastName() {
        return lastName;
    }
        
    public void setSsn(String ssn) {
        //needs validation
        this.ssn = ssn;
    }
    
    public String getSsn() {
        return ssn;
    }
    
    public void setBirthDate(Date birthDate) {
        //needs validation
        this.birthDate = birthDate;
    }
    
    public Date getBirthDate() {
        return birthDate;
    }
    
    public void setCubeId(String cubeId) {
        //needs validation
        this.cubeId = cubeId;
    }
    
    public String getCubeId() {
        return cubeId;
    }  
}
