package aman.uicolorchangeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View
import android.graphics.Color


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById<Button>(R.id.button1)
        val button2: Button = findViewById<Button>(R.id.button2)
        val button3: Button = findViewById<Button>(R.id.button4)
        val button4: Button = findViewById<Button>(R.id.button5)
        val button5: Button = findViewById<Button>(R.id.button3)
        var b1=false
        var b2=false
        var b3=false
        var b4=false
        var b5=false

        with(button1)
            {
                setBackgroundColor(Color.GRAY)
                setOnClickListener(object : View.OnClickListener {
                    override fun onClick(p0: View?) {

                     if (!b1) {
                        setBackgroundColor(Color.RED)
                        b1 = true
                    } else {
                        setBackgroundColor(Color.GRAY)
                        b1 = false
                    }
                }})
        }

        with(button2){
            setBackgroundColor(Color.GRAY)

            setOnClickListener(object : View.OnClickListener {
                override fun onClick(p0: View?) {
                    if (!b2)
                    {
                        setBackgroundColor(Color.BLUE)
                        b2=true
                    }
                    else
                    {
                        setBackgroundColor(Color.GRAY)
                        b2=false
                    } }})
            with(button3)
            {
                setBackgroundColor(Color.GRAY)

                button3.setOnClickListener(object : View.OnClickListener {
                        override fun onClick(p0: View?) {
                            if (!b3)
                            {
                                setBackgroundColor(Color.GREEN)
                                b3=true
                            }
                            else
                            {
                                setBackgroundColor(Color.GRAY)
                                b3=false
                            }
                                                        }
            })
            }

            with(button4) {
                setBackgroundColor(Color.GRAY)

                setOnClickListener(object : View.OnClickListener {
                    override fun onClick(p0: View?) {

                        if (!b4) {
                            setBackgroundColor(Color.MAGENTA)
                            b4 = true
                        } else {
                            setBackgroundColor(Color.GRAY)
                            b4 = false
                        }
                    }
                })
            }

            with(button5) {
                setBackgroundColor(Color.GRAY)

                setOnClickListener(object : View.OnClickListener {
                override fun onClick(p0: View?) {
                                    if (!b5)
                                    {
                                        setBackgroundColor(Color.YELLOW)
                                        b5=true
                                    }
                                    else
                                    {
                                        setBackgroundColor(Color.GRAY)
                                        b5=false
                                    }
                }
            }
            )
            }

            } }


}
