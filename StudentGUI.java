//Importing all the necessary awt and swing components
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;

//naming the class
public class StudentGUI 
{
    //declaring the instances for JFrame,JPanel,JLabel,JTextField,JComboBox,JButton
    private JFrame studentframe,regularframe,dropoutframe;

    private JPanel studentpanel,regularpanel,dropoutpanel;

    private JLabel  studentnamelabel,enrollmentidlabel,coursenamelabel,coursedurationlabel,tuitionfeelabel,
                    dateofbirthlabel,dateofenrollmentlabel,numofmoduleslabel,numofcredithourslabel,dayspresentlabel,
                    numofremainingmoduleslabel,numofmonthsattendedlabel,dateofdropoutlabel,enrollmentidlabel1,
                    enrollmentidlabel2,dateofenrollmentlabel1,coursenamelabel1,enrollmentidlabel3,
                    enrollmentidlabel4,dayspresentlabel1;

    private JTextField studentNamefield,enrollmentIDfield,courseNamefield,courseDurationfield,tuitionFeefield,
                       numofmodulesfield,numofcredithoursfield,dayspresentfield,numofremainingmodulesfield,
                       numofmonthsattendedfield,enrollmentIDfield1,enrollmentIDfield2,courseNamefield1,
                       enrollmentIDfield3,enrollmentIDfield4,dayspresentfield1;

    private JComboBox <String> daycombobox,monthcombobox,yearcombobox,day1combobox,month1combobox,year1combobox,
                               day2combobox,month2combobox,year2combobox,day3combobox,month3combobox,
                               year3combobox;
                    
    private JButton clearbutton,regularbutton,dropoutbutton,addregularbutton,closebutton,clearbutton1,displaybutton1,
                    adddropoutbutton,closebutton1,clearbutton2,displaybutton2,presentpercentagebutton,grantcertificatebutton,
                    paythebillsbutton,removedropoutbutton;
                                   
    private static final int INVALID  = -1;
    
    //creating ArrayList of Student class named arraystudent
    private ArrayList <Student> arraystudent = new ArrayList <Student> (); 
    
    //The StudentGUI class has a constructor method
    public StudentGUI()
    {
        studentframe = new JFrame("22085464 Sewa Poudel");
        studentframe.setSize(1000,670);
        studentframe.setLocationRelativeTo(null);
        studentframe.getContentPane().setBackground(Color.darkGray);
        studentframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        studentpanel = new JPanel();
        studentpanel.setSize(800,570);
        studentpanel.setLocation(100,30);
        studentpanel.setBackground(Color.lightGray);
        studentframe.add(studentpanel);

        Font studentfont = new Font(Font.SERIF,Font.BOLD,13);
        Border studentborder= BorderFactory.createLineBorder(Color.BLACK);
        Border studenttitle = BorderFactory.createTitledBorder(studentborder,"Student Registration Form ",
        TitledBorder.CENTER,TitledBorder.TOP,studentfont,Color.black);
        studentpanel.setBorder(studenttitle);

        studentnamelabel = new JLabel();
        studentnamelabel.setText("Student Name");
        studentnamelabel.setBounds(100, 50, 100, 30);
        studentpanel.add(studentnamelabel);

        studentNamefield= new JTextField();
        studentNamefield.setBounds(245,50,140,30);
        studentpanel.add(studentNamefield);

        enrollmentidlabel= new JLabel();
        enrollmentidlabel.setText("Enrollment ID");
        enrollmentidlabel.setBounds(100, 110, 100, 30);
        studentpanel.add(enrollmentidlabel);

        enrollmentIDfield= new JTextField();
        enrollmentIDfield.setBounds(245,110,140,30);
        studentpanel.add(enrollmentIDfield);

        coursenamelabel = new JLabel();
        coursenamelabel.setText("Course Name");
        coursenamelabel.setBounds(100,170,100,30);
        studentpanel.add(coursenamelabel);

        courseNamefield = new JTextField();
        courseNamefield.setBounds(245,170,140,30);
        studentpanel.add(courseNamefield);
        
        coursedurationlabel= new JLabel();
        coursedurationlabel.setText("Course Duration");
        coursedurationlabel.setBounds(100, 230, 100, 30);
        studentpanel.add(coursedurationlabel);

        courseDurationfield= new JTextField();
        courseDurationfield.setBounds(245,230,140,30);
        studentpanel.add(courseDurationfield);

        tuitionfeelabel= new JLabel();
        tuitionfeelabel.setText("Tuition Fee");
        tuitionfeelabel.setBounds(100, 290, 100, 30);
        studentpanel.add(tuitionfeelabel);

        tuitionFeefield= new JTextField();
        tuitionFeefield.setBounds(245,290,140,30);
        studentpanel.add(tuitionFeefield);

        dateofbirthlabel = new JLabel("Date of Birth");
        dateofbirthlabel.setBounds(100,350,100,30);
        studentpanel.add(dateofbirthlabel);

        String day[] = {"Day" ,"1","2","3","4", "5","6","7","8","9","10", "11","12","13","14","15","16","17" ,"18","19","20" ,"21","22","23","24","25" ,"26","27","28","29","30" };
        daycombobox = new JComboBox(day);
        daycombobox.setBounds(245, 350, 140, 30);
        studentpanel.add(daycombobox);
        
        String month[] = { "Month","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        monthcombobox = new JComboBox(month);
        monthcombobox.setBounds(410, 350, 140, 30);
        studentpanel.add(monthcombobox);
        
        String year[] = {"Year", "2008" ,"2007" ,"2006" ,"2005" , "2004" , "2003" ,"2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991"};
        yearcombobox= new JComboBox(year);
        yearcombobox.setBounds(575, 350, 140, 30);
        studentpanel.add(yearcombobox);

        dateofenrollmentlabel = new JLabel("Date of Enrollment");
        dateofenrollmentlabel.setBounds(100,410,110,30);
        studentpanel.add(dateofenrollmentlabel);

        String day1[] = {"Day" ,"1","2","3","4", "5","6","7","8","9","10", "11","12","13","14","15","16","17" ,"18","19","20" ,"21","22","23","24","25" ,"26","27","28","29","30" };
        day1combobox = new JComboBox(day1);
        day1combobox.setBounds(245, 410, 140, 30);
        studentpanel.add(day1combobox);
        
        String month1[] = { "Month","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        month1combobox = new JComboBox(month1);
        month1combobox.setBounds(410, 410, 140, 30);
        studentpanel.add(month1combobox);
        
        String year1[] = {"Year","2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011" ,"2010","2009","2008" ,"2007" ,"2006" ,"2005" , "2004" , "2003" ,"2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991"};
        year1combobox= new JComboBox(year1);
        year1combobox.setBounds(575, 410, 140, 30);
        studentpanel.add(year1combobox);
        
        clearbutton = new JButton("Clear");
        clearbutton.setBounds(410,470,140,30);
        studentpanel.add(clearbutton);

        //clear all the values of Student Registration Form
        clearbutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                studentNamefield.setText("");
                enrollmentIDfield.setText("");
                courseNamefield.setText("");
                courseDurationfield.setText("");
                tuitionFeefield.setText("");
                daycombobox.setSelectedIndex(0);
                monthcombobox.setSelectedIndex(0);
                yearcombobox.setSelectedIndex(0);
                day1combobox.setSelectedIndex(0);
                month1combobox.setSelectedIndex(0);
                year1combobox.setSelectedIndex(0);
            }
        });

        regularbutton = new JButton("Regular");
        regularbutton.setBounds(245,530,140,30);
        studentpanel.add(regularbutton);
        
        //perform the action inside the createRegularFrame
        regularbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                createRegularFrame();
            }
        });
    
        dropoutbutton = new JButton("Dropout");
        dropoutbutton.setBounds(575,530,140,30);
        studentpanel.add(dropoutbutton);

        //perform the action inside the createDropoutFrame
        dropoutbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                createDropoutFrame();
            }
        });

        studentpanel.setLayout(null);
        studentframe.setLayout(null); 
        studentframe.setVisible(true); 
    
    }
    
    //method for the frame Regular Registration Form
    public void createRegularFrame()
    {       
        regularframe = new JFrame("22085464 Sewa Poudel");
        regularframe.setSize(1000, 670);
        regularframe.setLocationRelativeTo(null);
        regularframe.getContentPane().setBackground(Color.darkGray);
        regularframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        regularpanel = new JPanel();
        regularpanel.setSize(800, 570);
        regularpanel.setLocation(100, 30);
        regularpanel.setBackground(Color.lightGray);
        regularframe.add(regularpanel);
            
        Font regularfont = new Font(Font.SERIF, Font.BOLD, 13);
        Border regularborder = BorderFactory.createLineBorder(Color.black);
        Border regulartitle = BorderFactory.createTitledBorder(regularborder, "Regular Student Registration Form",
        TitledBorder.CENTER, TitledBorder.TOP, regularfont, Color.black);
        regularpanel.setBorder(regulartitle);
        
        numofmoduleslabel = new JLabel();
        numofmoduleslabel.setText("Number of modules");
        numofmoduleslabel.setBounds(45, 50, 140, 30);
        regularpanel.add( numofmoduleslabel);

        numofmodulesfield= new JTextField();
        numofmodulesfield.setBounds(210,50,140,30);
        regularpanel.add(numofmodulesfield);

        numofcredithourslabel= new JLabel();
        numofcredithourslabel.setText("Number of credit hours");
        numofcredithourslabel.setBounds(45, 110, 140, 30);
        regularpanel.add(numofcredithourslabel);

        numofcredithoursfield= new JTextField();
        numofcredithoursfield.setBounds(210,110,140,30);
        regularpanel.add(numofcredithoursfield);

        dayspresentlabel = new JLabel();
        dayspresentlabel.setText("Days Present");
        dayspresentlabel.setBounds(45,170,140,30);
        regularpanel.add(dayspresentlabel);
        
        dayspresentfield = new JTextField();
        dayspresentfield.setBounds(210,170,140,30);
        regularpanel.add(dayspresentfield);

        enrollmentidlabel1 = new JLabel();
        enrollmentidlabel1.setText("Enrollment id ");
        enrollmentidlabel1.setBounds(470, 50, 140, 30);
        regularpanel.add( enrollmentidlabel1);

        enrollmentIDfield1= new JTextField();
        enrollmentIDfield1.setBounds(590,50,140,30);
        regularpanel.add(enrollmentIDfield1);

        dayspresentlabel1 = new JLabel();
        dayspresentlabel1.setText("Days Present");
        dayspresentlabel1.setBounds(470,110,140,30);
        regularpanel.add(dayspresentlabel1);
        
        dayspresentfield1 = new JTextField();
        dayspresentfield1.setBounds(590,110,140,30);
        regularpanel.add(dayspresentfield1);
            
        enrollmentidlabel2 = new JLabel();
        enrollmentidlabel2.setText("Enrollment id ");
        enrollmentidlabel2.setBounds(45, 320, 140, 30);
        regularpanel.add( enrollmentidlabel2);

        enrollmentIDfield2= new JTextField();
        enrollmentIDfield2.setBounds(210,320,140,30);
        regularpanel.add(enrollmentIDfield2);

        coursenamelabel1 = new JLabel();
        coursenamelabel1.setText("Course Name");
        coursenamelabel1.setBounds(45, 380, 140, 30);
        regularpanel.add(coursenamelabel1);

        courseNamefield1= new JTextField();
        courseNamefield1.setBounds(210,380,140,30);
        regularpanel.add(courseNamefield1);

        dateofenrollmentlabel1 = new JLabel();
        dateofenrollmentlabel1.setText("Date of enrollment");
        dateofenrollmentlabel1.setBounds(45, 440, 140, 30);
        regularpanel.add(dateofenrollmentlabel1);

        String day3[] = {"Day" ,"1","2","3","4", "5","6","7","8","9","10", "11","12","13","14","15","16","17" ,"18","19","20" ,"21","22","23","24","25" ,"26","27","28","29","30" };
        day3combobox = new JComboBox(day3);
        day3combobox.setBounds(210, 440, 140, 30);
        regularpanel.add(day3combobox);
        
        String month3[] = { "Month","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        month3combobox = new JComboBox(month3);
        month3combobox.setBounds(370, 440, 140, 30);
        regularpanel.add(month3combobox);
        
        String year3[] = {"Year","2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011" ,"2010","2009","2008" ,"2007" ,"2006" ,"2005" , "2004" , "2003" ,"2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991"};
        year3combobox= new JComboBox(year3);
        year3combobox.setBounds(530, 440, 140, 30);
        regularpanel.add(year3combobox);
            
        clearbutton1 = new JButton("Clear");
        clearbutton1.setBounds(370,500,140,30);
        regularpanel.add(clearbutton1);

        //clear all the values of Regular Registration Form
        clearbutton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                numofmodulesfield.setText("");
                numofcredithoursfield.setText("");
                dayspresentfield.setText("");
                dayspresentfield1.setText("");
                enrollmentIDfield1.setText("");
                enrollmentIDfield2.setText("");
                courseNamefield1.setText("");
                day3combobox.setSelectedIndex(0);
                month3combobox.setSelectedIndex(0);
                year3combobox.setSelectedIndex(0);
            }
        });

        closebutton = new JButton("Close");
        closebutton.setBounds(570,500,140,30);
        regularpanel.add(closebutton);

        //close the regularframe
        closebutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                regularframe.dispose();
            }
        });
            
        addregularbutton=new JButton("Add Regular");
        addregularbutton.setBounds(45, 230, 140, 30);
        regularpanel.add(addregularbutton);
            
        //perform the action for Regular Registration Form by ensuring the input are valid.
        addregularbutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String studentName=getStudentName();
                if (studentName.equals(""))
                {
                    JOptionPane.showMessageDialog(regularframe, "Student name cannot be empty.", "Student name Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                int enrollmentID= getEnrollmentID();
                if(enrollmentID==INVALID)
                {
                    JOptionPane.showMessageDialog(regularframe, "Enrollment Id should always be positive", "Enrollment ID Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String courseName=getCourseName();
                if (courseName.equals(""))
                {
                    JOptionPane.showMessageDialog(regularframe, "Course name cannot be empty", "Course name Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int courseDuration= getCourseDuration();
                if(courseDuration==INVALID)
                {
                    JOptionPane.showMessageDialog(regularframe, "Course duration should always be positive", "Course duration Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int tuitionFee= getTuitionFee();
                if(tuitionFee==INVALID)
                {
                    JOptionPane.showMessageDialog(regularframe, "Tuition fee should always be positive", "Tuition Fee Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                String dateOfBirth=getDateOfBirth(); 
                if(dateOfBirth==null)
                {
                    JOptionPane.showMessageDialog(regularframe, "The combobox hasn't been selected", "Date of birth Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String dateOfEnrollment=getDateOfEnrollment(); 
                if(dateOfEnrollment==null)
                {
                    JOptionPane.showMessageDialog(regularframe, "The combobox hasn't been selected", "Date of enrollment Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int numOfModules= getNumOfModules();
                if(numOfModules==INVALID)
                {
                    JOptionPane.showMessageDialog(regularframe, "Number of modules should always be positive", "Number of modules Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                int numOfCreditHours= getNumOfCreditHours();
                if(numOfCreditHours==INVALID)
                {
                    JOptionPane.showMessageDialog(regularframe, "Number of credit hours should always be positive", "Number of credit hours Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double daysPresent= getDaysPresent();
                if(daysPresent==INVALID)
                {
                    JOptionPane.showMessageDialog(regularframe, "Days Present  should always be positive", "Days present Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                boolean check=enrollmentidunique(enrollmentID);
                if(check==true)
                {
                    JOptionPane.showMessageDialog(regularframe,"Enrollment id should always be unique","Enrollment ID Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    //creating new Regular object and adding it to student array called arraystudent.
                    arraystudent.add(new Regular(enrollmentID, dateOfBirth, courseName, studentName,
                                                 dateOfEnrollment, courseDuration, tuitionFee, numOfModules,
                                                 numOfCreditHours,daysPresent));
                    displaybutton1.setEnabled(true);
                    JOptionPane.showMessageDialog(regularframe, "The regular record is successfully added", "Added Regular Success", JOptionPane.INFORMATION_MESSAGE);
                }

            }          
        });

        displaybutton1= new JButton("Display");
        displaybutton1.setBounds(210, 230, 140, 30);
        regularpanel.add(displaybutton1);
        displaybutton1.setEnabled(false);
         
        //displays the details of Regular Registration Form for each object of Regular
        displaybutton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                for (Student stu: arraystudent)
                {
                    if(stu instanceof Regular) //checking if Student object is an instance of Regular class
                    {
                        Regular regu=(Regular) stu; //downcasting
                        regu.display();
                    }
                }  
            }
        });
            
        presentpercentagebutton= new JButton("Present Percentage");
        presentpercentagebutton.setBounds(500,170,160,30);
        regularpanel.add(presentpercentagebutton);

        //perform the action to calculate the grade of Regular Student
        presentpercentagebutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                int enrollmentID1=getEnrollmentID1();
                if(enrollmentID1==INVALID)
                {
                    JOptionPane.showMessageDialog(regularframe,"Enrollment Id should always be positive", "Enrollment ID Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }

                double daysPresent1=getDaysPresent1();
                if(daysPresent1==INVALID)
                {
                    JOptionPane.showMessageDialog(regularframe, "Days Present  should always be positive", "Days present Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                    
                boolean match=false;
                for(Student stu:arraystudent)
                {
                    if(stu instanceof Regular) 
                    {
                        Regular regu=(Regular) stu; 
                        if(enrollmentID1 == regu.getEnrollmentID()) 
                        {
                            String grade=regu.presentPercentage(daysPresent1);
                            System.out.println(grade);
                            match=true;
                            JOptionPane.showMessageDialog(regularframe, "The grade of the student is:" + grade, "Grade Success", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                        else
                        {
                            match=false;
                        }
                    }
                }
                if(match==false)
                {
                    JOptionPane.showMessageDialog(regularframe, "ID cannot be found", "ID ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        grantcertificatebutton= new JButton("Grant Certificate");
        grantcertificatebutton.setBounds(150,500,160,30);
        regularpanel.add(grantcertificatebutton);

        //perform the action to grant and display the certificate of Regular Student
        grantcertificatebutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                int enrollmentID2=getEnrollmentID2();
                if(enrollmentID2==INVALID)
                {
                    JOptionPane.showMessageDialog(regularframe,"Enrollment Id should always be positive", "Enrollment ID Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                String courseName1=getCourseName1();
                if (courseName1.equals(""))
                {
                    JOptionPane.showMessageDialog(regularframe, "Course name cannot be empty", "Course name Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String dateOfEnrollment1=getDateOfEnrollment1(); 
                if(dateOfEnrollment1==null)
                {
                    JOptionPane.showMessageDialog(regularframe, "The combobox hasn't been selected", "Date of enrollment Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                boolean match=false;
                for(Student stu:arraystudent)
                {
                    if(stu instanceof Regular)
                    {   
                        Regular regu=(Regular) stu;
                        //checking if the Regular enrollmentID2,courseName1 and dateOfEnrollment1 matches with the Student enrollmentID,courseName and dateOFEnrollment.
                        if(enrollmentID2 == regu.getEnrollmentID() && courseName1.equals(regu.getCourseName()) && dateOfEnrollment1.equals(regu.getDateOfEnrollment()))
                        {   
                            regu.grantCertificate(courseName1,enrollmentID2, dateOfEnrollment1);
                            match=true;
                            JOptionPane.showMessageDialog(regularframe, "The certificate has been granted and displayed in terminal", "Ceritificate Success", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                        else
                        {
                            match=false;
                        }
                    }
                }
                if(match==false)
                {
                    JOptionPane.showMessageDialog(regularframe, "ID cannot be found", "ID ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
            
        regularpanel.setLayout(null);
        regularframe.setLayout(null);
        regularframe.setVisible(true);
    }

    //method for the frame Dropout Registration Form
    public void createDropoutFrame()
    {
        dropoutframe = new JFrame("22085464 Sewa Poudel");
        dropoutframe.setSize(1000, 670);
        dropoutframe.setLocationRelativeTo(null);
        dropoutframe.getContentPane().setBackground(Color.darkGray);
        dropoutframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        dropoutpanel = new JPanel();
        dropoutpanel.setSize(800, 570);
        dropoutpanel.setLocation(100, 30);
        dropoutpanel.setBackground(Color.lightGray);
        dropoutframe.add(dropoutpanel);

        Font dropoutfont = new Font(Font.SERIF, Font.BOLD, 13);
        Border dropoutborder = BorderFactory.createLineBorder(Color.black);
        Border dropouttitle= BorderFactory.createTitledBorder(dropoutborder, "Dropout Registration Form",
        TitledBorder.CENTER, TitledBorder.TOP, dropoutfont, Color.black);
        dropoutpanel.setBorder(dropouttitle);

        numofremainingmoduleslabel= new JLabel();
        numofremainingmoduleslabel.setText("Number of remaining modules");
        numofremainingmoduleslabel.setBounds(30, 50, 200, 30);
        dropoutpanel.add( numofremainingmoduleslabel);

        numofremainingmodulesfield= new JTextField();
        numofremainingmodulesfield.setBounds(235,50,180,30);
        dropoutpanel.add(numofremainingmodulesfield);

        numofmonthsattendedlabel =new JLabel();
        numofmonthsattendedlabel.setText("Number of months attended");
        numofmonthsattendedlabel.setBounds(30, 110, 200, 30);
        dropoutpanel.add(numofmonthsattendedlabel);

        numofmonthsattendedfield= new JTextField();
        numofmonthsattendedfield.setBounds(235,110,180,30);
        dropoutpanel.add(numofmonthsattendedfield);
        
        dateofdropoutlabel = new JLabel("Date of Dropout");
        dateofdropoutlabel.setBounds(30,170,200,30);
        dropoutpanel.add(dateofdropoutlabel);

        String day2[] = {"Day" ,"1","2","3","4", "5","6","7","8","9","10", "11","12","13","14","15","16","17" ,"18","19","20" ,"21","22","23","24","25" ,"26","27","28","29","30" };
        day2combobox = new JComboBox(day2);
        day2combobox.setBounds(235, 170, 180, 30);
        dropoutpanel.add(day2combobox);
        
        String month2[] = { "Month","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        month2combobox = new JComboBox(month2);
        month2combobox.setBounds(425, 170, 180, 30);
        dropoutpanel.add(month2combobox);
        
        String year2[] = {"Year","2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011" ,"2010","2009","2008" ,"2007" ,"2006" ,"2005" , "2004" ,
                                 "2003" ,"2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991"};
        year2combobox= new JComboBox(year2);
        year2combobox.setBounds(615, 170, 180, 30);
        dropoutpanel.add(year2combobox);

        enrollmentidlabel3 = new JLabel();
        enrollmentidlabel3.setText("Enrollment id ");
        enrollmentidlabel3.setBounds(30, 290, 120, 30);
        dropoutpanel.add( enrollmentidlabel3);

        enrollmentIDfield3= new JTextField();
        enrollmentIDfield3.setBounds(235,290,180,30);
        dropoutpanel.add(enrollmentIDfield3);

        enrollmentidlabel4 = new JLabel();
        enrollmentidlabel4.setText("Enrollment id ");
        enrollmentidlabel4.setBounds(30, 410, 120, 30);
        dropoutpanel.add( enrollmentidlabel4);

        enrollmentIDfield4= new JTextField();
        enrollmentIDfield4.setBounds(235,410,180,30);
        dropoutpanel.add(enrollmentIDfield4);

        clearbutton2 = new JButton("Clear");
        clearbutton2.setBounds(30,530,180,30);
        dropoutpanel.add(clearbutton2);

        //clear all the values of Dropout Registration Form
        clearbutton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                numofremainingmodulesfield.setText("");
                numofmonthsattendedfield.setText("");
                day2combobox.setSelectedIndex(0);
                month2combobox.setSelectedIndex(0);
                year2combobox.setSelectedIndex(0);
                enrollmentIDfield3.setText("");
                enrollmentIDfield4.setText("");
            }
        });

        closebutton1 = new JButton("Close");
        closebutton1.setBounds(615,530,180,30);
        dropoutpanel.add(closebutton1);

        //close the dropoutframe
        closebutton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                dropoutframe.dispose();
            }
        });
        
        adddropoutbutton=new JButton("Add Dropout");
        adddropoutbutton.setBounds(235, 230, 180, 30);
        dropoutpanel.add(adddropoutbutton);

        //perform the action for Dropout Registration Form by ensuring the input are valid.
        adddropoutbutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String studentName=getStudentName();
                if (studentName.equals(""))
                {
                       JOptionPane.showMessageDialog(regularframe, "Student name cannot be empty.", "Student name Error", JOptionPane.ERROR_MESSAGE);
                return;
                }

                int enrollmentID= getEnrollmentID();
                if(enrollmentID==INVALID)
                {
                    JOptionPane.showMessageDialog(regularframe, "Enrollment Id should always be positive", "Enrollment ID Error", JOptionPane.ERROR_MESSAGE);
                   return;
                }

                String courseName=getCourseName();
                if (courseName.equals(""))
                {
                       JOptionPane.showMessageDialog(regularframe, "Course name cannot be empty", "Course name Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int courseDuration= getCourseDuration();
                if(courseDuration==INVALID)
                {
                    JOptionPane.showMessageDialog(regularframe, "Course Duration should always be positive", " Course duration Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int tuitionFee= getTuitionFee();
                if(tuitionFee==INVALID)
                {
                    JOptionPane.showMessageDialog(regularframe, "Tuition fee should always be positive", "Tuition Fee Error", JOptionPane.ERROR_MESSAGE);
                   return;
                }
                
                String dateOfBirth=getDateOfBirth(); 
                if(dateOfBirth==null)
                {
                    JOptionPane.showMessageDialog(regularframe, "The combobox hasn't been selected", "Date of birth Error", JOptionPane.ERROR_MESSAGE);
                return;
                }

                String dateOfEnrollment=getDateOfEnrollment(); 
                if(dateOfEnrollment==null)
                {
                    JOptionPane.showMessageDialog(regularframe, "The combobox hasn't been selected", "Date of enrollment error", JOptionPane.ERROR_MESSAGE);
                return;
                }

                int numOfRemainingModules= getNumOfRemainingModules();
                if(numOfRemainingModules==INVALID)
                {
                    JOptionPane.showMessageDialog(dropoutframe, "Number of remaining modules should always be positive", "Number of remaining modules Error", JOptionPane.ERROR_MESSAGE);
                    return;
                } 

                int numOfMonthsAttended= getNumOfMonthsAttended();
                if(numOfMonthsAttended==INVALID)
                {
                    JOptionPane.showMessageDialog(dropoutframe, "Number of months attended should always be positive", "Number of months attended Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
              
                String dateOfDropout=getDateOfDropout(); 
                if(dateOfDropout==null)
                {
                    JOptionPane.showMessageDialog(dropoutframe, "The combobox hasn't been selected", "Date of dropout Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                boolean check=enrollmentidunique1(enrollmentID);
                if(check==true)
                {
                    JOptionPane.showMessageDialog(dropoutframe,"Enrollmentid should always be unique","Enrollment ID Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    //creating a new Dropout object and adding it to student array called arraystudent.
                    arraystudent.add(new Dropout(enrollmentID, dateOfBirth, courseName, studentName,
                                                dateOfEnrollment, courseDuration, tuitionFee, 
                                                numOfRemainingModules,dateOfDropout,numOfMonthsAttended));
                    JOptionPane.showMessageDialog(dropoutframe, "The dropout record is successfully added", "Added Dropout Success", JOptionPane.INFORMATION_MESSAGE);
                    displaybutton2.setEnabled(true);
                }
            }
        });
        
        displaybutton2= new JButton("Display");
        displaybutton2.setBounds(425, 230, 180, 30);
        dropoutpanel.add(displaybutton2);
        displaybutton2.setEnabled(false);

        //displays the details of Dropout Registration Form for each object of Dropout
        displaybutton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                for (Student stu: arraystudent)
                {
                    if(stu instanceof Dropout)  //checking if Student object is an instance of Dropout class
                    {
                        Dropout drop=(Dropout) stu; //downcasting
                        drop.display();
                    }
                }  
            }
        });
        
        paythebillsbutton= new JButton("Pay the bills");
        paythebillsbutton.setBounds(235,350,180,30);
        dropoutpanel.add(paythebillsbutton);

        //perform the action to calculate remaining amount and display the bills method of Dropout Student
        paythebillsbutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int enrollmentID3=getEnrollmentID3();
                if(enrollmentID3==INVALID)
                {
                    JOptionPane.showMessageDialog(dropoutframe,"Enrollmentid should should always be positive", "Enrollment ID Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                boolean match=false;
                for(Student stu:arraystudent)
                {
                    if(stu instanceof Dropout)
                    {
                        Dropout drop=(Dropout) stu;
                        if(enrollmentID3 == drop.getEnrollmentID()) //checking if the Dropout enrollmentID3 matches with the Student enrollmentID
                        {
                            drop.billsPayable();
                            match=true;
                            JOptionPane.showMessageDialog(dropoutframe, "The bills has been payed and displayed in terminal" , "Success", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                        else
                        {
                            match=false;
                        }
                    }
                }
                if(match==false)
                {
                    JOptionPane.showMessageDialog(dropoutframe, "ID cannot be found", "ID Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        removedropoutbutton= new JButton("Remove dropout student");
        removedropoutbutton.setBounds(235,480,180,30);
        dropoutpanel.add(removedropoutbutton);

        //perform the action to remove dropout student 
        removedropoutbutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int enrollmentID4=getEnrollmentID4();
                if(enrollmentID4==INVALID)
                {
                    JOptionPane.showMessageDialog(dropoutframe,"Enrollmentid should always be positive","Enrollment ID Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                boolean match=false;
                for(Student stu:arraystudent)
                {
                    if(stu instanceof Dropout)
                    {
                        Dropout drop=(Dropout) stu;
                        if(enrollmentID4 == drop.getEnrollmentID())
                        {
                            drop.removeStudent();
                            match=true;
                            JOptionPane.showMessageDialog(dropoutframe, "Student has been removed and displayed in terminal", "Success", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                        else
                        {
                            match=false;
                        }
                    }
                }
                if(match==false)
                {
                    JOptionPane.showMessageDialog(dropoutframe, "ID cannot be found", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
            
        dropoutpanel.setLayout(null);
        dropoutframe.setLayout(null);
        dropoutframe.setVisible(true);
    }
    
    //getter method for Regular and Dropout form
    public String getStudentName()
    {
        String studentName = studentNamefield.getText().trim();
        return studentName;
    }
    
    public int getEnrollmentID()
    {
        int enrollmentID=INVALID;
        String stringenrollmentid = enrollmentIDfield.getText().trim();
        try
        {
            enrollmentID=Integer.parseInt(stringenrollmentid);
            if (enrollmentID <=0)
            {
                enrollmentID=INVALID;
            }
        }
        catch(NumberFormatException nfe)
        {
            
        }
        return enrollmentID;
    }
    
    public String getCourseName()
    {
        String courseName = courseNamefield.getText().trim();
        return courseName;
    }
    
    public int getCourseDuration()
    {
        int courseDuration=INVALID;
        String stringcourseduration = courseDurationfield.getText().trim();
        try
        {
            courseDuration=Integer.parseInt(stringcourseduration);
            if (courseDuration <=0)
            {
                courseDuration=INVALID;
            }
        }
        catch(NumberFormatException nfe)
        {
            
        }
        return courseDuration;
    }       

    public int getTuitionFee()
    {
        int tuitionFee=INVALID;
        String stringtuitionfee = tuitionFeefield.getText().trim();
        try
        {
            tuitionFee=Integer.parseInt(stringtuitionfee);
            if (tuitionFee <=0)
            {
                tuitionFee=INVALID;
            }
        }
        catch(NumberFormatException nfe)
        {
            
        }
        return tuitionFee;
    }

    public String getDateOfBirth()
    {
        String day= daycombobox.getSelectedItem().toString();
        String month=monthcombobox.getSelectedItem().toString();
        String year=yearcombobox.getSelectedItem().toString();
        String dateOfBirth=null;

        if(day.equals("Day") || month.equals("Month") || year.equals("Year"))
        {
            dateOfBirth= null;
        }
        else
        {
            dateOfBirth= (day + "/" + month + "/" + year);
        }
        return dateOfBirth;
    }
        
    public String getDateOfEnrollment()
    {
        String day1= day1combobox.getSelectedItem().toString();
        String month1=month1combobox.getSelectedItem().toString();
        String year1=year1combobox.getSelectedItem().toString();
        String dateOfEnrollment=null;

        if(day1.equals("Day") || month1.equals("Month") || year1.equals("Year"))
        {
            dateOfEnrollment= null;
        }
        else
        {
            dateOfEnrollment= (day1 + "/" + month1 + "/" + year1);
        }
        return dateOfEnrollment;
    }

    //getter method for only Regular form

    public int getNumOfModules()
    {
        int numOfModules=INVALID;
        String stringnumofmodules = numofmodulesfield.getText().trim();
        try
        {
            numOfModules=Integer.parseInt(stringnumofmodules);
            if (numOfModules<=0)
            {
                numOfModules=INVALID;
            }
        }
        catch(NumberFormatException nfe)
        {
            
        }
        return numOfModules;
    }

    public int getNumOfCreditHours()
    {
        int numOfCreditHours=INVALID;
        String stringnumofcredithours = numofcredithoursfield.getText().trim();
        try
        {
            numOfCreditHours=Integer.parseInt(stringnumofcredithours);
            if (numOfCreditHours<=0)
            {
                numOfCreditHours=INVALID;
                
            }
        }
        catch(NumberFormatException nfe)
        {
            
        }
        return numOfCreditHours;
    }

    public double getDaysPresent()
    {
        double daysPresent=INVALID;
        String stringdayspresent = dayspresentfield.getText().trim();
        try
        {
            daysPresent=Double.parseDouble(stringdayspresent);
            if (daysPresent<=0)
            {
                daysPresent=INVALID;
                
            }
        }
        catch(NumberFormatException nfe)
        {
            
        }
        return daysPresent;
    }

    public int getEnrollmentID1()
    {
        int enrollmentID1=INVALID;
        String stringenrollmentid1 = enrollmentIDfield1.getText().trim();
        try
        {
            enrollmentID1=Integer.parseInt(stringenrollmentid1);
            if (enrollmentID1 <=0)
            {
                enrollmentID1=INVALID;
            }
        }
        catch(NumberFormatException nfe)
        {
            
        }
        return enrollmentID1;
    }


    public double getDaysPresent1()
    {
        double daysPresent1=INVALID;
        String stringdayspresent1 = dayspresentfield1.getText().trim();
        try
        {
            daysPresent1=Double.parseDouble(stringdayspresent1);
            if (daysPresent1<=0)
            {
                daysPresent1=INVALID;
            }
        }
        catch(NumberFormatException nfe)
        {
            
        }
        return daysPresent1;
    }

    public int getEnrollmentID2()
    {
        int enrollmentID2=INVALID;
        String stringenrollmentid2= enrollmentIDfield2.getText().trim();
        try
        {
            enrollmentID2=Integer.parseInt(stringenrollmentid2);
            if (enrollmentID2 <=0)
            {
                enrollmentID2=INVALID;
            }
        }
        catch(NumberFormatException nfe)
        {
            
        }
        return enrollmentID2;
    }

    public String getCourseName1()
    {
        String courseName1 = courseNamefield1.getText().trim();
        return courseName1;
    }

    public String getDateOfEnrollment1()
    {
        String day3= day3combobox.getSelectedItem().toString();
        String month3=month3combobox.getSelectedItem().toString();
        String year3=year3combobox.getSelectedItem().toString();
        String dateOfEnrollment1=null;

        if(day3.equals("Day") || month3.equals("Month") || year3.equals("Year"))
        {
            dateOfEnrollment1= null;
        }
        else
        {
            dateOfEnrollment1= (day3 + "/" + month3 + "/" + year3);
        }
        return dateOfEnrollment1;
    }

    //getter method for only Dropout form

    public int getNumOfRemainingModules()
    {
        int numOfRemainingModules=INVALID;
        String stringnumofremainingmodules = numofremainingmodulesfield.getText().trim();
        try
        {
            numOfRemainingModules=Integer.parseInt(stringnumofremainingmodules);
            if (numOfRemainingModules<=0)
            {
                numOfRemainingModules=INVALID;
                
            }
        }
        catch(NumberFormatException nfe)
        {
            
        }
        return numOfRemainingModules;
    }

    public int getNumOfMonthsAttended()
    {
        int numOfMonthsAttended=INVALID;
        String stringnumofmonthsattended = numofmonthsattendedfield.getText().trim();
        try
        {
            numOfMonthsAttended=Integer.parseInt(stringnumofmonthsattended);
            if (numOfMonthsAttended<=0)
            {
                numOfMonthsAttended=INVALID;
                
            }
        }
        catch(NumberFormatException nfe)
        {
            
        }
        return numOfMonthsAttended;
    }

    public String getDateOfDropout()
    {
        String day2= day2combobox.getSelectedItem().toString();
        String month2=month2combobox.getSelectedItem().toString();
        String year2=year2combobox.getSelectedItem().toString();
        String dateOfDropout=null;

        if(day2.equals("Day") || month2.equals("Month") || year2.equals("Year"))
        {
            dateOfDropout= null;
        }
        else
        {
            dateOfDropout= (day2 + "/" + month2 + "/" + year2);
        }
        return dateOfDropout;
    }

    public int getEnrollmentID3()
    {
        int enrollmentID3=INVALID;
        String stringenrollmentid3 = enrollmentIDfield3.getText().trim();
        try
        {
            enrollmentID3=Integer.parseInt(stringenrollmentid3);
            if (enrollmentID3 <=0)
            {
                enrollmentID3=INVALID;
            }
        }
        catch(NumberFormatException nfe)
        {
            
        }
        return enrollmentID3;
    }

    public int getEnrollmentID4()
    {
        int enrollmentID4=INVALID;
        String stringenrollmentid4 = enrollmentIDfield4.getText().trim();
        try
        {
            enrollmentID4=Integer.parseInt(stringenrollmentid4);
            if (enrollmentID4 <=0)
            {
                enrollmentID4=INVALID;
            }
        }
        catch(NumberFormatException nfe)
        {
            
        }
        return enrollmentID4;
    }

    //getter method for checking if the enrollmentid is unique or not of Regular object
    public boolean enrollmentidunique(int enID)
    {
        boolean unique=false;
        for(Student stu: arraystudent)
        {
            if(stu instanceof Regular)
            {
                Regular regu=(Regular) stu;
                if(regu.getEnrollmentID()==enID)
                {
                    unique=true;
                    break;
                }
            }
        }
        return unique;
    }

    //getter method for checking if the enrollmentid is unique or not of Dropout object
    public boolean enrollmentidunique1(int enID)
    {
        boolean unique=false;
        for(Student stu: arraystudent)
        {
            if(stu instanceof Dropout)
            {
                Dropout drop=(Dropout)stu;
                if(drop.getEnrollmentID()==enID)
                {
                    unique=true;
                    break;
                }
            }
        }
        return unique;
    }
    public static void main(String[] args) {
        new StudentGUI();
    }
}
    





