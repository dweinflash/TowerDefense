package model.Mobs;


public enum ResistanceAttribute {
	
	//DEMO is used only for testing, to show a full resistance to any shot
	DEMO(1), NONE(0), FIRE(.33), ICE(.33), POISON(.5);
	
	private double resistance;
	
	ResistanceAttribute(double value) {
		resistance=value;
	}
	
	public double getResistance() {
		return resistance;
	}
}
