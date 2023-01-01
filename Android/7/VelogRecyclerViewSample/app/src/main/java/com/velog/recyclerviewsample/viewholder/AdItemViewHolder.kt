package com.velog.recyclerviewsample.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.velog.recyclerviewsample.data.AdItemData
import com.velog.recyclerviewsample.databinding.ItemAdBinding

class AdItemViewHolder(
    private val binding: ItemAdBinding
) : RecyclerView.ViewHolder(binding.root) {

    init {
        // 초기화가 필요하다면 여기서 수행
    }

    /**
     * 데이터를 ViewHolder에 적용하는 함수
     */
    fun bindData(pData: AdItemData) {
        binding.apply {
            tvAdItem.text = pData.adData
        }
    }
}