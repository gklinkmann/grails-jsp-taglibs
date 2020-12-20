package de.koo

import org.displaytag.decorator.TableDecorator

class DisplaytagWrapper extends TableDecorator{
	public String getLinkToAuthor() {
		def author = getCurrentRowObject()
		return '<a href="/author/show/${author.id}">${author.lastname}</a>';
	}
}
