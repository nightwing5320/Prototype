package frc.robot.groups;

import com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase;

import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.Robot;

public class SimpleMotor {
    //When using different functions, please comment out other codes to avoid errors.
    private static VictorSP vic;
    public static void init(){
        vic = new VictorSP(1);
    }

    public static void teleop(){

        double i = 0.5;
        if(Robot.xbox.getAButton()){
            vic.set(i);
          }else if(Robot.xbox.getBButton()){
            vic.set(-i);
          }else{
            vic.set(0);//no press then no move
          }


        //double i = 0.5;
        if(Robot.xbox.getAButton()){
            vic.set(i);
        }else if(Robot.xbox.getBButton()){
            vic.set(-i);
        }else{
            vic.set(0);//no press then no move
        }
    }
}
