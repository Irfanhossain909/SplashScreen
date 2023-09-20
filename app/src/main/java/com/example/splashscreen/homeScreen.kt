package com.example.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import com.example.splashscreen.databinding.ActivityHomeScreenBinding

class homeScreen : AppCompatActivity() {
    private val binding by lazy {
        ActivityHomeScreenBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        this.setTitle("")

        binding.button.setOnClickListener {
            val popupMenu = PopupMenu(this@homeScreen,binding.button)
            popupMenu.menuInflater.inflate(R.menu.popmenu, popupMenu.menu)
            popupMenu.show()
           popupMenu.setOnMenuItemClickListener{
               it->
               Toast.makeText(this@homeScreen, "You Clicked :"+it.title, Toast.LENGTH_SHORT).show()
               true
           }
            popupMenu.show()

        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.popmenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.kotlin->{
                Toast.makeText(this,"Kotlin",Toast.LENGTH_SHORT).show()
            }
            R.id.python->{
                Toast.makeText(this,"Python",Toast.LENGTH_SHORT).show()
            }
            R.id.cplus->{
                Toast.makeText(this,"C++",Toast.LENGTH_SHORT).show()
            }
            R.id.onlyc->{
                Toast.makeText(this,"C",Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}