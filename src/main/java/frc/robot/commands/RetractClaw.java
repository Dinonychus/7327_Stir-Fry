// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.The_Pinch_n_Twist;


public class RetractClaw extends CommandBase {

  private final The_Pinch_n_Twist m_the_Pinch_n_Twist;


  /** Creates a new RetractClaw. */
  public RetractClaw(The_Pinch_n_Twist the_Pinch_n_Twist) {
    m_the_Pinch_n_Twist = the_Pinch_n_Twist;
    addRequirements(the_Pinch_n_Twist);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_the_Pinch_n_Twist.pinchRetract();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
