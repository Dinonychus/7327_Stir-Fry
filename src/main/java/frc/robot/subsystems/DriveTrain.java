// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.SpearConstants;

public class DriveTrain extends SubsystemBase {
  private CANSparkMax frontLeftMotor = new CANSparkMax(DriveConstants.kFLDriveID, MotorType.kBrushless);
  private CANSparkMax frontRightMotor = new CANSparkMax(DriveConstants.kFRDriveID, MotorType.kBrushless);
  private CANSparkMax backLeftMotor = new CANSparkMax(DriveConstants.kBLDriveID, MotorType.kBrushless);
  private CANSparkMax backRightMotor = new CANSparkMax(DriveConstants.kBRDriveID, MotorType.kBrushless);

 /* private TalonFX frontLeftFalconMotor = new TalonFX(DriveConstants.kFLFalconDriveID);
  private TalonFX backLeftFalconMotor = new TalonFX(DriveConstants.kBLFalconDriveID);
  private TalonFX frontRightFalconMotor = new TalonFX(DriveConstants.kFRFalconDriveID);
  private TalonFX backRightFalconMotor = new TalonFX(DriveConstants.kBRFalconDriveID);
  private TalonFX extraMotor1ID = new TalonFX(DriveConstants.extraMotor1);
 // private TalonFX extraMotor2ID = new TalonFX(DriveConstants.extraMotor2); */ 

 // private CANSparkMax spearTestMotor = new CANSparkMax(SpearConstants.kSpearDriveID, MotorType.kBrushless);


  private MotorControllerGroup m_leftSide = new MotorControllerGroup(frontLeftMotor, backLeftMotor);
  private MotorControllerGroup m_rightSide = new MotorControllerGroup(frontRightMotor, backRightMotor);

  private DifferentialDrive arcDrive = new DifferentialDrive(m_leftSide, m_rightSide);






  public DriveTrain() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

 /*  public void setMotorSpeed (double leftSpeed, double rightSpeed){
    arcDrive.arcadeDrive(leftSpeed, rightSpeed);
    m_leftSide.set(leftSpeed);
    m_rightSide.set(rightSpeed);
    
  } */
  

  public void setArcadeSpeed (double moveSpeed, double rotateSpeed){
    arcDrive.arcadeDrive(moveSpeed, rotateSpeed);
  }
  

 /*  public void setSpearMotorSpeed (double spearSpeed){
    spearTestMotor.set(spearSpeed);
  } */

 /* public void setFalconMotorSpeed (double leftFalconSpeed, double rightFalconSpeed){
    frontLeftFalconMotor.set(TalonFXControlMode.PercentOutput, leftFalconSpeed);
    backLeftFalconMotor.set(TalonFXControlMode.PercentOutput, rightFalconSpeed);
    frontRightFalconMotor.set(TalonFXControlMode.PercentOutput, leftFalconSpeed);
    backRightFalconMotor.set(TalonFXControlMode.PercentOutput, rightFalconSpeed);
    extraMotor1ID.set(TalonFXControlMode.PercentOutput, leftFalconSpeed);
   // extraMotor2ID.set(TalonFXControlMode.PercentOutput, rightFalconSpeed);
  } */ 


}