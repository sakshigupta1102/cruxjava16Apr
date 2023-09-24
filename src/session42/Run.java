package session42;
public class Run implements runnable, playable{
	@Override
	public void run() {
		System.out.println("running");
	}
	@Override
	public int havefun() {
		System.out.println("having fun");
		return 0;
	}
	@Override
	public void play() {
	System.out.println("playing ");
	}
	@Override
	public void def_fun(){
		System.out.println("i am default function");
	}	
}
