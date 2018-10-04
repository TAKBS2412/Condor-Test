package org.usfirst.frc.team2412.robot.commands;

public class LaunchLowCommand extends CommandBase {

	public LaunchLowCommand() {
		requires(catapult);
	}
	
	public void execute() {
		catapult.launchLow();
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}

	public void end() {
		catapult.retractLow();
	}
}
