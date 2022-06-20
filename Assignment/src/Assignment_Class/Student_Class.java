package Assignment_Class;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Student_Class {
    
    private String id;
    private String name;
    private String age;
    private String IC_PP;
    private String gender;
    private String phonenumber;
    private String email;
    private String program;
    private String intake; 
    
    public Student_Class(){}
    
    public Student_Class(String id, String name, String age, String IC_PP, String gender, String phonenumber, String email, String program, String intake){
        this.id = id;
        this.name = name;
        this.age = age;
        this.IC_PP = IC_PP;
        this.gender = gender;
        this.phonenumber = phonenumber;
        this.email = email;
        this.program = program;
        this.intake = intake;
    }
    public String getID() {
        return id;
    }
    public void setID(String id) {
        this.id = id;
    }    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }    
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }    
    public String getIC_PP() {
        return IC_PP;
    }
    public void setIC_PP(String IC_PP) {
        this.IC_PP = IC_PP;
    }    
    public String getGender() {
        return gender;
    }   
    public void setGender(String gender) {
        this.gender = gender;
    } 
    public String getPhoneNumber() {
        return phonenumber;
    }
    public void setPhoneNumber(String phonenumber ) {
        this.phonenumber = phonenumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public String getIntake() {
        return intake;
    }
    public void setIntake(String intake) {
        this.intake = intake;
    }
    
    public void RegisterStudent(){
        
        try{
            FileWriter writer = new FileWriter("StudentDetails.txt",true);
            writer.write(id);
            writer.write("  ");
            writer.write(name);
            writer.write("  ");
            writer.write(age);
            writer.write("  ");
            writer.write(IC_PP);
            writer.write("  ");
            writer.write(gender);
            writer.write("  ");
            writer.write(phonenumber);
            writer.write("  ");
            writer.write(email);
            writer.write("  ");
            writer.write(program);
            writer.write("  ");
            writer.write(intake);
            writer.write(System.getProperty("line.separator"));
            writer.close();
        }
            
        catch (Exception e) {
            e.printStackTrace();
        }        
    }
    
    public void EditStudent(String edit){
        String temp =  "Studenttext.txt";
        String Filename = "StudentDetails.txt";
        String r = null;

        StringBuilder builder = new StringBuilder();
        try {
            FileReader fr = new FileReader(Filename);
            BufferedReader br = new BufferedReader(fr);
            while((r = br.readLine())!= null){
                r = r.trim();
                if(r.indexOf(edit) == -1){builder.append(r).append("\r\n");}
            }
            br.close();
            FileWriter fw = new FileWriter(Filename);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(builder.toString());
            bw.flush();
            bw.close();

            FileWriter writer = new FileWriter("StudentDetails.txt",true);
            writer.write(id);
            writer.write("  ");
            writer.write(name);
            writer.write("  ");
            writer.write(age);
            writer.write("  ");
            writer.write(IC_PP);
            writer.write("  ");
            writer.write(gender);
            writer.write("  ");
            writer.write(phonenumber);
            writer.write("  ");
            writer.write(email);
            writer.write("  ");
            writer.write(program);
            writer.write("  ");
            writer.write(intake);
            writer.write(System.getProperty("line.separator"));
            writer.close();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean RemoveStudent(String studentid){
        Boolean status = false;
        String temp =  "Studenttext.txt";
        String Filename = "StudentDetails.txt";
        String r = null;
        StringBuilder builder = new StringBuilder();
        
        try {
            File ModulesFile = new File(Filename);
            Boolean FileCreated = ModulesFile.createNewFile();
            Scanner Sc = new Scanner(ModulesFile);
           
            while (Sc.hasNextLine()) {
                String temp2 = Sc.nextLine();

                String temp3[] = temp2.split("  ",0);
                                System.out.println(temp3[0]);
                if (temp3[0].equalsIgnoreCase(studentid)) {
                    status = true;
                }
            }       
        } catch (IOException ignored) {}
                  
        if (status) {
            try {
            FileReader fr = new FileReader(Filename);
            BufferedReader br= new BufferedReader(fr);
            while((r=br.readLine())!= null){
                r=r.trim();
                if(r.indexOf(studentid) == -1){builder.append(r).append("\r\n");}
            }
            br.close();
            FileWriter fw = new FileWriter(Filename);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(builder.toString());
            bw.flush();
            bw.close();    

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        } else {
            JOptionPane.showMessageDialog(null, "Student ID Not Found","Error Message",JOptionPane.INFORMATION_MESSAGE);
        }
        return status;
    }        
  
}
