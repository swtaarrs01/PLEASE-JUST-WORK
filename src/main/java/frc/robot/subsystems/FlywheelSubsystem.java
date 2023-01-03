// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.*;

public class FlywheelSubsystem extends SubsystemBase {
  public FlywheelSubsystem() {}

  @Override
  public void periodic() {}

  @Override
  public void simulationPeriodic() {}

  public void set(double speed) {
    flywheelMotor.set(speed);
  }

  public void stop() {
    flywheelMotor.set(0);
  }

}