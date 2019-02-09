/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5089.robot.subsystems;

import org.usfirst.frc.team5089.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;

/**
 * Add your docs here.
 */
public class Pneumatics extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  DoubleSolenoid test;
  Compressor compressor;
  public static boolean isGrabbing;

public Pneumatics(){
compressor = new Compressor(RobotMap.CompressorPort);

test = new DoubleSolenoid(RobotMap.forwardEject, RobotMap.reverseEject);

}
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public void compress(){
    compressor.setClosedLoopControl(true);
    /*if(!compressor.getPressureSwitchValue())
      compressor.start();
    else
      compressor.stop();*/
  }
  public void Grab(){
    test.set(DoubleSolenoid.Value.kForward);
    isGrabbing = true;
  }
  public void Release(){
    
    test.set(DoubleSolenoid.Value.kReverse);
    isGrabbing = false;
  }
}
