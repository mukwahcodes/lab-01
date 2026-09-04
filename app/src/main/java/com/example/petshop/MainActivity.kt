// This is like a folder name
package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.petshop.ui.theme.PetShopTheme

// MainActivity is similar to a main function and will run instantly
// Bundle datatype that holds keys and values
//Activity = the box/container.
//onCreate() = the setup step for that box.
//setContent {} = where you tell it what UI to display.
class MainActivity : ComponentActivity()
    {
    // --------------------------Creates the Interface--------------------------------
    // The onCreate will also run instantly
    override fun onCreate(savedInstanceState: Bundle?)


    {


        super.onCreate(savedInstanceState)
        // This allows the activity window to use the
        // the full screen meaning status bar/ Navigation bar
        enableEdgeToEdge()
        // Where my ui exists on the activity
        setContent {

            PetShopTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        testing()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {


    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

// @ Composeable tells you this creates a part of the interface
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PetShopTheme {
        Greeting("Android")
    }
}

fun testing(){
    /*
        Purpose:    To test the basics implementations do in fact work
        Parmeters:  None
        Return:     Nothing
     */

    val cat = Cat("Coco", 6)
    val dog = Dog("Mochi", 6)
    val scorpion = Scorpion("Stinger", 32)
    val pets = mutableListOf(cat, dog, scorpion)
    val pettablePets = mutableListOf<Pettable>(cat, dog)

    cat.pet()
    dog.pet()

    val david = Happy("July 1st")
    val stephen = Sad( "Sept 1st")

    // As requested this returns a string of the current mood
    println( "This returns david mood which is: ${david.getMood()}  ")
    println( "This returns stephen mood which is: ${stephen.getMood()}  ")

    // This is just the moods if you wanted a sentence like before!
    david.currentmood()
    stephen.currentmood()



}