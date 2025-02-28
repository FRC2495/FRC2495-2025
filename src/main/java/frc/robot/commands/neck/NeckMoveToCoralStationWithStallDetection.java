
package frc.robot.commands.neck;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.subsystems.Neck;

/**
 *
 */
public class NeckMoveToCoralStationWithStallDetection extends Command {

	private Neck neck;

	public NeckMoveToCoralStationWithStallDetection(Neck neck) {
		this.neck = neck;
		addRequirements(neck);
	}

	// Called just before this Command runs the first time
	@Override
	public void initialize() {
		System.out.println("NeckMoveToCoralStationWithStallDetection: initialize");
		neck.moveToCoralStation();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	public void execute() {
		// nothing
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	public boolean isFinished() {
		//return !neck.tripleCheckMove() || neck.tripleCheckIfStalled();
		return neck.tripleCheckIfStalled();
	}

	// Called once after isFinished returns true
	@Override
	public void end(boolean interupted) {
		System.out.println("NeckMoveToCoralStationWithStallDetection: end");
		neck.stay();  // we don't want to stop so we stay up...
	}
}
