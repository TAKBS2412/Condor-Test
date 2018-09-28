package org.usfirst.frc.team2412.robot.commands;

public class IntakeInCommand extends CommandBase {
	
	public IntakeInCommand() {
		requires(intakeInOut);
	}
	
	public void execute() {
		intakeInOut.intakeIn();
	}
	
	public void end() {
		intakeInOut.intakeStop();
	}
}
