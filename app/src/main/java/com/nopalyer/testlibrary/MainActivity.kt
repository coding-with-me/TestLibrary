package com.nopalyer.testlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nopalyer.calculation.calculate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resultPlus:Int = calculate.plus(10,20)
        var resultMinus:Int = calculate.minus(10,15)
        var resultDivide:Int = calculate.divide(12,4)
        var resultMultiply:Int = calculate.multiply(2,5)


        btnPlus.setOnClickListener{
            Toast.makeText(this,resultPlus.toString(),Toast.LENGTH_LONG).show()
        }
        btnMinus.setOnClickListener{
            Toast.makeText(this,resultMinus.toString(),Toast.LENGTH_LONG).show()
        }
        btnDivide.setOnClickListener{
            Toast.makeText(this,resultDivide.toString(),Toast.LENGTH_LONG).show()
        }
        btnMultiply.setOnClickListener{
            Toast.makeText(this,resultMultiply.toString(),Toast.LENGTH_LONG).show()
        }



    }
}
