package de.koo

class Author {
	String firstname, lastname
	static hasMany = [books: Book]

    static constraints = {
    	lastname()
		firstname()
		books()
    }
	
	@Override
	public String toString() {
		"${firstname} ${lastname}"
	}
}
