package org.usfirst.frc.team3158.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ClawSubsystem extends Subsystem {

	DoubleSolenoid solenoid;

    public ClawSubsystem() {
    	solenoid = new DoubleSolenoid(RobotMap.clawSolenoidport1, RobotMap.clawSolenoidport2);
    }
    public void moveSolenoid(int e) {
    	if (e == 1) {solenoid.set(DoubleSolenoid.Value.kForward);}
    	else if (e == -1) {solenoid.set(DoubleSolenoid.Value.kReverse);}
    	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
