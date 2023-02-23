// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;
import frc.robot.Constants.ElevatorConstants;

public class Elevator2 extends PIDSubsystem {
  private TalonFX leftElevatorFalcon = new TalonFX(ElevatorConstants.kLeftElevatorDriveID);
  private TalonFX rightElevatorFalcon = new TalonFX(ElevatorConstants.kRightElevatorDriveID);

  /** Creates a new Elevator2. */
  public Elevator2() {
    super(
        // The PIDController used by the subsystem
        new PIDController(0, 0, 0));
  }

  @Override
  public void useOutput(double output, double setpoint) {
    leftElevatorFalcon.set(TalonFXControlMode.Position, setpoint);
    rightElevatorFalcon.set(TalonFXControlMode.Follower, setpoint);
    // Use the output here
  }

  @Override
  public double getMeasurement() {
    // Return the process variable measurement here
    return leftElevatorFalcon.getActiveTrajectoryPosition();
  }

public void elevatorLog() {
  SmartDashboard.putString("Elevator", leftElevatorFalcon.toString());
}

  @Override
  public void periodic() {
    elevatorLog();
  }
}
