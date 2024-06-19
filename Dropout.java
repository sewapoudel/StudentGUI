/**
 * The class Dropout is a subclass also known as child class of Student class which has five attributes.
 *
 * Sewa Poudel
 * 2023-05-09
 */
public class Dropout extends Student
//naming the class
{
    private int numOfRemainingModules;
    private int numOfMonthsAttended;
    private String dateOfDropout;
    private int remainingAmount;
    private boolean hasPaid;
    //declaring the instance variable with the required attributes and datatype
    

    public Dropout(int enrollmentID, String dateOfBirth, String courseName, String studentName, String dateOfEnrollment,
                   int tuitionFee,int courseDuration, int numOfRemainingModules, String dateOfDropout,int numOfMonthsAttended)
    //Dropout has constructor method which construct Dropout object with 10 parameters  
    {
        super(dateOfBirth, studentName, courseDuration,tuitionFee);
        super.setEnrollmentID(enrollmentID);
        super.setCourseName(courseName);
        super.setDateOfEnrollment(dateOfEnrollment);
        //super keyword is used to call the super class mutator method
        this.numOfRemainingModules = numOfRemainingModules;
        this.numOfMonthsAttended = numOfMonthsAttended;
        this.dateOfDropout = dateOfDropout;
        this.remainingAmount = 0;
        this.hasPaid = false;
        //this keyword is differentiating between local and instance variable 
    }
    
    //Getter method also known as accessor method
    public int getNumOfRemainingModules()
    {
        return numOfRemainingModules;
    }

    public int getNumOfMonthsAttended()
    {
        return numOfMonthsAttended;
    }

    public String getDateOfDropout() 
    {
        return dateOfDropout;
    }

    public int getRemainingAmount() 
    {
        return remainingAmount;
    }

    public boolean getHasPaid() 
    //retrieves the value of hasPaid
    {
        return hasPaid;
        //return the value of hasPaid
    }
    
    
    public void billsPayable() 
    //a new method billsPayable is created with a formula to calculate remainingAmount
    {
        if(hasPaid == false)
        {
            if(super.getCourseDuration() <= numOfMonthsAttended)
            {
                System.out.println("Remaining amount  cannot be calculated due to less number of course duration than that of months attended ");
            }
            else
            {
                System.out.println("The bills has been already been cleared");
                remainingAmount = (getCourseDuration() - getNumOfMonthsAttended()) * getTuitionFee();
                hasPaid = true;
            }
        }
        else
        {
            System.out.println("All the bills are cleared");
        }
    }

    
    public void removeStudent() 
    //a new method removeStudent is created to remove student who hasn't cleared bills
    {
        if (hasPaid==true) 
        {
        super.setDateOfBirth("");
        super.setCourseName(" ");
        super.setStudentName(""); 
        super.setDateOfEnrollment("");
        super.setCourseDuration(0);
        super.setTuitionFee(0);
        dateOfDropout = "";
        super.setEnrollmentID(0);
        numOfRemainingModules = 0;
        numOfMonthsAttended = 0;
        remainingAmount = 0;
        hasPaid=false;
        System.out.println("Student has been removed");
        } 
        else
        {
            System.out.println("All bills not cleared");
        }
    }

    public void display() 
    //a new method called display is created to display the necessary information that is required
    {
        super.display();
        System.out.println("Number of Remaining Modules: " + numOfRemainingModules);
        System.out.println("Number of Months Attended: " + numOfMonthsAttended);
        System.out.println("Date of Dropout: " + dateOfDropout);
        System.out.println("Remaining Amount: " + remainingAmount);
    }
}