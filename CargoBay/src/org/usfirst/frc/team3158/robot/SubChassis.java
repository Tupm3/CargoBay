package org.usfirst.frc.team3158.robot;

import edu.wpi.first.wpilibj.PWMTalonSRX;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class SubChassis extends Subsystem {
		
	Spark m4right;
	PWMTalonSRX m3right;
	
	Spark m2left;
	PWMTalonSRX m1left;
	
	public SubChassis() {
		super();

		
		m4right = new Spark(RobotMap.rightmotorSpark4port);
		m3right = new PWMTalonSRX(RobotMap.rightmotorPWM3port);
		
		m2left = new Spark(RobotMap.leftmotorSpark2port);
		m1left = new PWMTalonSRX(RobotMap.leftmotorPWM1port);
		
		//m2left = new Spark(RobotMap.leftmotorSpark2port);
		//m1left = new PWMTalonSRX(RobotMap.leftmotorPWM1port);
        
	}
	
	public void drive(double turn, double speed) {
		double l = speed + turn;
		double r = speed - turn;
		
		m4right.set(r);
		
		m3right.set(r);
		
		m2left.set(l*-1);
		
		m1left.set(l*-1);
		
		}
	
	public void driveForward1(double volt) {
		m4right.set(volt);
		
		m3right.set(volt);
	
		m2left.set(-volt-0.15);
		
		m1left.set(-volt-0.15);
	}
	
	public void turn_right() {
		m4right.set(1);
		
		m3right.set(1);
	
		m2left.set(1);
		
		m1left.set(1);
	}
	public void turn_left() {
		m4right.set(-1);
		
		m3right.set(-1);
	
		m2left.set(-1);
		
		m1left.set(-1);
	}
	
	public void enzeropapu() {
		m4right.set(0);
		
		m3right.set(0);
	
		m2left.set(0);
		
		m1left.set(0);
	}



    public void initDefaultCommand() {
    	//this.setDefaultCommand(new Chassis());
    	setDefaultCommand(new Chassis());
    }
}

