
package interfraceexample;

class phone
{
    void call()
    {
        System.out.println("Calling");
    }
    void sms()
    {
        System.out.println("Messaging");
    }
}
interface camera
{
  void click();
  void record();
}
interface musicplayer
{
    void play();
    void pause();
    void stop();
}
class smartphone extends phone  implements camera,musicplayer
{
    public void videocall()
    {
        System.out.println("Video Calling");
    }
    public void click()
    {
        System.out.println("Clicking");
    }
    public void record()
    {
        System.out.println("Record");
    }
    public void play()
    {
        System.out.println("Playing");
    }
    public void pause()
    {
        System.out.println("Pausing");
    }
    public void stop()
    {
        System.out.println("Stopping");
    }
}
public class Interfraceexample {

    public static void main(String[] args) {
        smartphone s=new smartphone();
        s.videocall();
        s.call();
        s.click();
        s.play();
        camera c=s;
        c.record();
        musicplayer m=s;
        m.stop();
    }
    
}
