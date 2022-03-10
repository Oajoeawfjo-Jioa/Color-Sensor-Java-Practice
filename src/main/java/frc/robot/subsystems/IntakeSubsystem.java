package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.subsystems.ColorSensorSubsystem;
import frc.robot.Constants.Intake;

public class IntakeSubsystem extends SubsystemBase{
    private final CANSparkMax intakeMotor;    

    public IntakeSubsystem() {
        intakeMotor = new CANSparkMax(Intake.INTAKE_ID, MotorType.kBrushed);
        intakeMotor.setIdleMode(IdleMode.kBrake);
        intakeMotor.setInverted(Intake.INTAKE_INVERTED);
    }

    public void turnMotor(double speed) {
        
        intakeMotor.set(speed);

    }

    
}