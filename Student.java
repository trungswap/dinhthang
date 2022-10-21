public class Student implements Comparable<Student>
{
    private String name;
    private int grade;
    private double Gpa;

    private int ID;

    public Student(String n, int gr, double g, int id)
    {
        name =n;
        grade = gr;
        Gpa =g;
        ID = id;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getGpa() {
        return Gpa;
    }



    @Override
    public  String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", Gpa=" + Gpa +
                ", ID=" + ID +
                '}';
    }

    @Override
    public int compareTo(Student other) {

        if(getID() > other.getID())
        {
            return 1;
        }
        else if(getID() < other.getID())
        {
            return -1;
        }

        else {
            return 0;
        }
    }



//    public int compareTo(Student other) {
//
//        if(getName().compareTo(other.getName()) > 0)
//        {
//            return 1;
//        }
//        else if(getName().compareTo(other.getName()) < 0)
//        {
//            return -1;
//        }
//        else {
//            return 0;
//        }
//    }

}
