/*
 * 
 *  LICENSE
 * 
 */
package tp2;

/**
 *
 * @author link_v12
 */
public class Student {
    private String name;
    private long studentId;
    private boolean isMale;
    private double grade;

    public Student(String name, long studentId, boolean isMale, double grade) {
        this.setName(name);
        this.setStudentId(studentId);
        this.isMale = isMale;
        this.setGrade(grade);
    }

    public Student(String name, long studentId, boolean isMale) {
        this.setName(name);
        this.setStudentId(studentId);
        this.isMale = isMale;
    }

    public Student(String name, long studentId, double grade) {
        this.setName(name);
        this.setStudentId(studentId);
        this.setGrade(grade);
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != "" && name != null ) this.name = name;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
       if (studentId >= 100000 && studentId < 10000000) this.studentId = studentId;
    }

    public boolean isIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 4)  this.grade = grade;
    }
    
    public void display () {
        System.out.println("Name: "+name);
        System.out.println("StudentID: "+studentId);
        if(isMale) {
            System.out.println("Sex: Male");
        } else {
            System.out.println("Sex: Female");
        }
        System.out.println("Grade: "+grade);
    }
    
    public static void main(String[] args) {
    Student s1 = new Student("Max",321032,true,3.7);
    Student s2 = new Student("Anny",23331,true);
    Student s3 = new Student("Bobby",22122,true);
    System.out.println("Student 1");
    s1.display();
    System.out.println("Student 2");
    s2.display();
    System.out.println("Student 3");
    s3.display();
    }
}
