package by.it.meshchenko.jd01_05;

import by.it.meshchenko.jd01_04.InOut;
import by.it.meshchenko.jd01_04.TaskA;
import by.it.meshchenko.jd01_04.TaskB;
import by.it.meshchenko.jd01_04.Util;

import java.io.IOException;

public class Runner05 {
    public static void main(String[] args) throws IOException {
        //Task1
        // a=756.13, x=0.3
        Task1.main(756.13, 0.3);

        //Task2
        //a=1.12, b=0.371
        Task2.main(1.12, 0.371, false);
        Task2.main();

        //Task3
        // x=12.1, -5<=a<=12, delta a = 3.75
        Task3.calculate(-5, 12, 12.1, 3.75);

        //Task4
        // 1<=x<=8, delta x = 1, i=6..11
        Task4.calculate(1, 8, 1, new double[]{6, 7, 8, 9, 10, 11});

    }
}
