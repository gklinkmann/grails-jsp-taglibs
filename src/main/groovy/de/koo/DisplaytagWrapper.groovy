package de.koo

import org.displaytag.decorator.TableDecorator

class DisplaytagWrapper extends TableDecorator{
	public String getAuthorLink() {
		def author = getCurrentRowObject()
		return '<a href=\"/author/show/'+author.id+'">'+author.id+'</a>';
	}
	
	public String getAuthorBooks() {
		def author = getCurrentRowObject()
		def books="<ul>"
		author?.books.each { book-> 
			books <<= "<li>${book.title}</li>"
		}
		books <<= "</ul>"
		
		return books.toString();
	}
}
