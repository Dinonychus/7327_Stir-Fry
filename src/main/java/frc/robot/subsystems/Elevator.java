// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.wpilibj2.command.TrapezoidProfileSubsystem;
import frc.robot.Constants.ElevatorConstants;

public class Elevator extends TrapezoidProfileSubsystem {

  private TalonFX leftElevatorFalcon = new TalonFX(ElevatorConstants.kLeftElevatorDriveID);
  private TalonFX rightElevatorFalcon = new TalonFX(ElevatorConstants.kRightElevatorDriveID);


  public Elevator() {
    super(
        // The constraints for the generated profiles
        new TrapezoidProfile.Constraints(1, .5),
        // The initial position of the mechanism
        0);
  }

  @Override
  protected void useState(TrapezoidProfile.State state) {
    // Use the computed profile state here.
  }
}
