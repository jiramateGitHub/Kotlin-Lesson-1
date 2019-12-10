class Team {
    public var name : String
    public var grade : Double
    constructor(){
        this.name = ""
        this.grade = 0.0
    }
    constructor(name:String,grade:String){
        this.name = name
        this.grade = grade.toDouble()
    }
    public fun show_info(){
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
        println("Name ${name} | Grade ${str_grade}")
    }
}

fun main(args: Array<String>) {
    var stu = arrayOf(
                        Team("Jiramate Phuaphan","0.5"),
                        Team("Thananya Banchuenwijit","92"),
                        Team("Kessarin U-tumporn","80.5"),
                        Team("Sathien Supabkul","62"),
                        Team("Nuttorn Porkpibul","70"),
                        Team("Peeranat Buranarek","80.5"),
                        Team("Thanpisit Suetrong","80"),
                        Team("Wipawee Inkham","80.5"),
                        Team("Netchanok Thaintin","65.5")
                    )
    for(value in stu) {
        value.show_info()
    }
}