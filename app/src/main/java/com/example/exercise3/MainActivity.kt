package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //put value from string array persons into variable stringArray
        val stringArray = resources.getStringArray(R.array.persons)

        //for each loop, print each item
        stringArray.forEach { item ->
            println(item)
        }

        printArray.text=R.array.persons.joinToString()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.ex3_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //prints the MENU ID from the selected MENU ITEM in the info Log
        when(item.itemId){
            R.id.Eins -> Log.i("MENU", "EINS")
            R.id.Zwei -> Log.i("MENU", "ZWEI")
            R.id.Drei -> Log.i("MENU", "DREI")
        }
        return super.onOptionsItemSelected(item)
    }
}
