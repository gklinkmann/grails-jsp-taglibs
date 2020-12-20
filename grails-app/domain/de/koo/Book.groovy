package de.koo

class Book {
	String title
	Author author

    static constraints = {
		title()
		author()
    }
	
	@Override
	public String toString() {
		title
	}
}
