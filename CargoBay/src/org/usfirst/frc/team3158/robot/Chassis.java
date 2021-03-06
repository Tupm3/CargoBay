package org.usfirst.frc.team3158.robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Chassis extends Command {
    public Chassis() {
    	requires(Robot.subChassis);
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	Robot.subChassis.drive(-Robot.oi.getPilot().getX(), Robot.oi.getPilot().getY());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
