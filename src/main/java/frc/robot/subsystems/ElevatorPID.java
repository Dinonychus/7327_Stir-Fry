// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ElevatorConstants;

public class ElevatorPID extends SubsystemBase {


  private TalonFX leftElevatorFalcon = new TalonFX(ElevatorConstants.kLeftElevatorDriveID);
  private TalonFX rightElevatorFalcon = new TalonFX(ElevatorConstants.kRightElevatorDriveID);

  public ElevatorPID() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
