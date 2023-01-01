package com.velog.recyclerviewsample.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.velog.recyclerviewsample.data.SmallItemData
import com.velog.recyclerviewsample.databinding.ItemSmallBinding

class SmallItemViewHolder(
    private val binding: ItemSmallBinding
) : RecyclerView.ViewHolder(binding.root) {

    init {
        // 초기화가 필요하다면 여기서 수행
    }

    /**
     * 데이터를 ViewHolder에 적용하는 함수
     */
    fun bindData(pData: SmallItemData) {
        binding.apply {
            tvSmallItem.text = pData.smallData
        }
    }

}