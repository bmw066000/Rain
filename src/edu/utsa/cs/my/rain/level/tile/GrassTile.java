package edu.utsa.cs.my.rain.level.tile;

import edu.utsa.cs.my.rain.graphics.Screen;
import edu.utsa.cs.my.rain.graphics.Sprite;

public class GrassTile extends Tile {

	public GrassTile(Sprite sprite) {
		super(sprite);
	}
	
	@Override
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}

}
