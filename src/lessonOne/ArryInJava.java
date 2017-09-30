package lessonOne;

/**
 * Created by raz on 9/20/17.
 */
public class ArryInJava {

    public static void main(String[] args) {
        int[] one;
        one=new int[5];
        one[0]=3;
        one[1]=5;
        one[2]=10;
        one[3]=12;
        one[4]=15;


        int []two={3,5,7,9,20};

       // System.out.println(one[2]);
        int i;

        for (  i=0; i<=4; i++){

            System.out.println(" value of index " + one[i]);
        }

        System.out.println("**********************************************");

        for ( i=0; i<one.length; i++){

            System.out.println(" value of index " + two[i]);
        }

    }

    /**
     * Created by raz on 9/20/17.
     */
    public static class DoWhileLoop {
        public static void main(String[] args) {
            int x=5; double y=0;
          /*  do{
                System.out.println(x+": "+y);
                x+=3;
                y+=2;
            }while (y<=20);
            */
            while (x>10){
                System.out.println("vale of x is "+x);
            }

            do {
                System.out.println("vale of x is "+x);
            }while (x>10);
        }
    }

    /**
     * Created by raz on 9/20/17.
     */
    public static class ForLoop {
        public static void main(String[] args) {

        int i;     // double i, then it will work decimal point. like i+=.5
        for(i=10;i<20;i+=2){
            System.out.println(i);
        }
        }
    }

    /**
     * Created by raz on 9/20/17.
     */
    public static class IfElseStatement {
        public static void main(String[] args) {

            int x=25,y=30;
            int c;
            c=40;
            if(x<c){
                System.out.println("x is less than c "+y);

            }
            else if(x<y)
                {
                    System.out.println(c);
                }
                else if (y>c){
                    System.out.println(y);
                }
                else {
                System.out.println(c);

            }

            }


        }
}
