package com.rupinder.fragmentt

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.rupinder.fragmentt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var fragmentInterface: FragmentInterface
    lateinit var binding: ActivityMainBinding
    var i=1
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btn1.setOnClickListener {
            var alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("COLOR DIALOG")
            alertDialog.setMessage("SELECT THE COLOR YOU WANT")
            alertDialog.setPositiveButton("YELLOW") { p, q ->
                fragmentInterface.fragmentInterface(0)
                i++
            }
            alertDialog.setNegativeButton("RED") { p, q ->
                fragmentInterface.fragmentInterface(1)
                i++

            }
            alertDialog.setNeutralButton("PINK") { p, q ->
                fragmentInterface.fragmentInterface(2)
                i++
            }
            alertDialog.show()


        }
    }




    }
