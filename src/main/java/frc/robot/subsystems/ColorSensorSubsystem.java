package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.DriverStation;

import com.revrobotics.ColorSensorV3;

public class ColorSensorSubsystem extends SubsystemBase {
  
  private final ColorSensorV3 colorSensor;
  private Color color;
  
  public ColorSensorSubsystem() {
    colorSensor = new ColorSensorV3(I2C.Port.kOnboard);
    color = colorSensor.getColor();

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

  private DriverStation.Alliance returnColor(){
    color = colorSensor.getColor();
    if(color.red  - color.blue > 20)
      return DriverStation.Alliance.Red;
    else if(color.blue - color.red > 20)
      return DriverStation.Alliance.Blue;
    else
      return DriverStation.Alliance.Invalid;
  }

  
  public boolean AllianceMatch() {
    return returnColor() == DriverStation.getAlliance();
  }

}