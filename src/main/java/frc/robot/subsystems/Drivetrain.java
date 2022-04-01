package frc.robot.subsystems;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {

    // [Zheng] Where did the these three lines below come from?
    public Talon FL,FR,RL,RR; 
    public MotorControllerGroup leftSide,rightSide;
    public static DifferentialDrive drive;


    public Drivetrain(){
        FL = new Talon(Constants.DRIVETRAIN_FRONT_LEFT_TALON);
        FR =new Talon(Constants.DRIVETRAIN_FRONT_RIGHT_TALON);
        RL =new Talon(Constants.DRIVETRAIN_REAR_LEFT_TALON);
        RR = new Talon(Constants.DRIVETRAIN_REAR_RIGHT_TALON);

        leftSide = new MotorControllerGroup(FL, RL);
        rightSide = new MotorControllerGroup(FR, RR); 

        drive = new DifferentialDrive(leftSide,rightSide); 
    }

    /* [Zheng]
    I'm not sure if we made a mistake with this arcadeDrive, but I figured I'd put it here:
    
    public void arcadeDrive(double moveSpeed, double rotateSpeed) {
      differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);
    }

    Instead of the arcadeDrive typed below, the section "Creating the arcadeDrive method" shows the arcadeDrive lines written above but not the arcadeDrive lines written below.
    */

    public static void arcadeDrive(double speedLeft, double speedRight,double mod){
        drive.tankDrive(speedLeft*mod, speedRight*mod);
    }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
