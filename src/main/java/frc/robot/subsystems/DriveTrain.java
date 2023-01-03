package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import static frc.robot.Constants.*;

public class DriveTrain extends SubsystemBase {
    
    public static WPI_TalonFX frontLeftmotor = new WPI_TalonFX(FRONT_LEFT_MOTOR_ID);
    public static WPI_TalonFX rearRightmotor = new WPI_TalonFX(REAR_RIGHT_MOTOR_ID);
    public static WPI_TalonFX rearLeftmotor = new WPI_TalonFX(REAR_LEFT_MOTOR_ID);
    public static WPI_TalonFX frontRightmotor = new WPI_TalonFX(FRONT_RIGHT_MOTOR_ID);

    MotorControllerGroup right = new MotorControllerGroup(frontRightmotor, rearRightmotor);
    MotorControllerGroup left = new MotorControllerGroup(frontLeftmotor, rearLeftmotor);

    public DifferentialDrive drive = new DifferentialDrive(right, left);

    public void diffdrive(double speed, double rotation) {
        drive.arcadeDrive(speed, rotation,true);
    }
    public void stop() {
        drive.tankDrive(0,0);
    }
}
