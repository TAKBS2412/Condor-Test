package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveBaseSubsystem extends Subsystem {
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveCommand());
	}
	
	public void drive(Joystick stick) {
		
	}
}
