package com.mygdx.sorryFib;

public class Input {
	
	public static int x;
	public static int y;
	public static boolean down;
	public static boolean pdown;
	
	public static void update() {
		pdown = down;
	}
	
	public static boolean isDown() { return down; }
	public static boolean isPressed() { return down && !pdown; }
	public static boolean isReleased() { return !down && pdown; }
	
}