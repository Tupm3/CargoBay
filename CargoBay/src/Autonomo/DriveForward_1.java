package Autonomo;

import org.usfirst.frc.team3158.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveForward_1 extends Command {
float t;
long ti;
boolean d;
    public DriveForward_1(float time, boolean paAtraspaDelante) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.subChassis);
    	t = time;
    	d = paAtraspaDelante;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(t);
    	ti = System.currentTimeMillis();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	long ac = System.currentTimeMillis() - ti;
    	double volt = ((t - (ac / 1000.0))/ t);
    	if(d == false) {
    	Robot.subChassis.driveForward1(-volt);
    	}else if (d == true) {
    		Robot.subChassis.driveForward1(volt);
    	}
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
