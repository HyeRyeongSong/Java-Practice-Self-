/**
 * Created by hyeryeongsong on 2017. 1. 13..
 */

import java.util.Random;

public class Test
{
    public static void main(String[] args)
    {
        int[] iLotto = new int[5];
        int iNum;
        for (int i = 0; i < iLotto.length; ++i)
        {
            Random r = new Random();
            iLotto[i] = r.nextInt(5);
            for (int j = 0; j < i; ++j)
            {
                if (iLotto[j] == iLotto[i])
                {
                    --i;
                }
            }
        }
        for(int i:iLotto){
            System.out.println(i);
        }
    }
}