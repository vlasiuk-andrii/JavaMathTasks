/**
 * Created by andrey.prudnyk on 24.12.2015.
 */
public class SquereAndPerimetr {
    static public void main(String[] arg){
        int a = 3, b = 4;
        double s=0, p=0;
        s = (a*b)/2;
        p = a + b + Math.sqrt(a*a + b*b);
        System.out.println("s="+s);
        System.out.println("p="+p);
    }
}

/*
2.В переменных a и b лежат положительные длины катетов

прямоугольного треугольника. Вычислить и вывести на экран площадь

треугольника и его периметр.
 */