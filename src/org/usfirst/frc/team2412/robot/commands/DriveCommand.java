package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.Robot;

public class DriveCommand extends CommandBase {
	
	public DriveCommand() {
		requires(driveBase);
	}
	
	public void execute() {
		driveBase.drive(Robot.m_oi.stick);
	}
}
