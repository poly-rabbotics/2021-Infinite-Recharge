package frc.robot;

import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.EncoderType;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class RobotMap {

    public static final CANSparkMax leftFront = new CANSparkMax(1, MotorType.kBrushless);
    public static final CANSparkMax leftBack = new CANSparkMax(2, MotorType.kBrushless);
    public static final CANSparkMax rightFront = new CANSparkMax(3, MotorType.kBrushless);
    public static final CANSparkMax rightBack = new CANSparkMax(4, MotorType.kBrushless);


    public static final CANEncoder leftFrontEncoder = new CANEncoder(leftFront, EncoderType.kQuadrature, 42);
    public static final CANEncoder rightFrontEncoder = new CANEncoder(rightFront, EncoderType.kQuadrature, 42);
    public static final CANEncoder leftBackEncoder = new CANEncoder(leftBack, EncoderType.kQuadrature, 42);
    public static final CANEncoder rightBackEncoder = new CANEncoder(rightBack, EncoderType.kQuadrature, 42);



}