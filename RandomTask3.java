import java.lang.Math;

public class RandomTask3 {
    public static void main(String[] arg){
        int a=1, b=0;
        while (a >= b){
            a = (int)(Math.random()*30);
            b = (int)(Math.random()*30);
        }
        System.out.println("a="+a+"  b="+b);
        //Have some values of limit

        for (int i=0; i < 100; i++){
            int rand = (int)(Math.random()*(b-a)+a+0.1); //0.1 for working upper value of range
            System.out.print(i+".   ");
            System.out.println(rand);
            if ((rand < a) || (rand > b)){
                break;
            }
        //Print rand values in range [a;b] to see that program work correct
        }
    }
}

/*
3.В переменные a и b записаны целые числа, при этом b больше a.

Создайте программу, которая будет генерировать и выводить на экран

целое псевдослучайное число из отрезка [a;b].
 */