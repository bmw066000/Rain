package edu.utsa.cs.my.rain.entity.mob;

import edu.utsa.cs.my.rain.entity.Entity;
import edu.utsa.cs.my.rain.graphics.Sprite;

public abstract class Mob extends Entity {
	
	protected Sprite sprite;
	protected int dir = 0;
	protected boolean moving = false;
	
	public void move() {
	}
	
	public void update() {
	}
	
	private boolean collision() {
		return false;
	}

}
