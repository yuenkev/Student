/*
Author: Kevin Yuen
Date: January 28, 2022
 */
package studentlist;

/**
 *
 * @author Ronak
 */
public class Student {
    
    private String studentId;
    private String studentName;
    
    public Student(String studentId,String studentName){
        this.studentId = studentId;
        this.studentName=studentName;                
    }
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    
    
}
