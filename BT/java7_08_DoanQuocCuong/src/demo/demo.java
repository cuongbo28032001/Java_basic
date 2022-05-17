package demo;

import java.util.Random;

public class demo {
    public static void main(String[] args) {
        String[]  name= new String[100];
        Random rd = new Random();
        for(int i=0; i<10; i++)
        {
            int ma = rd.nextInt(10) + 1;
            name[i] = "CN" + ma;
            for(int j=0; j<i; j++)
            {
                if(name[i].compareTo(name[j] )== 0)
                {
                    i--;
                }
            }
        }
        for(int i=0; i<10; i++)
        {
            System.out.println(name[i]);
        }
    }
}
