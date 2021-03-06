package com.example.recyclerviewtest

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var items: ArrayList<MyData>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class ViewHolderTypeA(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView

        init {
            textView = itemView.findViewById(R.id.textView)
        }
    }

    inner class ViewHolderTypeB(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView

        init {
            textView = itemView.findViewById(R.id.textView)
        }
    }

    inner class ViewHolderTypeC(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView

        init {
            textView = itemView.findViewById(R.id.textView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            MyData.TYPE_A -> {
                ViewHolderTypeA(
                    LayoutInflater.from(parent.context).inflate(R.layout.item_type_a, parent, false)
                )
            }
            MyData.TYPE_B -> {
                ViewHolderTypeB(
                    LayoutInflater.from(parent.context).inflate(R.layout.item_type_b, parent, false)
                )
            }
            MyData.TYPE_C -> {
                ViewHolderTypeC(
                    LayoutInflater.from(parent.context).inflate(R.layout.item_type_c, parent, false)
                )
            }
            else -> {
                Log.i("MyAdapter", "Unrecognized viewType = $viewType")
                ViewHolderTypeA(
                    LayoutInflater.from(parent.context).inflate(R.layout.item_type_a, parent, false)
                )
            }
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            MyData.TYPE_A -> {
                // ??? ????????? view??? ???????????? ???????????? ????????? ?????????.
            }
            MyData.TYPE_B -> {
                // ??? ????????? view??? ???????????? ???????????? ????????? ?????????.
            }
            MyData.TYPE_C -> {
                // ??? ????????? view??? ???????????? ???????????? ????????? ?????????.
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].type
    }
}
