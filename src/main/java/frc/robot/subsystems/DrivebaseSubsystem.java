package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class DrivebaseSubsystem extends SubsystemBase{
    private final CANSparkMax leftMotor;
    private final CANSparkMax rightMotor;

    public DrivebaseSubsystem() {
        leftMotor = new CANSparkMax(0, MotorType.kBrushed);
        rightMotor = new CANSparkMax(1, MotorType.kBrushed);
    }

    public void turnMotor() {
        leftMotor.set(0.5);
        rightMotor.set(0.5);
    }

    
}
