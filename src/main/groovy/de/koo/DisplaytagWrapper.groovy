package de.koo

import org.displaytag.decorator.TableDecorator
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class DisplaytagWrapper extends TableDecorator{
	Logger log = LoggerFactory.getLogger("de.koo.DisplaytagWrapper")
	
	public String getAuthorLink() {
		def author = getCurrentRowObject()
		return '<a href=\"/author/show/'+author.id+'">'+author.id+'</a>';
	}
	
	public String getAuthorBooks() {
		def author = getCurrentRowObject()
		def books=author?.books.collect{it.title}
		books.join(", ")
	}
}
