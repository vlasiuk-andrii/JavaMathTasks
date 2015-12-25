/**
 * Created by andrey.prudnyk on 25.12.2015.
 */
import java.lang.Math;

public class RandomTask1 {
    static public void main(String[] arg){
        for (int i=0; i < 1000; i++){
            double num = (Math.random()*6)-3;
            System.out.print(i+".   ");
            System.out.println(num);
            if ((num < -3) || (num >= 3)){
                break;
            }
        }

    }
}

/*
1.Создайте программу, которая будет генерировать и выводить на экран

вещественное псевдослучайное число из промежутка [-3;3).
 */