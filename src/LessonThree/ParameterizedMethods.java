package LessonThree;

/**
 * Created by raz on 9/28/17.
 */
public class ParameterizedMethods {


    public static void methodOne(){
        System.out.println("i am in method one");
    }

    public static void methodTwo(int roll, String name,double grade) {
        System.out.println("name is "+name+" roll is "+roll+" grade is "+grade);

    }
     static void methodTwo(int roll, String name) {
        System.out.println("name is "+name+" roll is "+roll+" grade is ");

    }


    public static int merhodThree(int a,int b){
        int sum=a+b;
        System.out.println(sum);
        return sum;
    }
    public static double merhodThree(int a,double b,double c){
        double sum=a+b+c;
        System.out.println(sum);
        return (a+b);
    }



    public static void main(String[] args) {
       // methodOne();
       // methodTwo(100,"suman",3.5);
      //  methodTwo(50,"xyz",4.0);
       // merhodThree(10,15);
       // merhodThree(10,20,30);
        System.out.println("return from method three is "+merhodThree(10,15.0,20.0));



    }
}
