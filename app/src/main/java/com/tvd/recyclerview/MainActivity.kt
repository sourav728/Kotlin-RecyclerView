package com.tvd.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val cricketer_name = listOf("Sourav","Sachin","Rahul","Dhoni","Kholi")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        recyclerview.adapter = MyAdapter(cricketer_name,this)
    }
}
