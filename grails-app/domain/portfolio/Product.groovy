package portfolio

class Product {

	Date dateCreated
	Date lastUpdated
	
	// properties
	String name
	String description
	Float price
	Integer stock

	static belongsTo = [category:Category]
	
    static constraints = {
		name(blank:false,unique:true)
		description(blank:false)
		price(blank:false)
    }
	
	String toString() { return name }
}
