package interfaces.live;

import interfaces.music.Playable;
import interfaces.music.string.Veena;
import interfaces.music.wind.Sexophone;

public class Test {

	public static void main(String[] args) {
		Veena v = new Veena();
		v.play();
		
		Sexophone s = new Sexophone();
		s.play();
		
		Playable pv =new Veena();
		pv.play();
		
		Playable ps = new Sexophone();
		ps.play();

	}

}
