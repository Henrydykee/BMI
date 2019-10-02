package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculate(view: View) {
        val  weight : Double
        val  height : Double
        val myBMI : Float
        


        weight = weight_text_view?.text.toString().toDouble()
        height =height_text_view?.text.toString().toDouble()


       myBMI = caculateBMI(weight,height)
        bmi_text_view.text =myBMI.toString()
        if (myBMI <18.5 ){
            image_view.setImageResource(R.drawable.underweight)
        }else if (myBMI > 18.5 && myBMI <24.9){
            image_view.setImageResource(R.drawable.healthy)
        }else if (myBMI > 24.9 && myBMI <29.9){
            image_view.setImageResource(R.drawable.overweight)
        }else if (myBMI > 29.9 ){
            image_view.setImageResource(R.drawable.obesity)
        }

        image_view.visibility = View.VISIBLE
        bmi_text_view.visibility =View.VISIBLE


    }

    fun caculateBMI(weight: Double, height: Double):Float {
        var myBMI : Float
        myBMI = ((weight*0.35)/((height*0.025)*(height*0.025))).toFloat()
        return myBMI
    }
}
