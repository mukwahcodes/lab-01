package com.example.petshop


// Abstract means that the class can't be used though paired
// with a subclass it could be used

abstract class Pet(val name: String, var age: Int) {
    abstract fun speak(): String
}