package frc.robot.commands.groups;

import java.util.List;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;

//import edu.wpi.first.math.geometry.Pose2d;
//import edu.wpi.first.math.geometry.Rotation2d;
//import edu.wpi.first.math.trajectory.Trajectory;
//import edu.wpi.first.math.trajectory.TrajectoryGenerator;

import frc.robot.auton.AutonConstants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.*;
import frc.robot.commands.drivetrain.*;
import frc.robot.commands.algae_roller.*;
import frc.robot.commands.slider.*;
//import frc.robot.commands.neck.*;


public class PickupAlgae extends ParallelCommandGroup{
	
	public PickupAlgae(AlgaeRoller algae_roller, Slider slider/* , Neck neck*/) {

		addCommands(

			//new NeckMoveDownWithStallDetection(neck),

			new SliderExtendWithLimitSwitch(slider),
			
			new AlgaeRollerTimedRoll(algae_roller, .5)
		);
	}
}
