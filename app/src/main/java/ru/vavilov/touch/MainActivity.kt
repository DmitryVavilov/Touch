package ru.vavilov.touch

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.vavilov.touch.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private val viewBinding: MainActivityBinding by lazy {
        MainActivityBinding.inflate(layoutInflater)
    }

    private var clickCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        viewBinding.root.setOnTouchListener { _, event ->
            clickCount++
            viewBinding.textCounter.text = clickCount.toString()
            false
        }
    }
}