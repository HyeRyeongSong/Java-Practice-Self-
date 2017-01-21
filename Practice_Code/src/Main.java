/**
 * Created by HyeRyeongSong on 2017. 1. 15..
 */
abstract class Parent
{
    public abstract void On();

    public abstract void Off();

    public void Up(String string)
    {
        System.out.println(string + " Up");
    }

    public void Down(String string)
    {
        System.out.println(string + " Down");
    }

}

class Child extends Parent
{
    String sName;
    public Child(String sName){
        this.sName = sName;
    }
    public void On()
    {
        System.out.println(this.sName + " On");
    }

    public void Off()
    {
        System.out.println(this.sName + " Off");
    }
}

class Child2 extends Parent{
    public void On(){
        System.out.println("Radio On");
    }
    public void Off(){
        System.out.println("Radio Off");
    }

}

public class Main
{
    public static void main(String[] args)
    {
        Child child = new Child("TV");
        child.On();
        child.Up("TV");
        child.Down("TV");
        child.Off();
        Child2 child2 = new Child2();
        child2.On();
        child2.Up("Radio");
        child2.Down("Radio");
        child2.Off();
    }
}
