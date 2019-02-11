package pl.ciecierski.javaconsole;
/* class cieCountingQuadrangle
method: public float countSquare (float a)


*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        cieCalculateSquare myCalculateSquare=new cieCalculateSquare(5);
        System.out.println(myCalculateSquare.field);
        cieCalculateRectangle myCalculateTRectangle=new cieCalculateRectangle(63,7);
        System.out.println(myCalculateTRectangle.field);
        cieCalculateDiamonds myCalculateDiamonds=new cieCalculateDiamonds(8,9);
        System.out.println(myCalculateDiamonds.field);
        cieCalculateTrapeze myCalculateTrapeze=new cieCalculateTrapeze(44,7,2);
        System.out.println(myCalculateTrapeze.field);
    }
}
