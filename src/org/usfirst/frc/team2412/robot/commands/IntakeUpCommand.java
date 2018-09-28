package org.usfirst.frc.team2412.robot.commands;

public class IntakeUpCommand extends CommandBase {
	
	public IntakeUpCommand() {
		requires(intakeUpDown);
	}
	
	public void execute() {
		intakeUpDown.intakeUp();
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
}
