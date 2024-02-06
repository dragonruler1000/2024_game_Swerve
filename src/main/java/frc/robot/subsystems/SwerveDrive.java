// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SwerveDrive extends SubsystemBase {
  /** Creates a new SwerveDrive. */
  public SwerveDrive() {
    PWMSparkMax frontLeft;
    PWMSparkMax frontRight;
    PWMSparkMax rearLeft;
    PWMSparkMax rearRight;


    frontLeft = new PWMSparkMax(0);
    frontRight = new PWMSparkMax(1);
    rearLeft = new PWMSparkMax(2);
    rearRight = new PWMSparkMax(3);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
