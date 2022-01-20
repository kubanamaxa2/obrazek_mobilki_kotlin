package com.example.obrazekijegomanipulacje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var obrazek = 1;
        var obrut = findViewById<EditText>(R.id.obroot).text; /*wole nie używać polskich znaków w zmiennych więc obr u t */

        findViewById<Button>(R.id.button2).setOnClickListener{
            obrazek += 1;
            if (obrazek == 5){obrazek = 1}
            if(obrazek == 1){findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tier1helmetarmory)}
            if(obrazek == 2){findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tier1vestarmory)}
            if(obrazek == 3){findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tier2helmetarmory)}
            if(obrazek == 4){findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tier2vestarmory)}
        }
        findViewById<Button>(R.id.button).setOnClickListener{
            obrazek -= 1;
            if (obrazek == 0){obrazek = 4}
            if(obrazek == 1){findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tier1helmetarmory)}
            if(obrazek == 2){findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tier1vestarmory)}
            if(obrazek == 3){findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tier2helmetarmory)}
            if(obrazek == 4){findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.tier2vestarmory)}
        }
        findViewById<Button>(R.id.lewo).setOnClickListener{
            var wartosc = obrut.toString().toFloat();
            if(obrut.toString() != "") {
                wartosc = wartosc - (wartosc * 2);
                findViewById<ImageView>(R.id.imageView).setRotationY(wartosc)
                wartosc = wartosc + wartosc;
            }
        }
        findViewById<Button>(R.id.prawo).setOnClickListener{
            var wartosc = obrut.toString().toFloat();
            if(obrut.toString() != ""){
                findViewById<ImageView>(R.id.imageView).setRotationY(wartosc)
                wartosc = wartosc - wartosc;
            }
        }

    }
}