package org.usfirst.frc2855.cool2017.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc2855.cool2017.RobotMap;
import edu.wpi.first.wpilibj.SpeedController;

/**
 *
 */
public class ClimbingArmDown extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	private final SpeedController climbingmotor = RobotMap.climbingarmclimbingmotor;
	
	public void climberActivate() {
		climbingmotor.set(-1.0);
	}
	
	public void climberDeactivate() {
    	climbingmotor.set(0);
    }
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

