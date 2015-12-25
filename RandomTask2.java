import java.lang.Math;

public class RandomTask2 {
    public static void main(String[] arg){
        int n = (int)(Math.random()*30);
        System.out.println("n= "+n);
        //Have some value of limit

        for (int i=0; i < 100; i++){
            int rand = (int)((Math.random()*2*n)-n);
            System.out.print(i+".   ");
            System.out.println(rand);
            if ((rand < -n) || (rand > n)){
                break;
            }
        //100 Numbers from the range [-n;n]
        // If one of the rand number out of the range - break loop
        }
    }
}

/*
2.Натуральное положительное число записано в переменную n. Создайте

программу, которая будет генерировать и выводить на экран целое

псевдослучайное число из отрезка [-n;n].
 */