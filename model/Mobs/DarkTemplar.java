package model.Mobs;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import controller.ControllerMain;

public class DarkTemplar extends Mob {

	
public DarkTemplar(List<Point> movementPath) {
		
		super(movementPath, ControllerMain.TILE_SIZE/3, 
				ArmorAttribute.HEAVY_ARMOR, 
				AttackAttribute.WEAK_ATTACK, 
				DefenseAttribute.MEDIUM, 
				SpeedAttribute.SLOW, 
				new ArrayList<ResistanceAttribute>(
						Collections.singletonList(ResistanceAttribute.POISON)), 
				"DarkTemplar"+Mob.IDNumber++,
				"file:assets/images/mob/protoss/dark_templar.png", 54, 59,5,2);
	}
}
