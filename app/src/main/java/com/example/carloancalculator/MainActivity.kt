package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calculate()
    }

    fun calculate(){
    val buttonCal = findViewById<Button>(R.id.buttonCalculate)
        buttonCal.setOnClickListener{
            val edit1 = findViewById<EditText>(R.id.editTextCarPrice)
            val edit2 = findViewById<EditText>(R.id.editTextDownPayment)
            val edit3 = findViewById<EditText>(R.id.editTextInterestRate)
            val edit4 = findViewById<EditText>(R.id.editTextLoanPeriod)


            val view1 = findViewById<TextView>(R.id.textView7)
            val view2 = findViewById<TextView>(R.id.textView8)
            val view3 = findViewById<TextView>(R.id.textView9)


           val carloan:Double =  edit1.text.toString().toDouble() - edit2.text.toString().toDouble()
            val interest:Double = carloan * edit3.text.toString().toDouble() * edit4.text.toString().toDouble()
            val montre:Double = (carloan + interest) / edit4.text.toString().toDouble() / 12


            view1.setText("RM %.2f".format(interest))
            view2.setText("RM %.2f".format(carloan))
            view3.setText("RM %.2f".format(montre))
        }
    }
}
