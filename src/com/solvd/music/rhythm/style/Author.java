package com.solvd.music.rhythm.style;

import com.solvd.music.rhythm.style.Author;
import com.solvd.music.rhythm.style.Styles;

public class Author extends Styles {

	private String composer = "Edvard Greig";

	public Author() {

	}

	public Author(int century, String era, String kind, String musstyle) {
		super(century, era, kind, musstyle);

	}

	public void setComposer(String value) {
		this.composer = value;

	}

	public String getComposer() {
		return this.composer;
	}

	public void printInfo() {
		
	}
}
