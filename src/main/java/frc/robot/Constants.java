// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final int driveController_ID = 0;
    public static final int mechanismController_ID = 1;


    public static final int kDPadUp = 0;
    public static final int kDPadDown = 180;
    public static final int kDPadRight = 90;
    public static final int kDPadLeft = 270;

    public static final int kLeft_Y = 1;
    public static final int kLeft_X = 0;
    public static final int kRight_X = 4;
    public static final int kRight_Y = 5;
    public static final int kLeft_Trigger = 2;
    public static final int kRight_Trigger = 3;

    public static final int kA_Button = 1;
    public static final int kLeft_Bumper = 5;
    public static final int kRight_Bumper = 6;
    public static final int kTwoWindowsButton = 7;
    public static final int kDriverFieldOrientedButtonIdx = 8;
    public static final int kYbutton = 4;
    public static final int kB_Button = 2;
    public static final int kX_Button = 3;
    public static final double kDeadband = 0.05;



    public  final static class DriveConstants {
    public static final int kFLDriveID = 1;
    public static final int kFRDriveID = 2;
    public static final int kBLDriveID = 3;
    public static final int kBRDriveID = 4;


    public static final int kFLFalconDriveID = 12;
    public static final int kFRFalconDriveID = 13;
    public static final int kBLFalconDriveID = 14;
    public static final int kBRFalconDriveID = 15;
    public static final int extraMotor1 = 16;
    //public static final int extraMotor2 = 11;

    }

    public final static class PinchNTwistConstants {
        public static final int kSolenoidFoward = 0;
        public static final int kSolenoidReverse = 1;
    }

    public final static class SpearConstants {
        public static final int kSpearDriveID = 15;
        public static final double kSpearExtend = .2;
        public static final double kSpearRetract = .2;
        
        public static final double kPSpear = 1;
        public static final double kISpear = .07;
        public static final double kDSpear = 0.0;


    }



}