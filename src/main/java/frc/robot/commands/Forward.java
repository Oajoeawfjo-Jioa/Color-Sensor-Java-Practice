package frc.robot.commands;

import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.Robot;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class Forward extends CommandBase {

    private double speed;

    public Forward(double speed){
        this.speed = speed;
        addRequirements(Robot.intake);
    }

    @Override
    public void execute(){
        Robot.intake.turnMotor(speed);
    }

}
