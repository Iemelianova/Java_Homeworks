package com.solvd.music.rhythm.style;

import com.solvd.music.rhythm.Rhythm;

public class Styles extends Rhythm {

	public String musstyle = "classic";

	public Styles() {

	}

	public Styles(int century, String era, String kind, String musstyle) {
		super(century, era, kind);
		this.musstyle = musstyle;
	}

	public void printInfo() {
		
		
	}
}