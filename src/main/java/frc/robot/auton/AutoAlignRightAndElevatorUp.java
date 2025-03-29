package frc.robot.auton;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.RobotContainer;
import frc.robot.commands.elevator.ElevatorMoveToSecondLevelWithStallDetection;
import frc.robot.commands.groups.AutoAlignToReefForAuton;
import frc.robot.interfaces.ICamera;
import frc.robot.subsystems.*;

public class AutoAlignRightAndElevatorUp extends SequentialCommandGroup {

	public AutoAlignRightAndElevatorUp(SwerveDrivetrain drivetrain, Elevator elevator, ICamera apriltag_camera, Joystick joystick){

		addCommands(

			new AutoAlignToReefForAuton(true, drivetrain, apriltag_camera, joystick),

			new ElevatorMoveToSecondLevelWithStallDetection(elevator)
		); 
  
	}

	

}