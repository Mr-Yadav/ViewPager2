package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    lateinit var viewpager:ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager=findViewById(R.id.view_pager)



        val person = item(R.drawable.`as`,"Hello")


        val Mylist : ArrayList<item> = ArrayList()



        Mylist.add(item(R.drawable.`as`,"Hello"))
        Mylist.add(item(R.drawable.heroin,"It's"))
        Mylist.add(item(R.drawable.sh,"Working "))
        Mylist.add(item(R.drawable.stry,"ooo"))
        Mylist.add(item(R.drawable.yep,"Jio"))


        val adapter = ViewpagerAdapter(Mylist)

        viewpager.adapter = adapter


    }

}