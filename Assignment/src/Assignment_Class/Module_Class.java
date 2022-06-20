    package Assignment_Class;

import assignment.DeleteModule;
import java.io.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class Module_Class {
    
    private String program;
    private String intake;
    private String modulename;

    public Module_Class(){}

    public Module_Class(String modulename, String program, String intake){       
        this.program = program;
        this.intake = intake;
        this.modulename = modulename;
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
     * @return the modulename
     */
    public String getModulename() {
        return modulename;
    }

    /**
     * @param modulename the modulename to set
     */
    public void setModulename(String modulename) {
        this.modulename = modulename;
    }
    
    public void AddModule(String Filename,String modulename){
        
        try{
            FileWriter modulewriter = new FileWriter(Filename,true);
            if(!modulename.isEmpty()){
                modulewriter.write(intake + "\t");
                modulewriter.write(modulename);
                modulewriter.write("\n");
                modulewriter.close();
            }
            else{
                JOptionPane.showMessageDialog(null, "Something Wrong!\nPlease try again!");               
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public Boolean DeleteModule(String Filename, String modulename) throws IOException{
        Boolean status = false;
        boolean ModuleCheck = true;
        File ModifiedFile = new File(Filename);
        Boolean FileCreated = ModifiedFile.createNewFile();
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        
        try {
            reader = new BufferedReader(new FileReader(ModifiedFile));
            String line = reader.readLine();
            while (line != null) {
                String temp[] = line.split("	", 0);
                if (modulename.equalsIgnoreCase(temp[1])) {
                    //System.out.println("yes");
                    ModuleCheck = false;
                } else {
                    oldContent = oldContent + line + System.lineSeparator();
                }
                line = reader.readLine();
            }
            if (!ModuleCheck) {
                String newContent = oldContent.replace(modulename, "");
                writer = new FileWriter(Filename);
                writer.write(newContent);
                writer.close();
                status=true;
            } else {
                status=false;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return status;
    }
       
}
