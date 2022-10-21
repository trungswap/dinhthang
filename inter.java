import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
public class inter implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        if(s1.equals(s2))
            return 0;
        else if (s1.getGpa() < s2.getGpa())
            return 1;
        else
            return -1;
    }
    public static void main(String[] args) {
        Student s1 = new Student("Duy", 9, 3.3, 3);
        Student s2 = new Student("Ni", 10, 2.8, 1);
        Student s3 = new Student("Ga", 6, 1.7, 2);

        inter decending = new inter();
        Student[] students = {s1,s2,s3};
        System.out.println("\n Unsorted : ");
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println("\n Sorted : ");
        System.out.println(Arrays.toString(students));

        System.out.println();

        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(s1);
        students1.add(s2);
        students1.add(s3);

        System.out.println("\n Unsorted : ");
        System.out.println(students1);
        Collections.sort(students1,decending);
        System.out.println("\n Sorted : ");
        System.out.println(students1);
    }
}
