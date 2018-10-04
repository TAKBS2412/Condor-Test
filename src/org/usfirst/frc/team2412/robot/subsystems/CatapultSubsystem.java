package org.usfirst.frc.team2412.robot.subsystems;

import org.usfirst.frc.team2412.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class CatapultSubsystem extends Subsystem {
	private DoubleSolenoid catapult = RobotMap.catapult;
	private DoubleSolenoid latch = RobotMap.latch;
	
	@Override
	protected void initDefaultCommand() {
	}
	
	public void launchHigh() {
		catapult.set(DoubleSolenoid.Value.kForward);
		Timer.delay(0.2);
		latch.set(DoubleSolenoid.Value.kForward);
		Timer.delay(0.5);
	}

	public void launchLow() {
		catapult.set(DoubleSolenoid.Value.kForward);
		Timer.delay(2.5);
	}
	
	public void retractHigh() {
		catapult.set(DoubleSolenoid.Value.kReverse);
		Timer.delay(2.0);
		latch.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void retractLow() {
		catapult.set(DoubleSolenoid.Value.kReverse);
		Timer.delay(2.0);
	}
}
