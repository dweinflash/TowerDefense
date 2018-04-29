package model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Vector;
import java.util.Collections;
import java.util.Vector;

import controller.ControllerMain;


/*============================================================================*
 *                                                                            |
 * 	BattleCruiser Mob                                                         |
 *  Highest tier mob of fthe Terran category, slow moving with a fast but     |
 *  weak atack to simulate gunfire attacks. High armor and HP. Tough to beat  |
 *  Resistance:                                                               |
 *============================================================================*/

public class BattleCruiser extends Mob implements Serializable {

	public BattleCruiser(Vector<Point> movementPath, TowerGame game) {
		
		super(movementPath, ControllerMain.TILE_SIZE/3, 
				ArmorAttribute.HEAVY_ARMOR, 
				AttackAttribute.WEAK_ATTACK, 
				DefenseAttribute.LARGE, 
				SpeedAttribute.SLOW, 
				new Vector<ResistanceAttribute>(
						Collections.singletonList(ResistanceAttribute.ELECTRIC)), 
				"BattleCruiser"+Mob.IDNumber++,
				"file:assets/images/mob/terran/battlecruiser.png", "bc_death",
        265.0,
        209.0,
        78.0,
        77.0,
        0.0,
        0.0, 
        1,
        game
        );
	}
}
