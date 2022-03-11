package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.subsystems.ColorSensorSubsystem;

public class DrivebaseSubsystem extends SubsystemBase{
    private final CANSparkMax leftMotor;
    private final CANSparkMax rightMotor;
    private final MotorControllerGroup controlgroup;
    private final ColorSensorSubsystem colorTrump;

    public DrivebaseSubsystem() {
        leftMotor = new CANSparkMax(0, MotorType.kBrushed);
        rightMotor = new CANSparkMax(1, MotorType.kBrushed);
        controlgroup = new MotorControllerGroup(leftMotor,rightMotor);
        colorTrump = new ColorSensorSubsystem();

    }

    public void turnMotor(double speed) {
        
        controlgroup.set(speed);

    }
    
}
