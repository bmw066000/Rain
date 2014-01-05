package edu.utsa.cs.my.rain.entity.mob;

import edu.utsa.cs.my.rain.entity.Entity;
import edu.utsa.cs.my.rain.entity.projectile.Projectile;
import edu.utsa.cs.my.rain.entity.projectile.WizardProjectile;
import edu.utsa.cs.my.rain.graphics.Sprite;

public abstract class Mob extends Entity {
	
	protected Sprite sprite;
	protected int dir = 0;
	protected boolean moving = false;
	
	public void move(int xa, int ya) {
		if (xa != 0 && ya != 0) {
			move(xa, 0);
			move(0, ya);
			return;
		}
		
		if (xa > 0) dir = 1;
		if (xa < 0) dir = 3;
		if (ya > 0) dir = 2;
		if (ya < 0) dir = 0;
		
		if (!collision(xa, ya)) {
			x += xa;
			y += ya;
		}
	}
	
	@Override
	public void update() {
	}
	
	protected void shoot(int x, int y, double dir) {
		Projectile p = new WizardProjectile(x, y, dir);
		level.addProjectile(p);
	}
	
	private boolean collision(int xa, int ya) {
		for (int c = 0; c < 4; c++) {
			int xt = ((x + xa) + c % 2 * 14 - 8) >> 4;
			int yt = ((y + ya) + c / 2 * 12 + 3) >> 4;
			if (level.getTile(xt, yt).solid()) return true;
		}
		return false;
	}
	
	public void render() {
	}

}
