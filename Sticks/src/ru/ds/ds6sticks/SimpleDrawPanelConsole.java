package ru.ds.ds6sticks;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.InputStream;
import java.net.URL;

import ru.ispras.drawpanel.DrawPanelConsole;

public class SimpleDrawPanelConsole extends DrawPanelConsole {

	int width;

	int height;

	@Override
	public long getInterval() {
		return 5;
	}

	@Override
	public boolean update() {
		x += 1;
		y += 1;
		return true;
	}

	@Override
	public void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}

	int x = 0;
	int y = 0;
	int w = 40;
	int h = 40;

	@Override
	public void paint(Graphics g) {
		Image texture = getTexture("sharik.png");
		g.setColor(new Color(100, 0, 0));
		g.drawImage(texture, x, y, w, h, null);
	}

}