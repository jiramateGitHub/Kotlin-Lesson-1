fun main(args: Array<String>) {
    var question = mapOf(
        "Who is your Team Leader?" to "Jiramate Phuaphan",
        "Who is your Plan Manager?" to "Thananya Banchuenwijit",
        "Who is your Develop Manager?" to "Sathien Supabkul",
        "Who is your Quality Manager?" to "Peeranat Buranarek",
        "Who is your Support Manager?" to "Wipawee Inkham"
    )
   
    for(value in question) {
        println("Question: ${value.key}")
        println("Answer: ${value.value}")
    }
}
