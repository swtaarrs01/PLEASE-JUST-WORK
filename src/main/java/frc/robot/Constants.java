// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;

public final class Constants {

    public static final int FLYWHEEL_ID = 5;
    public static WPI_TalonFX flywheelMotorTalon = new WPI_TalonFX(FLYWHEEL_ID);
    public static MotorController flywheelMotor = flywheelMotorTalon;

    public static final int FRONT_LEFT_MOTOR_ID = 4;
    public static final int REAR_LEFT_MOTOR_ID = 3;
    public static final int FRONT_RIGHT_MOTOR_ID = 1;
    public static final int REAR_RIGHT_MOTOR_ID = 2;

    public static final double SPEED_MULTIPLIER_CONSTANT = -0.2;
    public static final double ROTATION_MULTIPLIER_CONSTANT = 0.6;

}
