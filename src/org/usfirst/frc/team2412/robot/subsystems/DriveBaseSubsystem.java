package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;
import org.usfirst.frc.team2412.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveBaseSubsystem extends Subsystem {
	
	private DifferentialDrive drive = RobotMap.drive;
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveCommand());
	}
	
	public void drive(Joystick stick) {
		drive.arcadeDrive(stick.getY(), stick.getTwist());
	}
}
