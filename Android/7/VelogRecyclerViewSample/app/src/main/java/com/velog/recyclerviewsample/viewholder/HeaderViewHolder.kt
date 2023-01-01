package com.velog.recyclerviewsample.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.velog.recyclerviewsample.data.HeaderData
import com.velog.recyclerviewsample.databinding.ItemHeaderBinding

class HeaderViewHolder(
    private val binding: ItemHeaderBinding
) : RecyclerView.ViewHolder(binding.root) {

    init {
        // 초기화가 필요하다면 여기서 수행
    }

    /**
     * 데이터를 ViewHolder에 적용하는 함수
     */
    fun bindData(pData: HeaderData) {
        binding.apply {
            tvHeaderItem.text = pData.headerData
        }
    }

}