class Team {
    public var name : String
    public var position : String
    public var grade : Double
    
    constructor(){
        this.name = ""
        this.grade = 0.0
        this.position = ""
    }
    constructor(name:String,grade:String,position:String){
        this.name = name
        this.position = position
        this.grade = grade.toDouble()
    }
    public fun show_grade(){
        var str_grade:String
        if(this.grade >= 80){
            str_grade = "A"
        }else if(this.grade >= 75){
            str_grade = "B+"
        }else if(this.grade >= 70){
            str_grade = "B"
        }else if(this.grade >= 65){
            str_grade = "C+"
        }else if(this.grade >= 60){
            str_grade = "C" 
        }else if(this.grade >= 55){
            str_grade = "D+"
        }else if(this.grade >= 50){
            str_grade = "D"
        }else{
            str_grade = "F"
        }
        println("My name is ${name} I got ${this.grade} My Grade is ${str_grade}")
    }
    public fun show_info(): String{
        var info = "Name ${name} | Position ${position}"
        return info
    }
}

fun main(args: Array<String>) {
    var stu = listOf(
                        Team("Jiramate Phuaphan","0.5","TL"),
                        Team("Thananya Banchuenwijit","92","PM"),
                        Team("Kessarin U-tumporn","80.5","PM"),
                        Team("Sathien Supabkul","62","DM"),
                        Team("Kanthip Supabkul","62","DM"),
                        Team("Nuttorn Porkpibul","70","DM"),
                        Team("Peeranat Buranarek","80.5","QM"),
                        Team("Thanpisit Suetrong","80","QM"),
                        Team("Wipawee Inkham","80.5","SM"),
                        Team("Netchanok Thaintin","65.5","SM")
                    )
    for((index, value) in stu.withIndex()) {
        value.show_grade()
    }
}
