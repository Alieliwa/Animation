package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var mimage1 : ImageView
    lateinit var  imageView2 :ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
        mimage1 =findViewById(R.id.mimage1)
        imageView2 = findViewById(R.id.imageView2)



          //  mimage1.animate().alpha(0f).duration = 3000  // hide image when click on it

           // mimage1.animate().translationXBy(1000f).duration = 3000 // go to X axis to right
            // mimage1.animate().translationXBy(-1000f).duration = 3000 // go to X axis to left
            // mimage1.animate().translationYBy(1000f).duration = 3000 // go to X axis to done

          //  mimage1.animate().translationYBy(-1000f).duration = 3000 //go to Y axis to UP
           mimage1.animate()
               .rotation(360f)
               .translationXBy(-1500f)
               .translationYBy(-1500f)
               .duration = 5000 // rotation

        imageView2.animate()
            .rotation(360f)
            .translationXBy(1500f)
            .translationYBy(1500f)
            .duration = 5000

    }
}