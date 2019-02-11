package pl.ciecierski.javaconsole;
/* class cieCalculateQuadrangle
objects
myCalculateSquare (float a)
myCalculateRectangle (float a, float b)
myCalulateDiamonds (float a, float h)
myCalculateTrapeze (float a, float b, float h)



*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        cieCalculateSquare myCalculateSquare=new cieCalculateSquare(5);
        System.out.println(myCalculateSquare.field);
        cieCalculateRectangle myCalculateRectangle=new cieCalculateRectangle(63,7);
        System.out.println(myCalculateRectangle.field);
        cieCalculateDiamonds myCalculateDiamonds=new cieCalculateDiamonds(8,9);
        System.out.println(myCalculateDiamonds.field);
        cieCalculateTrapeze myCalculateTrapeze=new cieCalculateTrapeze(44,7,2);
        System.out.println(myCalculateTrapeze.field);
    }
}
