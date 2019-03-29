package com.agarcia.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.poke.*


class NewActi : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mIntent =intent
        poke.setText(mIntent.getStringExtra("textkey"))

    }

}

