package org.usfirst.frc2855.cool2017.commands;

import org.usfirst.frc2855.cool2017.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LEDs extends Command {

    public LEDs(boolean ledmode) {
        // Use requires() here to declare subsystem dependencies
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute(boolean ledmode) {
    	if (ledmode) {
    		RobotMap.randomLED.set(true);
    	} else {
    		RobotMap.breathLED.set(true);
    	}
    		
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	RobotMap.randomLED.set(false);
    	RobotMap.breathLED.set(false);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}
}
