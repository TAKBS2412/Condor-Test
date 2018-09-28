package org.usfirst.frc.team2412.robot.commands;

public class LaunchHighCommand extends CommandBase {

	public LaunchHighCommand() {
		requires(catapult);
	}
	
	public void execute() {
		catapult.launchHigh();
	}
	
	@Override
	protected boolean isFinished() {
		return true;
	}
}
