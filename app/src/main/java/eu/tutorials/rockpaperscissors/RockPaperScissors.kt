package eu.tutorials.rockpaperscissors

fun main (){
    var computerChoice = ""
    var playerChoice = ""
    println("Rock , Paper , or Scissors? Enter your choice!")
    playerChoice = readln()


    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"

        }
        2 -> {
            computerChoice = "Paper"
        }
        else -> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)


    val winner = when {

        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "player wins"
        playerChoice == "Paper" && computerChoice == "Rock" -> "player wins"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "player wins"
        else  -> "Computer Wins"
    }
println("$winner")
}