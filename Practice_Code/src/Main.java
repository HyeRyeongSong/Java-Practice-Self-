/**
 * Created by HyeRyeongSong on 2017. 1. 15..
 */
public class Main
{
    public static void main(String[] args)
    {
        Thread t = new Thread(){
            public void run(){
                for(int i=1; i<10; ++i){
                    System.out.println(i);
                }
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                while(true){
                    System.out.println("A");
                }
            }
        };
        t2.start();
        t.start();
        System.out.println("JUST");
    }
}
