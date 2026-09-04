package com.example.petshop

class Sad(date: String ): Mood(date){
    override fun currentmood() {
        println("The day is $date and I am sad")
    }

    override fun getMood(): String {
        return "Sad"
    }
}