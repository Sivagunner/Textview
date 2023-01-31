package com.example.textview

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    lateinit var input: EditText
    lateinit var output: TextView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        input = findViewById(R.id.etInput)
        output = findViewById(R.id.textView)
        button = findViewById(R.id.button1)
        input.addTextChangedListener(textWatcher)
        button.setOnClickListener(){
            Toast.makeText(this,"button 1 clicked", Toast.LENGTH_SHORT).show()
        }

    }


    private val textWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            output.text = s
            if (start == 12) {
                Toast.makeText(applicationContext, "Maximum Limit Reached", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}










