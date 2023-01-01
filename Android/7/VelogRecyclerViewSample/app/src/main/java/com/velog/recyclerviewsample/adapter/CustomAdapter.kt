package com.velog.recyclerviewsample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.velog.recyclerviewsample.R
import com.velog.recyclerviewsample.data.*
import com.velog.recyclerviewsample.databinding.*
import com.velog.recyclerviewsample.viewholder.*

class CustomAdapter(
    private val items: ArrayList<ListDataWrapper>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            R.layout.item_header -> {
                HeaderViewHolder(
                    ItemHeaderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                )
            }
            R.layout.item_small -> {
                SmallItemViewHolder(
                    ItemSmallBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                )
            }
            R.layout.item_large -> {
                LargeItemViewHolder(
                    ItemLargeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                )
            }
            R.layout.item_ad -> {
                AdItemViewHolder(
                    ItemAdBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                )
            }
            R.layout.item_footer -> {
                FooterViewHolder(
                    ItemFooterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                )
            }
            else -> {
                FooterViewHolder(
                    ItemFooterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                )
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder.itemViewType) {
            R.layout.item_header -> {
                val data = items[position].data as HeaderData
                (holder as HeaderViewHolder).bindData(data)
            }
            R.layout.item_small -> {
                val data = items[position].data as SmallItemData
                (holder as SmallItemViewHolder).bindData(data)
            }
            R.layout.item_large -> {
                val data = items[position].data as LargeItemData
                (holder as LargeItemViewHolder).bindData(data)
            }
            R.layout.item_ad -> {
                val data = items[position].data as AdItemData
                (holder as AdItemViewHolder).bindData(data)
            }
            R.layout.item_footer -> {
                val data = items[position].data as FooterData
                (holder as FooterViewHolder).bindData(data)
            }
        }
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int) = when (items[position].type) {
        ListDataType.TYPE_HEADER -> R.layout.item_header
        ListDataType.TYPE_SMALL_ITEM -> R.layout.item_small
        ListDataType.TYPE_LARGE_ITEM -> R.layout.item_large
        ListDataType.TYPE_AD_ITEM -> R.layout.item_ad
        ListDataType.TYPE_FOOTER -> R.layout.item_footer
    }

}