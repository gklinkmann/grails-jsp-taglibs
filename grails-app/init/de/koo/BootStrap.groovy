package de.koo

class BootStrap {
	AuthorService authorService
	def books=[["Fundamentals of Wavelets","Goswami, Jaideva","tech","signal_processing",228,"Wiley"]
		,["Data Smart","Foreman, John","tech","data_science",235,"Wiley"]
		,["God Created the Integers","Hawking, Stephen","tech","mathematics",197,"Penguin"]
		,["Superfreakonomics","Dubner, Stephen","science","economics",179,"HarperCollins"]
		,["Orientalism","Said, Edward","nonfiction","history",197,"Penguin"]
		,["Nature of Statistical Learning Theory, The","Vapnik, Vladimir","tech","data_science",230,"Springer"]
	]
		
    def init = { servletContext ->
		books.each {book->
			def names=book[1].split(", ")
			def author=new Author(firstname:names[1],lastname:names[0],books:[[title:book[0]]])
			authorService.save(author)
		}
    }
    def destroy = {
    }
}
