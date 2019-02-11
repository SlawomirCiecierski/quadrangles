package pl.ciecierski.javaconsole;

public class cieCalculateDiamonds extends cieCalculateSquare
{
    float height;

    public cieCalculateDiamonds()
    {
        sideA = 0;
        height = 0;
        field = 0;
    }

    public cieCalculateDiamonds(float a, float h)
    {
        sideA = a;
        height = h;
        field = sideA * height;
    }

}
