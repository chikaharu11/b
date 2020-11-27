package com.example.segare_menu

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatSpinner


class CSpinner(context: Context?, attrs: AttributeSet?) :
    AppCompatSpinner(context!!, attrs) {
    private var lastPosition = 0
    override fun setSelection(position: Int) {
        super.setSelection(position)
        val sameSelected = lastPosition == selectedItemPosition
        val onItemSelectedListener = onItemSelectedListener
        if (sameSelected && onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(this, selectedView, position, selectedItemId)
        }
        lastPosition = position
    }
}

class CSpinner2(context: Context?, attrs: AttributeSet?) :
    AppCompatSpinner(context!!, attrs) {
    private var lastPosition = 0
    override fun setSelection(position: Int) {
        super.setSelection(position)
        val sameSelected = lastPosition == selectedItemPosition
        val onItemSelectedListener = onItemSelectedListener
        if (sameSelected && onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(this, selectedView, position, selectedItemId)
        }
        lastPosition = position
    }
}

class CSpinner3(context: Context?, attrs: AttributeSet?) :
    AppCompatSpinner(context!!, attrs) {
    private var lastPosition = 0
    override fun setSelection(position: Int) {
        super.setSelection(position)
        val sameSelected = lastPosition == selectedItemPosition
        val onItemSelectedListener = onItemSelectedListener
        if (sameSelected && onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(this, selectedView, position, selectedItemId)
        }
        lastPosition = position
    }
}

class CSpinner4(context: Context?, attrs: AttributeSet?) :
    AppCompatSpinner(context!!, attrs) {
    private var lastPosition = 0
    override fun setSelection(position: Int) {
        super.setSelection(position)
        val sameSelected = lastPosition == selectedItemPosition
        val onItemSelectedListener = onItemSelectedListener
        if (sameSelected && onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(this, selectedView, position, selectedItemId)
        }
        lastPosition = position
    }
}