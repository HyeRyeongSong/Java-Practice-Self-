/**
 * import java.util.Random;
 * Created by HyeRyeongSong on 2017. 1. 14..

 */

import java.util.Random;
import java.util.Scanner;

public class StringPractice
{
    public static void main(String[] argv){
        int iNum = 0;
        int iComputer;
        int iScoreOfPlayer = 0;
        int iScoreOfComputer = 0;
        String sSave;
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        while(true){
            iComputer = r.nextInt(3);
            sSave = s.next();
            if(sSave.equals("가위")){
                iNum = 0;
            }
            else if(sSave.equals("바위")){
                iNum = 1;
            }
            else if(sSave.equals("보")){
                iNum = 2;
            }
            else if(sSave.equals("End")){
                System.out.println("Computer: " +iScoreOfComputer + " Player: " +iScoreOfPlayer);
                return;
            }

            if(iComputer - iNum == 1 || iComputer - iNum == -2){
                System.out.println("Computer Wins");
                ++iScoreOfComputer;
            }
            else if(iComputer - iNum == 0){
                System.out.println("Same");
            }
            else
            {
                System.out.println("Player Wins");
                ++iScoreOfPlayer;
            }
        }
    }
}
