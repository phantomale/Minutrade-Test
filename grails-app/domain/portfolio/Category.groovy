package portfolio

class Category {

	// properties
	String name

	static hasMany = [products:Product]

    static constraints = {
		name(unique:true)
    }
	
	String toString() { return name }
}
