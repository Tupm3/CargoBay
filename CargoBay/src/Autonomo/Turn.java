package Autonomo;

import org.usfirst.frc.team3158.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Turn extends Command {
	float t;

    public Turn(float time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.subChassis);
    	t = time;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(t);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.subChassis.turn_right();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
