package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView


class FontSizeAdapter(_context: Context, _sizes: Array<Int>) :  BaseAdapter() {
    private val context = _context
    private val fontSizes = _sizes

    override fun getCount() = fontSizes.size

    override fun getItem(p0: Int) = fontSizes[p0]

    override fun getItemId(p0: Int) = p0.toLong()

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        return (getDropDownView(p0, p1, p2) as TextView).apply {
            textSize = 24f
        }
    }
    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView
        if(convertView == null){
            textView = TextView(context)
        }else{
            textView = convertView as TextView
        }
        textView.text = fontSizes[position].toString()
        textView.textSize = fontSizes[position].toFloat()
        return textView
    }
}

