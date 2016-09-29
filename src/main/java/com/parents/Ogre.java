package com.parents;

import com.app.Weapons.Weapon;

public class Ogre extends CharacterClass {

	protected int health = 0;

	public Ogre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ogre(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setHealth(int health) {
		// TODO Auto-generated method stub
		super.setHealth(health);
	}

	@Override
	public void setMagic(int magic) {
		// TODO Auto-generated method stub
		super.setMagic(magic);
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	
	
}
