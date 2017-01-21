/**
 * Created by HyeRyeongSong on 2017. 1. 15..
 */
public class Manage extends Profile
{
    int iBonus;
    public void printAll(){
        System.out.println("이름: " + super.sName);
        System.out.println("총 수입: " + (super.iSalary+this.iBonus));
    }
}
