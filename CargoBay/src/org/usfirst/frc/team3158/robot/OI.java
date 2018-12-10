package org.usfirst.frc.team3158.robot;
import edu.wpi.first.wpilibj.Joystick; 
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	public Joystick pilot,copilot;
	public JoystickButton a,b,x,y,start,select,ls,rs, lb, rb;
	public int driver;
	double ly,lx, gi, gr;
	public OI(){
			
			pilot = new Joystick(0);
			copilot = new Joystick(1);
			
			a = new JoystickButton(pilot,1);
			b = new JoystickButton(pilot,2);
			x = new JoystickButton(pilot,3);
			y = new JoystickButton(pilot,4);
			
			lb = new JoystickButton(pilot,5);
			rb = new JoystickButton(pilot,6);
			
			ls= new JoystickButton(pilot,9);
			rs= new JoystickButton(pilot,10);
			
			
			a.whenPressed(new SolenoidArmCommand(-1));
			x.whenPressed(new SolenoidArmCommand(1));
			
			
			//Garra
			
			lb.whenPressed(new ClawOpenClose(1));
			rb.whenPressed(new ClawOpenClose(-1));



			}

	
		
		
public Joystick getPilot(){
return pilot;
}
		
public Joystick getCopilot(){
	return copilot;
}


//// CREATING BUTTONS
// One type of button is a joystick button which is any button on a
//// joystick.
// You create one by telling it which joystick it's on and which button
// number it is.
// Joystick stick = new Joystick(port);
// Button button = new JoystickButton(stick, buttonNumber);

// There are a few additional built in buttons you can use. Additionally,
// by subclassing Button you can create custom triggers and bind those to
// commands the same as any other Button.

//// TRIGGERING COMMANDS WITH BUTTONS
// Once you have a button, it's trivial to bind it to a button in one of
// three ways:

// Start the command when the button is pressed and let it run the command
// until it is finished as determined by it's isFinished method.
// button.whenPressed(new ExampleCommand());

// Run the command while the button is being held down and interrupt it once
// the button is released.
// button.whileHeld(new ExampleCommand());

// Start the command when the button is released and let it run the command
// until it is finished as determined by it's isFinished method.
// button.whenReleased(new ExampleCommand());
		
}