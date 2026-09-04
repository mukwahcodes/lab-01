package com.example.petshop

class Happy(date: String): Mood( date) {

    override fun currentmood()  {
        println("The day is $date and I am happy.")
    }
    override fun getMood(): String {
        return "Happy"
    }
}