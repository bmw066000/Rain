package edu.utsa.cs.my.rain.level.tile.spawn_level;

import edu.utsa.cs.my.rain.graphics.Screen;
import edu.utsa.cs.my.rain.graphics.Sprite;
import edu.utsa.cs.my.rain.level.tile.Tile;

public class SpawnGrassTile extends Tile {

	public SpawnGrassTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}

}
