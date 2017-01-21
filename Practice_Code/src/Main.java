/**
 * Created by HyeRyeongSong on 2017. 1. 14..
 */
public class Main
{

    public Main(String sString){
        System.out.println(sString);
    }
    public Main(){
        System.out.println("Test");
    }
    public static void main(String[] argv){
        Main m = new Main("Just");
        Sub s = new Sub();
    }

}
