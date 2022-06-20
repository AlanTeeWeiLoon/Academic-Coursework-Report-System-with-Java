
package Assignment_Class;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Mark_Class {
    
    private String program;
    private String intake;
    private String module;
    private String studentid;
    private String name;
    private int Quiz;
    private int LabTest;
    private int Assignment;
    private String comment;
    
    
    public Mark_Class(){}
    
    public Mark_Class(String program,String intake,String module,String studentid,String name,int Quiz,int LabTest,int Assignment){
        
        this.Assignment=Assignment;
        this.LabTest=LabTest;
        this.Quiz=Quiz;
        this.intake=intake;
        this.module=module;
        this.name=name;
        this.program=program;
        this.studentid=studentid;
        this.comment=comment;
    }
    
    
    
    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * @return the intake
     */
    public String getIntake() {
        return intake;
    }

    /**
     * @param intake the intake to set
     */
    public void setIntake(String intake) {
        this.intake = intake;
    }

    /**
     * @return the module
     */
    public String getModule() {
        return module;
    }

    /**
     * @param module the module to set
     */
    public void setModule(String module) {
        this.module = module;
    }

    /**
     * @return the studentid
     */
    public String getStudentid() {
        return studentid;
    }

    /**
     * @param studentid the studentid to set
     */
    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the Quiz
     */
    public int getQuiz() {
        return Quiz;
    }

    /**
     * @param Quiz the Quiz to set
     */
    public void setQuiz(int Quiz) {
        this.Quiz = Quiz;
    }

    /**
     * @return the LabTest
     */
    public int getLabTest() {
        return LabTest;
    }

    /**
     * @param LabTest the LabTest to set
     */
    public void setLabTest(int LabTest) {
        this.LabTest = LabTest;
    }

    /**
     * @return the Assignment
     */
    public int getAssignment() {
        return Assignment;
    }

    /**
     * @param Assignment the Assignment to set
     */
    public void setAssignment(int Assignment) {
        this.Assignment = Assignment;
    }
    
    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
    
    public boolean checkMark(){
        Boolean Status = true;
        
        try{
            if (Quiz < 0 || Quiz > 10) {
                JOptionPane.showMessageDialog(null,"Invalid Value, please enter marks beteween 0 to 10", "Error Message", JOptionPane.ERROR_MESSAGE);
                Status = false;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid number, please enter correct Quiz marks","Error Message", JOptionPane.ERROR_MESSAGE);
            Status = false;
        }
        try{

            if (LabTest < 0  || LabTest > 40) {
                JOptionPane.showMessageDialog(null,"Invalid Value, please enter marks beteween 0 to 40", "Error Message", JOptionPane.ERROR_MESSAGE);
                Status = false;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid number, please enter correct LabTest marks","Error Message", JOptionPane.ERROR_MESSAGE);
            Status = false;
        }
        try{

            if (Assignment < 0  || Assignment > 50) {
                JOptionPane.showMessageDialog(null,"Invalid Value, please enter marks beteween 0 to 50", "Error Message", JOptionPane.ERROR_MESSAGE);
                Status = false;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid number, please enter correcct Assignmnet marks","Error Message", JOptionPane.ERROR_MESSAGE);
            Status = false;
        }
        try{

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid Value","Error Message", JOptionPane.ERROR_MESSAGE);
            Status = false;
        }
        return Status;
    }

    public void markEntry(boolean checkMark){
        
        int FinalMark = Quiz + LabTest + Assignment;
        
        String temp = module + ", " + Quiz + ", " + LabTest + ", " + Assignment + ", " + FinalMark + ", " + comment;

        if (checkMark==true) {
            try {
                
                
                Scanner studentmark = new Scanner(new File("StudentDetails.txt"));
                Boolean status = false;
                while(studentmark.hasNextLine()){
                    String student = studentmark.nextLine();
                    String[] detail = student.split("  ", 0);
                    if(studentid.equalsIgnoreCase(detail[0])){
                        String temp1 = detail[0] + ", " + detail[1] + ", " + detail[7] + ", " + detail[8] + ", " + temp;
                        File StdMark = new File("StudentMarks.txt");
                        Boolean FileCreated = StdMark.createNewFile();
                        BufferedWriter UserDB = new BufferedWriter(new FileWriter("StudentMarks.txt", true));
                        UserDB.write(temp1);
                        UserDB.newLine();
                        UserDB.close();
                        status = true;
                    }
                }
                if (status) {
                    JOptionPane.showMessageDialog(null, "Mark Entry Success","Comfirmation Message",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Student Id not found","Error Message",JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
            catch (Exception Ignored) {}

        }
    }
}
