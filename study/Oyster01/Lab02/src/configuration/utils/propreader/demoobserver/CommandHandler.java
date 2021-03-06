package configuration.utils.propreader.demoobserver;

import java.util.Observable;
import java.util.Observer;

import configuration.utils.propreader.LineEvent;

public class CommandHandler implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		String line = ((LineEvent) arg).getLine().trim();
		if (!line.startsWith("@")){return;}
		System.out.println("COMMAND");
		System.out.println(line);		
	}

}
