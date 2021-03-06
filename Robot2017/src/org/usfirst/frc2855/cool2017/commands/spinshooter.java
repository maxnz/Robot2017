// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2855.cool2017.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc2855.cool2017.Robot;
import org.usfirst.frc2855.cool2017.RobotMap;

import com.ctre.CANTalon.FeedbackDevice;
import com.ctre.CANTalon.TalonControlMode;

/**
 * spins wheel on shooter mechanism
 * set to run while held
 * completed
 */
public class spinshooter extends Command {
	private double shooterSpeed=75;
	
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public spinshooter() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.shooter);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        SmartDashboard.putNumber("Shooter Speed", shooterSpeed);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	RobotMap.shootershootertalon.setFeedbackDevice(FeedbackDevice.CtreMagEncoder_Relative);
    	//Uncomment when ready to use PID mode
      
    	//RobotMap.shootershootertalon.configNominalOutputVoltage(+0.0f, -0.0f);
    	//RobotMap.shootershootertalon.configPeakOutputVoltage(+12.0f, -12.0f);
    	
    	//RobotMap.shootershootertalon.changeControlMode(TalonControlMode.Speed);
    	//RobotMap.shootershootertalon.setF(0);
    	//RobotMap.shootershootertalon.setP(0);
    	//RobotMap.shootershootertalon.setI(0);
    	//RobotMap.shootershootertalon.setD(0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.shooter.shooterActivate((Robot.oi.getJoystick2().getThrottle()+1)*50);
    	RobotMap.shooterLED.set(true);
    	SmartDashboard.putNumber("Speed of Shooter RPM", RobotMap.shootershootertalon.getSpeed());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.shooter.shooterActivate(0);
    	//RobotMap.shootershootertalon.changeControlMode(TalonControlMode.PercentVbus);
    	RobotMap.shooterLED.set(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
