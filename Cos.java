/**
 * Created by andrey.prudnyk on 24.12.2015.
 */
import java.lang.Math;

public class Cos {
    static public void main(String[] arg){
        int x60 = 60;
        int x45 = 45;
        int x40 = 40;
        double x60Double = Math.toRadians(x60);
        double x45Double = Math.toRadians(x45);
        double x40Double = Math.toRadians(x40);
        System.out.println(Math.cos(x60Double));
        System.out.println(Math.cos(x45Double));
        System.out.println(Math.cos(x40Double));
    }
}

/*
1.Вычислить и вывести на экран косинусы углов в 60, 45 и 40 градусов

без использования функции Math.toDegrees(n).
 */