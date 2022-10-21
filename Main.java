import java.util.Comparator;

public class Main implements Comparator<Student> {


    public int compare(Student s1, Student s2) {

        if(s1.equals(s2))
            return 0;
        else if (s1.getName().compareTo(s2.getName()) > 0)
            return 1;
        else
            return -1;
    }public static void main(String[] args)
    {
        Student s1 = new Student("Duy",9,3.3, 3);
        Student s2 = new Student("Nig",10,2.8,1);


        System.out.println(s1.compareTo(s2));

        int num = s1.compareTo(s2);

        if(num < 0 )
        {
            System.out.println(s1.getName() + " dung truoc " + s2.getName());
        } else if (num > 0)
        {
            System.out.println(s2.getName() + " dung truoc " + s1.getName());
        }
        else
        {
            System.out.println(s1.getName() + " giong nhau " + s2.getName());
        }

        System.out.println();

        Main otherWay = new Main();
        System.out.println(otherWay.compare(s1,s2));

        int var = otherWay.compare(s1,s2);

        if(var < 0 )
        {
            System.out.println(s1.getName() + " dung truoc " + s2.getName());
        } else if (var > 0)
        {
            System.out.println(s2.getName() + " dung truoc " + s1.getName());
        }
        else
        {
            System.out.println(s1.getName() + " giong nhau " + s2.getName());
        }
    }
}