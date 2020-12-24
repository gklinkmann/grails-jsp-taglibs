package de.koo

import org.unbescape.html.HtmlEscape

class UnbescapeTagLib {
    static defaultEncodeAs = [taglib:'none']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]
	
	def unescape = {attrs, body ->
		out << HtmlEscape.unescapeHtml(body.call().toString())
	}
}
