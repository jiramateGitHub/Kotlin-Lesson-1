class Products(name:String,price:Double) {
    public var name : String
    public var price : Double
    init{
        this.name = name
        this.price = price
    }
    public fun show_info(){
        println("${name} ${price}")
    }
}

fun main(args: Array<String>) {
    var pd = arrayOf(Products("box 1",5.5),Products("box 2",10.5))
    pd[0].show_info()
    pd[1].show_info()
}