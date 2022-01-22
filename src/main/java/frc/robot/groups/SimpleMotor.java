package frc.robot.groups;

public class SimpleMotor {
    //When using different functions, please comment out other codes to avoid errors.
    public static void init(){
        VictorSP vic = new VictorSP(1);
    } /*孔位、馬達轉向需再次確認*/

    public static void teleop(){
        //L型撈球
        double i = 0.5;//若要改速度改i數值即可，轉向則在if-else結構裡的i加負號
        if(Robot.xbox.getAButton()){
            vic.set(i);//往內
          }else if(xbox.getBButton()){
            vic.set(-i);//往外
          }else{
            vic.set(0);//no press then no move
          }

        //膠輪吸球
        double i = 0.5;//若要改速度改i數值即可，轉向則在if-else結構裡的i加負號
        if(xbox.getAButton()){
            vic.set(i);//吸球
        }else if(xbox.getBButton()){
            vic.set(-i);//以防萬一需反轉吐球
        }else{
            vic.set(0);//no press then no move
        }
    }
}
