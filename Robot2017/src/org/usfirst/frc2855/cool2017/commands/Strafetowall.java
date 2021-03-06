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

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc2855.cool2017.Robot;
import org.usfirst.frc2855.cool2017.RobotMap;

/**
 *
 */
public class Strafetowall extends Command {
	SendableChooser chooser;
	final String blueAlliance = "Blue Alliance";
	final String redAlliance = "Red Alliance";
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public Strafetowall(boolean b) {
    
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.drive);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        chooser = new SendableChooser();
        chooser.addDefault("Blue Alliance", blueAlliance);
        chooser.addObject("Red Alliance", redAlliance);
        SmartDashboard.putData("Alliance", chooser);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.drive.drivezRobot(0, 0, 1);
    	Timer.delay(1.25);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (chooser.getSelected() == redAlliance) {
    		Robot.drive.drivezRobot(0, 1, 0);
    	} else {
    		Robot.drive.drivezRobot(0, -1, 0);
    	}
    	Robot.shooter.shooterActivate(((Robot.oi.getJoystick2().getThrottle()+1)/2));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.driveRobotDrive41.setSafetyEnabled(true);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
