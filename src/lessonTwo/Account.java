package lessonTwo;

/**
 * Created by raz on 9/21/17.
 */
public class Account {

    public static void main(String[] args) {
        School one=new School(10,5.0);
        one.display();

        School two=new School(20,10,"dhaka");
        two.display();

        School three=new School(100,20,"commila");
        three.display();
        three.show("raz",25);

        School four=new School(50,10.0);
        four.display(30,"xyz",4.5);

    }
}
