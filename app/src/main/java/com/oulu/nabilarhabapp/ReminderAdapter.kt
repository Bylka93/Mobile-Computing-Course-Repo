package com.oulu.nabilarhabapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.list_view_item.view.*

class ReminderAdapter(contex:Context,private  val list: Array<String>): BaseAdapter() {
    private val inflater: LayoutInflater =contex.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
            as LayoutInflater
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val row=inflater.inflate(R.layout.list_view_item, parent, false)
        row.ItemMessage.text=list[position]
        row.ItemTrigger.text="Hello"
        return  row
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size
    }
}