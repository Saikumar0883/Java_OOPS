
import java.util.*;

class person {
    private String name;
    private String add;

    person(String a, String b) {
        name = a;
        add = b;
    }
}

class Student extends person {
    String courses[];
    int grades[];
    int index;

    Student(String name, String add) {
        super(name, add);
        courses = new String[30];
        grades = new int[30];
        index=0;
    }

    void addcourse(String course,int grade)
    {
        if(index>=30)
        {
            System.out.println("limit exceeded");
            return;
        }
        courses[this.index]=course;
        grades[index++]=grade;
    }

    double getAverage()
    {
        if(index==0)return 0;
        double sum=0;
        for(int i=0;i<index;i++)
        {
            sum+=grades[i];
        }
        return sum/(index);
    }


}

class Teacher extends person{
    String courses[];
    int index;

    Teacher(String a,String b)
    {
        super(a,b);
        courses=new String[5];
        index=0;
    }
    void addcourse(String name)
    {
        if(index>=5)
        {
            System.out.println("Limit Exceeded");
        }
        else{
            courses[index++]=name;
            System.out.println(name + " course is added");
        }
    }
    void removecourse(String name)
    {
        boolean a=false;
        for(int i=0;i<index;i++)
        {
            if(courses[i].compareTo(name)==0)
            {
                a=true;
                for(int j=i;j<index-1;j++)
                {
                    courses[j]=courses[j+1];
                }
                System.out.println("Course removed is "+ name);
                break;
            }
        }
        if(a==false)
        {
            System.out.println("course not found");
        }
        
    }
}
class second {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Student s1=new Student("sai","kmr");
        Teacher t=new Teacher("sai","kumar" );
        t.addcourse("tel");
        t.addcourse("eng");
        t.addcourse("hid");
        t.addcourse("math");
        t.addcourse("sce");
        t.addcourse("soc");
        t.removecourse("tel");
        
    }
}