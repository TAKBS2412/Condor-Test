package org.usfirst.frc.team2412.robot.commands;

public class DriveCommand extends CommandBase {
	
	public DriveCommand() {
		requires(driveBase);
	}
	
	public void execute() {
		driveBase.drive();
	}
}
