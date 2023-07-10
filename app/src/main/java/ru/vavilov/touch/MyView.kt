package ru.vavilov.touch

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MotionEvent
import android.widget.FrameLayout
import androidx.annotation.AttrRes
import ru.vavilov.touch.databinding.MyViewLayoutBinding

class MyView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    @AttrRes defStyleAttr: Int = 0,
) : FrameLayout(context, attrs, defStyleAttr) {

    private val viewBinding: MyViewLayoutBinding by lazy {
        MyViewLayoutBinding.inflate(LayoutInflater.from(context), this, true)
    }

    init {
        viewBinding
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        return if (event?.actionMasked == MotionEvent.ACTION_DOWN || event?.actionMasked == MotionEvent.ACTION_MOVE) {
            viewBinding.myText.text = "Clicked!"
            true
        } else {
            viewBinding.myText.text = "Click me!"
            false
        }
    }
}