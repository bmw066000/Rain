package edu.utsa.cs.my.rain.level.tile;

import edu.utsa.cs.my.rain.graphics.Screen;
import edu.utsa.cs.my.rain.graphics.Sprite;

public class VoidTile extends Tile {

	public VoidTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x, y, this);
	}

}
