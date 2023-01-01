package com.velog.recyclerviewsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.velog.recyclerviewsample.adapter.CustomAdapter
import com.velog.recyclerviewsample.data.*
import com.velog.recyclerviewsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val mItems: ArrayList<ListDataWrapper> = arrayListOf()
    private lateinit var mAdapter: CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        initSampleData()

        mAdapter = CustomAdapter(mItems)
        binding.apply {
            rvMain.layoutManager =
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
            rvMain.itemAnimator = null
            rvMain.adapter = mAdapter
        }
    }

    private fun initSampleData() {
        mItems.add(
            ListDataWrapper(
                ListDataType.TYPE_HEADER,
                HeaderData("Header Type ViewHolder")
            )
        )

        val range = IntRange(0, 1)
        for (idx in 0 until 100) {
            if (idx.mod(20) == 0) {
                mItems.add(
                    ListDataWrapper(
                        ListDataType.TYPE_AD_ITEM,
                        AdItemData(
                            "다코 라이프 일주일이면 내 취향 완벽 분석!\n" +
                                    "맛집이 넘치는 세상, 다이닝코드의 빅데이터 기술로 내 취향에 맞는 맛집만을 쏙쏙 뽑아 보여드립니다.\n" +
                                    "빅데이터 맛집 검색은 다이닝코드로"
                        )
                    )
                )
            }

            when (range.random()) {
                0 -> {
                    mItems.add(
                        ListDataWrapper(
                            ListDataType.TYPE_SMALL_ITEM,
                            SmallItemData("Small Type ViewHolder")
                        )
                    )
                }
                1 -> {
                    mItems.add(
                        ListDataWrapper(
                            ListDataType.TYPE_LARGE_ITEM,
                            LargeItemData("Large Type ViewHolder")
                        )
                    )
                }
            }
        }

        mItems.add(
            ListDataWrapper(
                ListDataType.TYPE_FOOTER,
                FooterData("Footer Type ViewHolder")
            )
        )
    }

}