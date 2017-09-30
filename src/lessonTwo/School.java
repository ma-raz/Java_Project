package lessonTwo;

/**
 * Created by raz on 9/20/17.
 */
public class School {

    int student;
    double teacher;
    String location;
    boolean foreign;

    //public School() {
   // }
    public School(int student,double teacher){
        this.student=student;
        this.teacher=teacher;
    }

    public School(int student, double teacher, String location) {
        this.student = student;
        this.teacher = teacher;
        this.location = location;
    }


    public void  display(){

        System.out.println("i am in method one");
        /*
        System.out.println("i am a school in "+location);
        System.out.println("no of student "+student);
        System.out.println("no of teacher is "+teacher);
        System.out.println("is in foreign country? "+foreign); */

    }

    public void display(int age,String nameOfClass){

        System.out.println("i am in method second");

    }

    public void display(int age,String nameOfClass,double grade){
        System.out.println("i am in method third");

    }

    public void display(double grade,int age,String nameOfClass){
        System.out.println("i am in method fourth");
    }


    public void show(String name,int age){
        System.out.println("Name is "+name +" age is "+age);
    }


    public static void main(String[] args) {
        School dhaka=new School(100,10,"Dhaka");
        School myn=new School(200,20);
        School syl=new School(150,12);

       dhaka.location="chittagaon";
       /*
        dhaka.student=100;
        dhaka.teacher=10;
        dhaka.foreign=true;
        */

        myn.location="mymensingh";
       // myn.student=200;

        syl.location="shylet";
        //syl.student=300;
       // syl.teacher=15;


        System.out.println(" no of student in sylhet is "+syl.student);
        System.out.println(" no of student in dhaka is "+dhaka.student);
        System.out.println("***********************************************");

        syl.display();
        System.out.println("***************************************");
        dhaka.display();
        System.out.println("***************************************");
        myn.display();

    }

}
