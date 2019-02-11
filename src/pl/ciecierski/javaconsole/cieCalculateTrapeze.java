package pl.ciecierski.javaconsole;

public class cieCalculateTrapeze extends cieCalculateRectangle
{
        float height;

        public cieCalculateTrapeze()
        {
            sideA = 0;
            sideB = 0;
            height = 0;
            field = 0;
        }

        public cieCalculateTrapeze(float a, float b, float h)
        {
            sideA = a;
            sideB = b;
            height = h;
            field = ((sideA + sideB)*height)/2;
        }


}
