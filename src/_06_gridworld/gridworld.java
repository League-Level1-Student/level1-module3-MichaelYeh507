package _06_gridworld;

import java.awt.Color;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridworld {
	
	public static void main(String[] args) {
		World gridWorld = new World();
		gridWorld.show();
		Bug bob = new Bug(Color.red);
		bob.turn();
		Location bobLocation = new Location(5, 4);
		//gridWorld.add(bobLocation, bob);
		Flower fl = new Flower(Color.blue);
		Location flowerLocation = new Location(5, 5);
		gridWorld.add(flowerLocation, fl);
		
		
	}	
}
