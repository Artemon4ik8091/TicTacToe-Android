package com.aswer.TicTacToe

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val logo: TextView = findViewById(R.id.logo)
        val win: TextView = findViewById(R.id.win)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)
        val button4: Button = findViewById(R.id.button4)
        val button5: Button = findViewById(R.id.button5)
        val button6: Button = findViewById(R.id.button6)
        val button7: Button = findViewById(R.id.button7)
        val button8: Button = findViewById(R.id.button8)
        val button9: Button = findViewById(R.id.button9)
        val reset: Button = findViewById(R.id.reset)
        val funText: TextView = findViewById(R.id.fun_text)
        val podval: TextView = findViewById(R.id.podval)

        logo.text = "Крестики – нолики!"
        win.text = " "
        reset.text = "Начать заново."
        funText.text == " "

        button1.text = " "
        button2.text = " "
        button3.text = " "
        button4.text = " "
        button5.text = " "
        button6.text = " "
        button7.text = " "
        button8.text = " "
        button9.text = " "

        fun check_win() {
            if (button1.text == "❌" && button4.text == "❌" && button7.text == "❌") { win.text = "Крестики выиграли!" }
            else if (button2.text == "❌" && button5.text == "❌" && button8.text == "❌") { win.text = "Крестики выиграли!" }
            else if (button3.text == "❌" && button6.text == "❌" && button9.text == "❌") { win.text = "Крестики выиграли!" }
            else if (button1.text == "❌" && button2.text == "❌" && button3.text == "❌") { win.text = "Крестики выиграли!" }
            else if (button4.text == "❌" && button5.text == "❌" && button6.text == "❌") { win.text = "Крестики выиграли!" }
            else if (button7.text == "❌" && button8.text == "❌" && button9.text == "❌") { win.text = "Крестики выиграли!" }
            else if (button1.text == "❌" && button5.text == "❌" && button9.text == "❌") { win.text = "Крестики выиграли!" }
            else if (button3.text == "❌" && button5.text == "❌" && button7.text == "❌") { win.text = "Крестики выиграли!" }

            else if (button1.text == "⭕" && button4.text == "⭕" && button7.text == "⭕") { win.text = "Нолики выиграли!" }
            else if (button2.text == "⭕" && button5.text == "⭕" && button8.text == "⭕") { win.text = "Нолики выиграли!" }
            else if (button3.text == "⭕" && button6.text == "⭕" && button9.text == "⭕") { win.text = "Нолики выиграли!" }
            else if (button1.text == "⭕" && button2.text == "⭕" && button3.text == "⭕") { win.text = "Нолики выиграли!" }
            else if (button4.text == "⭕" && button5.text == "⭕" && button6.text == "⭕") { win.text = "Нолики выиграли!" }
            else if (button7.text == "⭕" && button8.text == "⭕" && button9.text == "⭕") { win.text = "Нолики выиграли!" }
            else if (button1.text == "⭕" && button5.text == "⭕" && button9.text == "⭕") { win.text = "Нолики выиграли!" }
            else if (button3.text == "⭕" && button5.text == "⭕" && button7.text == "⭕") { win.text = "Нолики выиграли!" }

            else { win.text = " " }
        }

        fun check_fun() {
            if (button1.text == "❌" && button5.text == "❌" && button9.text == "❌" && button3.text == "❌" && button7.text == "❌") { funText.text = "SUPER MEGA X" }
            else if (button2.text == "❌" && button6.text == "❌" && button8.text == "❌" && button4.text == "❌") { funText.text = "РомбЭк." }
            //else if (button2.text == "❌" && button5.text == "❌" && button8.text == "❌" && button6.text == "❌" && button4.text == "❌") { funText.text = "++++++++++++" }
            //else if (button1.text == "❌" && button2.text == "❌" && button3.text == "❌" && button6.text == "❌" && button9.text == "❌" && button8.text == "❌" && button7.text == "❌" && button4.text == "❌") { funText.text = "КВАДРАТик" }

            else if (button1.text == "⭕" && button5.text == "⭕" && button9.text == "⭕" && button3.text == "⭕" && button7.text == "⭕") { funText.text = "Just X" }
            else if (button2.text == "⭕" && button6.text == "⭕" && button8.text == "⭕" && button4.text == "⭕") { funText.text = "РомбЭк." }
            //else if (button2.text == "⭕" && button5.text == "⭕" && button8.text == "⭕" && button6.text == "⭕" && button4.text == "⭕") { funText.text = "++++++++++++" }
            //else if (button1.text == "⭕" && button2.text == "⭕" && button3.text == "⭕" && button6.text == "⭕" && button9.text == "⭕" && button8.text == "⭕" && button7.text == "⭕" && button4.text == "⭕") { funText.text = "КВАДРАТик" }

            else { funText.text = " " }
        }

        fun check_all() {
            check_win()
            check_fun()
        }

        button1.setOnClickListener {
            if (button1.text == " " || button1.text == "⭕") { button1.text = "❌" }
            else { button1.text = "⭕" }
            check_all()
        }
        button2.setOnClickListener {
            if (button2.text == " " || button2.text == "⭕") { button2.text = "❌" }
            else { button2.text = "⭕" }
            check_all()
        }
        button3.setOnClickListener {
            if (button3.text == " " || button3.text == "⭕") { button3.text = "❌" }
            else { button3.text = "⭕" }
            check_all()
        }
        button4.setOnClickListener {
            if (button4.text == " " || button4.text == "⭕") { button4.text = "❌" }
            else { button4.text = "⭕" }
            check_all()
        }
        button5.setOnClickListener {
            if (button5.text == " " || button5.text == "⭕") { button5.text = "❌" }
            else { button5.text = "⭕" }
            check_all()
        }
        button6.setOnClickListener {
            if (button6.text == " " || button6.text == "⭕") { button6.text = "❌" }
            else { button6.text = "⭕" }
            check_all()
        }
        button7.setOnClickListener {
            if (button7.text == " " || button7.text == "⭕") { button7.text = "❌" }
            else { button7.text = "⭕" }
            check_all()
        }
        button8.setOnClickListener {
            if (button8.text == " " || button8.text == "⭕") { button8.text = "❌" }
            else { button8.text = "⭕" }
            check_all()
        }
        button9.setOnClickListener {
            if (button9.text == " " || button9.text == "⭕") { button9.text = "❌" }
            else { button9.text = "⭕" }
            check_all()
        }
        reset.setOnClickListener {
            button1.text = " "
            button2.text = " "
            button3.text = " "
            button4.text = " "
            button5.text = " "
            button6.text = " "
            button7.text = " "
            button8.text = " "
            button9.text = " "
            check_all()
        }

        podval.setOnClickListener {
            Toast.makeText(
                this,
                "Приветики ^_^",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}