import com.train.Ticket

fun main(args: Array<String>) {
    print("Please enter number of tickets:")
    var ticket = readLine()!!.toInt()
    print("How many round-trip tickets: ")
    var round = readLine()!!.toInt()
    val t = Ticket(ticket, round)
    t.print()
}

class Ticket(var ticket : Int, var round : Int) {
    val fee = 1000
    val round_fee = 2000
    val discount = 0.9
    fun print() {
        println("Total tickets: $ticket\tRound-trip: $round\tTotal: ${totalFee()}")
    }

    fun totalFee() = (ticket-round)*fee+round*discount*round_fee
}