
public class Runner {
	
	public static void main (String [] args){ //client
		TVScreen tv = new TVScreen();
		N64Console console = new N64Console(new NoGame(tv));
		console.powerOn();
		
		console.insertGame(new MarioKart(tv));
		console.powerOn();
	}

}
