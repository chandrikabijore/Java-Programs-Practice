package com.chandrika;

public class Area_of_Triangle
{
    public static void main(String[] args)
    {
        double Area, a, b, c, s;
        a = 3;
        b = 4;
        c = 5;

        s =  (a + b + c) / 2;         // s = semi perimeter
        System.out.println("The semi perimeter : " + s);

        Area = Math.sqrt( s * (s-a) * (s-b) * (s-c) );
        System.out.println("The area of triagle is : " + Area);
    }
}

