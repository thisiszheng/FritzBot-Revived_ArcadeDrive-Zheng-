package frc.robot.commands;

import frc.robot.RobotContainer;
import frc.robot.Constants;

public class DriveArcade {
    // addRequirements(RobotContainer.m_drivetrain);
    
    double moveSpeed = -RobotContainer.driverController.getRawAxis(Constants.DRIVER_CONTROLLER_MOVE_AXIS);
    double rotateSpeed = RobotContainer.driverController.getRawAxis(Constants.DRIVER_CONTROLLER_ROTATE_AXIS);

    RobotContainer.m_drivetrain.arcadeDrive(moveSpeed, rotateSpeed);

    Robot.m_drivetrain.arcadeDrive(0, 0);
}
