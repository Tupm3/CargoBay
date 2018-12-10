package org.usfirst.frc.team3158.robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ClawOpenClose extends Command {
	int  solenoidOut;
	

    public ClawOpenClose(int state) {
    	requires(Robot.claw);
    	
    	solenoidOut = state;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.claw.moveSolenoid(solenoidOut);;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
