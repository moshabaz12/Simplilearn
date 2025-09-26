package multithreadinfD;

class Music extends Thread{
	public  void run() {
		System.out.println("run music");
	}
}
class Videoplaye extends Thread{
	public void run() {
		
		System.out.println("video is on");
	}
	
}
public class Vlc {

	public static void main(String[] args) {
		Music hell = new  Music();
		hell.run();
		Videoplaye hello = new Videoplaye();
		hello.run();

	}

}
