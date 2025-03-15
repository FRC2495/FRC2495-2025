package frc.robot.commands.groups;


import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.commands.coral_roller.CoralRollerTimedRelease;
import frc.robot.commands.elevator.ElevatorMoveToThirdLevelWithStallDetection;
import frc.robot.commands.neck.NeckMoveToCoralReefWithStallDetection;
import frc.robot.subsystems.*;

public class ScoreThirdLevelCoral extends SequentialCommandGroup {

	public ScoreThirdLevelCoral(Elevator elevator, CoralRoller coral_roller, Neck neck) {

		addCommands(

			new ElevatorMoveToThirdLevelWithStallDetection(elevator),

			new NeckMoveToCoralReefWithStallDetection(neck),

			new CoralRollerTimedRelease(coral_roller, .2)
						
		); 
  
	}
   
}