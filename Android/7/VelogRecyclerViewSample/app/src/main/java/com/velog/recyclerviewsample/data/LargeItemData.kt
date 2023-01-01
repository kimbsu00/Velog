package com.velog.recyclerviewsample.data

data class LargeItemData(
    val largeData: String
) {
    override fun toString(): String {
        return "${javaClass.name}{" +
                "largeData=$largeData}"
    }
}