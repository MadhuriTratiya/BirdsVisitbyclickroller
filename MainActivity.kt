package madhuri.com.birdsvisit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    lateinit var Rolltext : TextView
    lateinit var Rollimage : ImageView
    lateinit var Rollbutton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Rolltext = findViewById(R.id.rolltext)
        Rollimage = findViewById(R.id.rollimage)
        Rollbutton = findViewById(R.id.rollbutton)

        //change text
        //Rolltext.text = "Bird Id"

        Rollbutton.setOnClickListener {
         //   Toast.makeText(this, "Bird visit button clicked", Toast.LENGTH_SHORT).show()
            birdvisit()
        }
    }

    private fun birdvisit() {
        val randombirdpicker = Random().nextInt(6)+1
        Rolltext.text = randombirdpicker.toString()

       val rolledImage =  when(randombirdpicker)
        {
            1 -> R.drawable.one
            2 -> R.drawable.two
            3 -> R.drawable.three
            4 -> R.drawable.four
            5 -> R.drawable.five
            else -> R.drawable.six
        }
        Rollimage.setImageResource(rolledImage)
    }
}