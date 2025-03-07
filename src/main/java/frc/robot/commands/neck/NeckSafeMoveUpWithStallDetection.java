
package frc.robot.commands.neck;

import edu.wpi.first.wpilibj2.command.ConditionalCommand;

import frc.robot.util.*;
import frc.robot.commands.DoNothing;
import frc.robot.subsystems.Neck;
import frc.robot.subsystems.Slider;

/**
 *
 */
public class NeckSafeMoveUpWithStallDetection extends ConditionalCommand {
	
	public NeckSafeMoveUpWithStallDetection(Neck neck, Slider slider) {
		super(new NeckMoveUpWithStallDetection(neck), new DoNothing(), new SliderSafetyCheck(slider));
	}

}
