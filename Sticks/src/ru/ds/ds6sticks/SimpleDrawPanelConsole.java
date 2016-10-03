package ru.ds.ds6sticks;

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
		g.setColor(new Color(100, 0, 0));
		g.fillOval(x, y, w, h);
	}

}