
/**
 * The class Student is a parent class of Regular class and Dropout class which has seven attributes.
 *
 * Sewa Poudel
 * 2023-05-07
 */
public class Student 
 //naming the class
{ 
     private String dateOfBirth;
     private String courseName;
     private String studentName;
     private String dateOfEnrollment;
     private int enrollmentID;
     private int courseDuration;
     private int tuitionFee;
     //declaring the instance variable with the required attributes and datatype
     
     
     public Student(String dateOfBirth, String studentName, int courseDuration, int tuitionFee)
     //Student has constructor method which construct Student object with 4 parameters  
     {
         this.dateOfBirth = dateOfBirth;
         this.studentName = studentName;
         this.courseDuration = courseDuration;
         this.tuitionFee = tuitionFee;
         this.courseName = "" ;
         this.dateOfEnrollment = "";
         this.enrollmentID = 0;
         //this keyword is differentiating between local and instance variable 
           
     }
     //Getter Method also known as accessor method
     public String getDateOfBirth()
     {
        return dateOfBirth;
     }
    
     public String getCourseName()
     {
        return courseName;
     }
    
     public String getStudentName() 
     {
        return studentName;   
     }
    
     public String getDateOfEnrollment()
     {
        return dateOfEnrollment;
     }
    
     public int getEnrollmentID()
     {
        return enrollmentID;
     }
    
     public int getCourseDuration() 
     {
        return courseDuration;
     }
    
     public int getTuitionFee()
     //retrives the value of tuitionFee
     {
        return tuitionFee;
        //return the value of tuitionFee
     }
     
     //Setter Method also known as mutator method
     public void setCourseName(String courseName)
     {
        this.courseName = courseName;
     }
    
     public void setEnrollmentID(int enrollmentID) 
     {
        this.enrollmentID = enrollmentID;
     }
    
     public void setDateOfEnrollment(String dateOfEnrollment)
     {
        this.dateOfEnrollment = dateOfEnrollment;
     }
    
     public void setDateOfBirth(String dateOfBirth)
     {
        this.dateOfBirth = dateOfBirth;
     }
    
     public void setStudentName(String studentName)
     {
        this.studentName = studentName;
     }
    
     public void setCourseDuration(int courseDuration) 
     {
        this.courseDuration = courseDuration;
     }
    
     public void setTuitionFee(int tuitionFee)
     //set the value of tuitionFee with parameter tuitionFee
     {
        this.tuitionFee = tuitionFee;
        //the value of tuitionFee parameter is assigned to tuitionFee(instance variable)
     }
     
    
     public void display()
     //a new method called display is created to display the necessary information that is required
     {
         if (enrollmentID == 0 || dateOfBirth.equals("") || courseDuration == 0 || studentName.equals("") 
              || courseName.equals("") || dateOfEnrollment.equals("") || tuitionFee == 0)
         {
            System.out.println("Cannot find the information of a Student under these values");
         } 
         else
         {
            System.out.println("Date of Birth: " + dateOfBirth);
            System.out.println("Course Name: " + courseName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Date of Enrollment: " + dateOfEnrollment);
            System.out.println("Enrollment Id: " + enrollmentID);
            System.out.println("Course Duration: " + courseDuration);
            System.out.println("Tuition Fee:" +  tuitionFee);    
         } 
        
     }

}
    
    
    
        
        
        

