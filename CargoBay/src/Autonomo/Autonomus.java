package Autonomo;

import org.usfirst.frc.team3158.robot.ClawOpenClose;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomus extends CommandGroup {
//FROM RIGHT
	float turn = .57f;
	float awantaaPlox = .6f;

	public Autonomus() {
//Hacia adelante con distancia 1 CargoBay hasta el giro y awantaa
		addSequential(new DriveForward_1(3.0f, false));
		addSequential(new ArmUpAuto(1, -400));
		addSequential(new Turn_left(turn));
		addSequential(new Awantaaa(awantaaPlox));
		
//Hacia adelante distancia 2 CargoBay hasta abrir garra y awantaa
		addSequential(new ArmUpAuto(0.5f, -350));
		addSequential(new DriveForward_1(.9f, false));
		addSequential(new Awantaaa(awantaaPlox));
		addSequential(new ClawOpenClose(1));
		addSequential(new Awantaaa(awantaaPlox));
		
//Hacia atras - distancia 2 CargoBay hasta el giro y awantaa
		addSequential(new DriveForward_1(.53f, true));
		addSequential(new ClawOpenClose(-1));
		addSequential(new ArmUpAuto(1, 500));
		addSequential(new Awantaaa(awantaaPlox));
		addSequential(new ArmUpAuto(1, -400));
		addSequential(new Turn_left(.5f));
		addSequential(new Awantaaa(awantaaPlox));

//Hacia adelante con - distancia 2 CargoBay hasta llegar al Gear	
		addSequential(new ClawOpenClose(1));
		addSequential(new DriveForward_1(2.8f, false));
		addSequential(new Awantaaa(awantaaPlox));

//Cerrar garra ---- Recoger segunda pieza	
		addSequential(new ClawOpenClose(-1));
		addSequential(new Awantaaa(awantaaPlox));

//Hacia atras distancia 2 CargoBay hasta el giro y awantaa		
		addSequential(new DriveForward_1(2f, true));
		addSequential(new Awantaaa(awantaaPlox));
		addSequential(new Turn(.9f));
		addSequential(new Awantaaa(awantaaPlox));
		
//Hacia adelante - distancia 2 CargoBay hasta awantaa	
		addSequential(new ArmUpAuto(1, -1100));
		addSequential(new DriveForward_1(.4f, false));
		addSequential(new Awantaaa(awantaaPlox));

//Abrir garra hasta awantaa		
		addSequential(new ClawOpenClose(1));
		addSequential(new Awantaaa(awantaaPlox));

//Termina autonomo y se va pa atras		
		addSequential(new DriveForward_1(.53f, true));
		end();

		// Add Commands here:
		// e.g. addSequential(new Command1());
		// addSequential(new Command2());
		// these will run in order.

		// To run multiple commands at the same time,
		// use addParallel()
		// e.g. addParallel(new Command1());
		// addSequential(new Command2());
		// Command1 and Command2 will run in parallel.

		// A command group will require all of the subsystems that each member
		// would require.
		// e.g. if Command1 requires chassis, and Command2 requires arm,
		// a CommandGroup containing them would require both the chassis and the
		// arm.
	}
}
