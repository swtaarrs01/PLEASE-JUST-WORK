// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.FlywheelCommand;
import frc.robot.subsystems.FlywheelSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.DriveTrain;


public class RobotContainer {
  private final FlywheelSubsystem m_flywheelSubsystem = new FlywheelSubsystem();
  private final FlywheelCommand m_flywheelCommand = new FlywheelCommand(m_flywheelSubsystem);
  private final DriveTrain DriveTrain = new DriveTrain();
  public RobotContainer() {
    configureButtonBindings();
  }

  public XboxController xboxController = new XboxController(0);
  public JoystickButton flywheelButton = new JoystickButton(xboxController, 1);

  private void configureButtonBindings() {
    flywheelButton.whileHeld(m_flywheelCommand);
  }
  
  public void setTeleop() {
    configureButtonBindings();
  }

  public void teleopPeriodic() {
    double speed = xboxController.getRawAxis(1);
    double rotation = xboxController.getRawAxis(4);

    if (Math.abs(speed) < 0.2) {
      speed = 0;
  
    }
    if (Math.abs(rotation) < 0.2) {
      rotation = 0;
    }
    speed *= Constants.SPEED_MULTIPLIER_CONSTANT;
    rotation *= Constants.ROTATION_MULTIPLIER_CONSTANT;

    DriveTrain.diffdrive(speed,rotation);
  }
  
  public Command getAutonomousCommand() {

    return m_flywheelCommand;
  }
}