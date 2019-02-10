package pl.ciecierski.javaconsole;

public class cieCalculateRectangle extends cieCalculateSquare
{
    float sideB;
    public cieCalculateSquare

    {
        sideA = 0;
        sideB = 0;
        field = 0;
    }
}

    public cieCalculateSquare(float a, float b)
    {
        sideA = a;
        sideB = b;
        field = sideA * sideB;
    }
}