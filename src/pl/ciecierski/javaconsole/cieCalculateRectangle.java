package pl.ciecierski.javaconsole;

public class cieCalculateRectangle extends cieCalculateSquare
{
    float sideB;

    public cieCalculateRectangle ()
    {
        sideA = 0;
        sideB = 0;
        field = 0;
    }

    public cieCalculateRectangle(float a, float b)
    {
        sideA = a;
        sideB = b;
        field = sideA * sideB;
    }
}
