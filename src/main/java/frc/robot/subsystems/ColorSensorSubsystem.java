package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj.I2C;

import com.revrobotics.ColorSensorV3;


public class ColorSensorSubsystem extends SubsystemBase {
  
  private final ColorSensorV3 colorSensor; 
  
  public ColorSensorSubsystem() {
    colorSensor = new ColorSensorV3(I2C.Port.kOnboard);

  }

  public Color getColor() {
    return colorSensor.getColor();
  }

  public int getDistance() {
    return colorSensor.getProximity();
  }     

  public double getIR() {
    return colorSensor.getProximity();
  }

}