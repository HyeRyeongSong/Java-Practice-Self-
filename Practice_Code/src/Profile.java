/**
 * Created by HyeRyeongSong on 2017. 1. 15..
 */
public class Profile
{
    private String sIDNum = "12345678";
    public String sName = "My Name";
    int iSalary = 9999999;
    public void printprofile()
    {
        System.out.println("주민번호: " + sIDNum);
        System.out.println("이름: " + sName);
        System.out.println("월급: " + iSalary);
    }
}
