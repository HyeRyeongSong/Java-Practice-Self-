/**
 * Created by HyeRyeongSong on 2017. 1. 14..
 */

import java.util.Random;
import java.util.Scanner;

public class BaseBall
{
    public static void main(String[] args)
    {
        int[] iNum = new int[3];
        int[] iUserNum = new int[3];
        Random r = new Random();
        for(int i=0; i<iNum.length; ++i){
            iNum[i] = r.nextInt(9);
            for(int j=0; j<i; ++j){
                if(iNum[i] == iNum[j]){
                    --i;
                }
            }
        }
        Scanner s = new Scanner(System.in);
        while(true){
            int iBall = 0;
            int iStrike = 0;
            int iNum2 = s.nextInt();
            iNum[0] = iNum2 / 100;
            iNum[1] = (iNum2 /10) % 10;
            iNum[2] = iNum2 % 10;
            for(int i=0; i<iNum.length; ++i){
                if(iUserNum[i] == iNum[i]){
                    ++iStrike;
                }
                for(int j=0; j<iNum.length; ++j){
                    if(j!=i && iUserNum[i] == iNum[j]){
                        ++iBall;
                    }
                }
            }
            System.out.println("Strike: " +iStrike + " Ball: " +iBall);
            if(iStrike == 3){
                break;
            }

        }
    }
}
