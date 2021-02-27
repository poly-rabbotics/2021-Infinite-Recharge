package frc.robot.subsystems;
import frc.robot.RobotMap;
import com.revrobotics.CANEncoder;

public class AutnomousDrive {
    public CANEncoder leftFront, rightFront, leftBack, rightBack;
    public double inchesToTravel, encoderCountsPerInch;

    public AutnomousDrive() {
        leftFront = RobotMap.leftFrontEncoder;
        rightFront = RobotMap.rightFrontEncoder;
        leftBack = RobotMap.leftBackEncoder;
        rightBack = RobotMap.rightBackEncoder;
        encoderCountsPerInch = 2; //insert real number here
        
    }

    public  void DriveByDistance(double inchesToTravel) {
        leftFront.setPosition(leftFront.getPosition()+(inchesToTravel * encoderCountsPerInch));
        rightFront.setPosition(-(rightFront.getPosition()+(inchesToTravel * encoderCountsPerInch)));
        leftBack.setPosition(leftBack.getPosition()+(inchesToTravel * encoderCountsPerInch));
        rightBack.setPosition(-(rightBack.getPosition()+(inchesToTravel * encoderCountsPerInch)));
    }

}
