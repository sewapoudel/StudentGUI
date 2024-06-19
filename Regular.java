
/**
 *The class Regular is a subclass also known as child class of Student class which has four attributes.
 *
 * Sewa Poudel
 * 2023-05-08
 */
public class Regular extends Student
//namimg the class
{
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;
    
    public Regular(int enrollmentID, String dateOfBirth, String courseName, String studentName,  String dateOfEnrollment,
                   int courseDuration, int tuitionFee, int numOfModules,int numOfCreditHours,double daysPresent)
    //Regular has constructor method which construct Regular object with 10 parameters  
    {
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        super.setCourseName(courseName);
        super.setEnrollmentID(enrollmentID);
        super.setDateOfEnrollment(dateOfEnrollment);
        //super keyword is used to call the super class mutator method
        this.numOfModules=numOfModules;
        this.numOfCreditHours=numOfCreditHours;
        this.daysPresent=daysPresent;
        this.isGrantedScholarship=false;
        //this keyword is differentiating between local and instance variable 
    }
    
    //Getter method also known as accessor method
    public int getNumOfModules()
    {
        return numOfModules;
    }
    
    public int getNumOfCreditHours()
    {
        return numOfCreditHours;
    }
    
    public double getDaysPresent()
    {
        return daysPresent;
    }
    
    public boolean getIsGrantedScholarship()
    //retrives the value of isGrantedScholarship
    {
        return isGrantedScholarship;
        //return the value of isGrantedScholarship
    }
     
    public String presentPercentage(double daysPresent)

    // a new method presentPercentage is created with parameter daysPresent
    {
        this.daysPresent=daysPresent;
        double presentPercentage = (daysPresent / (super.getCourseDuration() * 30 ) )* 100;
        String grade = "";
          
        if (super.getCourseDuration() *30 < daysPresent)
        {
            System.out.println("The student information hasn't been recorded");
        }
        else
        {
            if (presentPercentage >=80 && presentPercentage <=100 )
            {
                isGrantedScholarship=true;
                grade = "A";
            }
            else if (presentPercentage >=60 && presentPercentage <=80)
            {
                isGrantedScholarship=false;
                grade =  "B";
            }
            else if (presentPercentage >=40 && presentPercentage <=60)
            {
                isGrantedScholarship=false;
                grade =  "C";
            }
            else if (presentPercentage >=20 && presentPercentage <=40)
            {
                isGrantedScholarship=false;
                grade =  "D";
            }
            else
            {
                isGrantedScholarship=false;
                grade =  "E";
            }
        }
        return grade;
    }
    
    public void grantCertificate(String courseName,int enrollmentID,String dateOfEnrollment)
    // a new method grantCertificate is created with 3 parameters
    {
        System.out.println("The student has graduated");
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Enrollment ID: " + getEnrollmentID());
        System.out.println("Date of Enrollment: " + getDateOfEnrollment());

        if (isGrantedScholarship) 
        {
            System.out.println("The scholarship has been granted.");
        }
    }

    
    public void display() 
    //a new method called display is created to display the necessary information that is required
    {
        super.display();
        System.out.println("Number of Modules: " + numOfModules);
        System.out.println("Number of Credit Hours: " + numOfCreditHours);
        System.out.println("Days Present: " + daysPresent);
    }

}

     
     
     
     
     
     
     
     
     
    
     
    
     
         
     
     
     
      

