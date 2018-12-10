package org.usfirst.frc.team3158.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ArmSubsystem extends Subsystem {

    DoubleSolenoid solenoidArm;
    TalonSRX mArm;
    
    public ArmSubsystem(){
    	
    	solenoidArm = new DoubleSolenoid(RobotMap.armSolenoidport1,RobotMap.armSolenoidport2);
    	mArm = new TalonSRX(RobotMap.armmotorSRX_CAN);
    	
    }
    public void moveMotorArm(int move, int speed){
    	if(move==1){mArm.set(ControlMode.PercentOutput, -speed);}
    	else if(move==-1){mArm.set(ControlMode.PercentOutput, speed);}
    	
    }
    public void setPiston(int set){
    	if(set==1){solenoidArm.set(Value.kForward);}
    	else if(set==-1){solenoidArm.set(Value.kReverse);}
    	
    }
    public void move(double speed) {
    	mArm.set(ControlMode.PercentOutput, speed);
    }
    public void resetEnc() {
    	mArm.setSelectedSensorPosition(0);
    }
    public double getEnc() {
    	return mArm.getSelectedSensorPosition();
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new MoveMotorArmCommand());
    }
}

