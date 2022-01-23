package frc.robot.groups;

import edu.wpi.first.wpilibj.VictorSP;
import frc.robot.Robot;


public class Shoot {
    public static VictorSP up;
    public static VictorSP down;

    public static void init(){
        up = new VictorSP(0);
        down = new VictorSP(1);
    }

    public static void teleop(){
        if(Robot.xbox.getAButton()){
            
        }
    }
}
