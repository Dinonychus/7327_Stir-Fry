// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.SpearConstants;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.ExtendClaw;
// import frc.robot.commands.SpearManualControl;
import frc.robot.commands.JoystickControl;
import frc.robot.commands.RetractClaw;
import frc.robot.commands.SetSpearPos;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.SpearPID;
import frc.robot.subsystems.The_Pinch_n_Twist;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final DriveTrain driveTrain = new DriveTrain();
  private final The_Pinch_n_Twist the_Pinch_n_Twist = new The_Pinch_n_Twist();
  private final SpearPID spearPID = new SpearPID();


  private final XboxController driveController = new XboxController(Constants.driveController_ID);
  private final XboxController mechanismController = new XboxController(Constants.mechanismController_ID);
  private final CommandXboxController drive1Controller = new CommandXboxController(Constants.driveController_ID);
  private final CommandXboxController mechanism1Controller = new CommandXboxController(Constants.mechanismController_ID);

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {


   /*  driveTrain.setDefaultCommand(new JoystickControl(driveTrain, 
    () -> driveController.getRawAxis(Constants.LeftY),  
    () -> driveController.getRawAxis(Constants.rightX)));*/

    driveTrain.setDefaultCommand(new JoystickControl(driveTrain,
     () -> drive1Controller.getRawAxis(Constants.kRight_X),
     () -> drive1Controller.getRawAxis(Constants.kLeft_Y)));
    
    
     //spearPID.setDefaultCommand(new SetSpearPos(0, spearPID));


    configureButtonBindings();
  }


  private void configureButtonBindings() {
    
   // final JoystickButton kLeftBumper = new JoystickButton(mechanism1Controller, Constants.kLeft_Bumper);
    // final JoystickButton kRightBumper = new JoystickButton(mechanism1Controller, Constants.kRight_Bumper);



    mechanism1Controller.a().onTrue(new RetractClaw(the_Pinch_n_Twist));
    mechanism1Controller.b().onTrue(new ExtendClaw(the_Pinch_n_Twist));

    drive1Controller.leftBumper().onTrue(new JoystickControl(driveTrain, 
    () -> .05, () -> 0));

    mechanism1Controller.leftBumper().onTrue(new SetSpearPos(
      SpearConstants.kSpearRetract, spearPID));

    mechanism1Controller.rightBumper().onTrue(new SetSpearPos(
      SpearConstants.kSpearExtend, spearPID));

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}