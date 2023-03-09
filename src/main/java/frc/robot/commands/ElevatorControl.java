// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.Constants.ElevatorConstants;
import frc.robot.subsystems.ElevatorPID;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ElevatorControl extends PIDCommand {

private final ElevatorPID m_elevatorPID;
private final double m_elevatorSetPoint;


  public ElevatorControl(ElevatorPID elevatorPID, double elevatorSetPoint) {

    super(
        // The controller that the command will use
        new PIDController(ElevatorConstants.kEP, ElevatorConstants.kEI, ElevatorConstants.kED),
        // This should return the measurement
        () -> elevatorPID.getMeasurement(),
        // This should return the setpoint (can also be a constant)
        () -> elevatorPID.getSetpoint(),
        // This uses the output
        output -> {elevatorPID.useOutput(output, elevatorSetPoint);
          // Use the output here
        });

        m_elevatorPID = elevatorPID;
        m_elevatorSetPoint = elevatorSetPoint;

        addRequirements(m_elevatorPID);
    // Use addRequirements() here to declare subsystem dependencies.
    // Configure additional PID options by calling `getController` here.
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
