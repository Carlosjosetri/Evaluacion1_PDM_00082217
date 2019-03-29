package com.agarcia.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var mIntent = Intent(this@MainActivity,NewActi::class.java)
        p1.setOnClickListener {
             var value = Integer.parseInt(cp1.getText().toString())
            value++
            cp1.setText(Integer.toString(value))
        }
        p2.setOnClickListener {
            var value = Integer.parseInt(cp2.getText().toString())
            value++
            cp2.setText(Integer.toString(value))
        }
        p3.setOnClickListener {
            var value = Integer.parseInt(cp3.getText().toString())
            value++
            cp3.setText(Integer.toString(value))
        }
        p4.setOnClickListener {
            var value = Integer.parseInt(cp4.getText().toString())
            value++
            cp4.setText(Integer.toString(value))
        }
        p5.setOnClickListener {
            var value = Integer.parseInt(cp5.getText().toString())
            value++
            cp5.setText(Integer.toString(value))
        }
        p6.setOnClickListener {
            var value = Integer.parseInt(cp6.getText().toString())
            value++
            cp6.setText(Integer.toString(value))
        }
        p7.setOnClickListener {
            var value = Integer.parseInt(cp7.getText().toString())
            value++
            cp7.setText(Integer.toString(value))
        }
        p8.setOnClickListener {
            var value = Integer.parseInt(cp8.getText().toString())
            value++
            cp8.setText(Integer.toString(value))
        }
        p9.setOnClickListener {
            var value = Integer.parseInt(cp9.getText().toString())
            value++
            cp9.setText(Integer.toString(value))
        }
        sndnds.setOnClickListener{

            mIntent.putExtra("textkey","5")
            startActivityForResult(mIntent,)
        }


    }




}

