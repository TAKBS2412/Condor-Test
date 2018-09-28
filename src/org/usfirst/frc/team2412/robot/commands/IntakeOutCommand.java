package org.usfirst.frc.team2412.robot.commands;

public class IntakeOutCommand extends CommandBase {
	
	public IntakeOutCommand() {
		requires(intakeInOut);
	}
	
	public void execute() {
		intakeInOut.intakeOut();
	}
	
	public void end() {
		intakeInOut.intakeStop();
	}
}
