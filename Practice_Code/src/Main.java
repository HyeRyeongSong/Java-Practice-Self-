/**
 * Created by HyeRyeongSong on 2017. 1. 15..
 */
interface Parent1
{
    public abstract void On();

    public abstract void Off();
}

interface Parent2
{
    public abstract void Up();

    public abstract void Down();
}

class TV implements Parent1, Parent2{
    public void Up(){
        System.out.println("Channel Up");
    }
    public void Down(){
        System.out.println("Channel Down");
    }
    public void On(){
        System.out.println("Channel On");
    }
    public void Off(){
        System.out.println("Channel Off");
    }

}

public class Main
{
    public static void main(String[] args)
    {
        TV tv = new TV();
        tv.On();
        tv.Up();
        tv.Down();
        tv.Off();
    }
}
