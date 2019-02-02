package org.usfirst.frc.team5089.robot.subsystems;

import org.usfirst.frc.team5089.robot.RobotMap;
import org.usfirst.frc.team5089.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivebase extends Subsystem {
public VictorSP LeftMotor;
public VictorSP RightMotor;

public Drivebase() {
	
LeftMotor = new VictorSP(RobotMap.LEFT_MOTOR.value);
RightMotor = new VictorSP(RobotMap.RIGHT_MOTOR.value);
	
	

}

public void setRaw(double leftvalue, double rightvalue) {

	LeftMotor.set(leftvalue);
	RightMotor.set(rightvalue);
	
}
	@Override
	protected void initDefaultCommand() {
	setDefaultCommand(new TankDrive());

	}

}
