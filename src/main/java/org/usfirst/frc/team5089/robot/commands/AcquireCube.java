/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5089.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5089.robot.Robot;
import org.usfirst.frc.team5089.robot.RobotMap;

public class AcquireCube extends Command {
  boolean toggle;
  public AcquireCube() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    toggle = false;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
   
    toggle = false;

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

if(toggle){
      Robot.pneumatics.Grab();
      toggle = false;
    }
    else{
      toggle = true;
      Robot.pneumatics.Release();
    }

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
