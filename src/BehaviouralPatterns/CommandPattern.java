package BehaviouralPatterns;

import java.util.ArrayList;
import java.util.List;

/*The aim of this pattern is to achieve seperation of concerns.
 * application---command-------ui components.
 * achieve loosely coupled desing.
 * we can change senders behaviour at runtime.
 * we can in encapsulate methods invocations - encapsulating requests as objects.
 * the method invoking component knows nothing about the impementation
 * 4 components-command,reciever,invoker and client
 * command queueing can be implemented thus we can implement undo/redo
 */

interface Command{
	public void execute();
}

//Reciever
class Light{
	public void turnOn() {
		System.out.println("Lights turned on");
	}
	public void turnOff() {
		System.out.println("Lights turned off");
	}
}

class TurnOnCommand implements Command{
	
	private Light light;
	
	
	public TurnOnCommand(Light light) {
		this.light = light;
	}


	@Override
	public void execute() {
		this.light.turnOn();
		
	}
	
}

class Switcher{
	public List<Command> commands;

	public Switcher() {
		commands = new ArrayList<>();
	}
	
	public void addCommand(Command command) {
		this.commands.add(command);
	}
	
	public void executeCommands() {
		for(Command command:commands)
			command.execute();
	}
	
}

class TurnOffCommand implements Command{
	
	private Light light;
	
	
	public TurnOffCommand(Light light) {
		this.light = light;
	}


	@Override
	public void execute() {
		this.light.turnOff();
		
	}
	
}

public class CommandPattern {
	public static void main(String[] args) {
		Light light = new Light();
		TurnOnCommand lightsOnCmd = new TurnOnCommand(light);
		TurnOffCommand lightsOffCmd = new TurnOffCommand(light);
		Switcher switcher = new Switcher();
		
		switcher.addCommand(lightsOnCmd);
		switcher.addCommand(lightsOffCmd);
		
		switcher.executeCommands();
	}
}
