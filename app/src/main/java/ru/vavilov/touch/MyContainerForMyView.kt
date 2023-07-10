package ru.vavilov.touch

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MotionEvent
import android.widget.LinearLayout
import androidx.annotation.AttrRes
import ru.vavilov.touch.databinding.MyContainerForMyViewLayoutBinding

/**
 * @author ext.dvavilov
 */
class MyContainerForMyView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    @AttrRes defStyleAttr: Int = 0,
) : LinearLayout(context, attrs, defStyleAttr) {

    private val viewBinding: MyContainerForMyViewLayoutBinding by lazy {
        MyContainerForMyViewLayoutBinding.inflate(LayoutInflater.from(context), this, true)
    }

    init {
        viewBinding
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        return ev?.actionMasked != MotionEvent.ACTION_DOWN && ev?.actionMasked != MotionEvent.ACTION_MOVE
    }
}
