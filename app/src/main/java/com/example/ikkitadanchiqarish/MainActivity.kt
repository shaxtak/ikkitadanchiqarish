package com.example.ikkitadanchiqarish

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.ikkitadanchiqarish.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var editText: EditText? = null
    private var textView: TextView? = null
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        editText = binding.editText
        textView = binding.textView
       binding.editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable) {
                val inputText = s.toString()
                var modifiedText: String? = ""
                for (i in 0 until inputText.length) {
                    val c = inputText[i]
                    modifiedText += c
                    modifiedText += c
                }
                binding.textView.setText(modifiedText)
            }
        })
    }
}