package org.usfirst.frc.team2412.robot.commands;

import org.usfirst.frc.team2412.robot.subsystems.CatapultSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.DriveBaseSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.IntakeInOutSubsystem;
import org.usfirst.frc.team2412.robot.subsystems.IntakeUpDownSubsystem;

import edu.wpi.first.wpilibj.command.Command;

public class CommandBase extends Command {
	public static DriveBaseSubsystem driveBase = new DriveBaseSubsystem();
	public static IntakeInOutSubsystem intakeInOut = new IntakeInOutSubsystem();
	public static IntakeUpDownSubsystem intakeUpDown = new IntakeUpDownSubsystem();
	public static CatapultSubsystem catapult = new CatapultSubsystem();
	
	@Override
	protected boolean isFinished() {
		return false;
	}

}
