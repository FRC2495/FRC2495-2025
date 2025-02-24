/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.algae_roller;

import edu.wpi.first.wpilibj2.command.WaitCommand;

import frc.robot.subsystems.AlgaeRoller;

/**
 * Add your docs here.
 */
public class AlgaeRollerTimedRoll extends WaitCommand {

	private AlgaeRoller algae_roller;

	/**
	 * Add your docs here.
	 */
	public AlgaeRollerTimedRoll(AlgaeRoller algae_roller, double timeout) {
		super(timeout);
		this.algae_roller = algae_roller;
		addRequirements(algae_roller);
		
		
		// ControllerBase is not a real subsystem, so no need to reserve it
	}

	// This instant command can run disabled
	@Override
	public boolean runsWhenDisabled() {
		return true;
	}

	// Called just before this Command runs the first time
	@Override
	public void initialize() {
		System.out.println("AlgaeRollerTimedRoll: initialize");
		super.initialize();
		algae_roller.roll();

	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	public void execute() {
		// nothing
	}

	// Called once after timeout
	@Override
	public void end(boolean interrupted) {
		System.out.println("AlgaeRollerTimedRoll: end");
		algae_roller.stop();
		super.end(interrupted);
	}
}
