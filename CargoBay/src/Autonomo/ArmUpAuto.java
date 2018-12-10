package Autonomo;

import org.usfirst.frc.team3158.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ArmUpAuto extends Command {
	float t;
	int pulses;

	public ArmUpAuto(float time, int pulsos) {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(Robot.arm);
		t = time;
		pulses = pulsos;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		setTimeout(t);
		Robot.arm.resetEnc();
		Robot.arm.setPiston(1);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		if (!(Robot.arm.getEnc() <= pulses)) {
			Robot.arm.move(0.59);
		} else {
			Robot.arm.move(0);
			Robot.arm.setPiston(-1);
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return isTimedOut();
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.arm.setPiston(-1);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
	}
}
