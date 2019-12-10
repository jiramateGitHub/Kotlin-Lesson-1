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
    var pd = Products("box",10.5)
    pd.show_info()
}