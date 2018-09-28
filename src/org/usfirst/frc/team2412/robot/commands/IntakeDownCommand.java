package org.usfirst.frc.team2412.robot.commands;

public class IntakeDownCommand extends CommandBase {

	public IntakeDownCommand() {
		requires(intakeUpDown);
	}
	
	public void execute() {
		intakeUpDown.intakeDown();
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
}
