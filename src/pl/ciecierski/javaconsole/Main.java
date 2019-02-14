package pl.ciecierski.javaconsole;
/* class cieCalculateQuadrangle
objects
myCalculateSquare (float a)
myCalculateRectangle (float a, float b)
myCalulateDiamonds (float a, float h)
myCalculateTrapeze (float a, float b, float h)

//import java.lang.String;

*/

public class Main {

    public static void main(String args[]) {
	// write your code here
            //here will be User Interface
        int varA= Integer.parseInt(args [0]);
        int varB= Integer.parseInt(args [1]);
        int varH= Integer.parseInt(args [2]);
        //calculating
        cieCalculateSquare myCalculateSquare=new cieCalculateSquare(varA);
        System.out.println(myCalculateSquare.field);

        cieCalculateRectangle myCalculateRectangle=new cieCalculateRectangle(varA,varB);
        System.out.println(myCalculateRectangle.field);

        cieCalculateDiamonds myCalculateDiamonds=new cieCalculateDiamonds(varA,varH);
        System.out.println(myCalculateDiamonds.field);

        cieCalculateTrapeze myCalculateTrapeze=new cieCalculateTrapeze(varA,varB,varH);
        System.out.println(myCalculateTrapeze.field);
    }
}
