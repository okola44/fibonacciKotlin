package com.example.recycler_views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
    }
    fun castViews(){
        var rvNumbers=findViewById<RecyclerView>(R.id.rvNumbers)
        rvNumbers.layoutManager=LinearLayoutManager(baseContext)
        var numbersAdapter=numbersRvAdapter(fibonacciNumbers(100))
        rvNumbers.adapter=numbersAdapter
    }
    fun fibonacciNumbers(maxi:Int):List<BigInteger>{
        var count=0
        var firstNum=0.toBigInteger()
        var secondNum=1.toBigInteger()
        var fibbonacci= mutableListOf<BigInteger>()
        fibbonacci.add(firstNum)
        fibbonacci.add(0.toBigInteger())

        while (count<maxi){
            println(firstNum)
            var total=firstNum+secondNum
            firstNum=secondNum
            secondNum=total
            count++
            fibbonacci.add(firstNum)
        }
    return fibbonacci
    }

}


//create layout for a single item
//a view holder for a single
//an adapter to translate ourr views
//recycler views commonly show data that is already there,like whatsapp chats and contacts
