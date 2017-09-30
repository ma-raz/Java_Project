package lessonTwo;

/**
 * Created by raz on 9/28/17.
 */
public class ChildClass extends ParentClass {

    int age= 20;
    String name="child";

    public void walk(){
        System.out.println("i am fine in walking");
    }

    public void singing(){
        System.out.println("i love to sing a song");
    }

    public static void main(String[] args) {
         /*   ParentClass parent=new ParentClass();
        System.out.println(parent.age);
        System.out.println(parent.name);
        parent.walk();
        parent.eat(); */
        System.out.println("*********************************************************");

        ChildClass child=new ChildClass();
        System.out.println(child.age);
        System.out.println(child.name);
        child.walk();
        child.singing();

        System.out.println("***************************************************");

        ParentClass parent=new ChildClass();     //up casting
        System.out.println(parent.age);
        System.out.println(parent.name);
        parent.eat();
        parent.walk();

       // ChildClass child=new ParentClass();

        ((ChildClass)parent).singing(); //down casting

    }

}
