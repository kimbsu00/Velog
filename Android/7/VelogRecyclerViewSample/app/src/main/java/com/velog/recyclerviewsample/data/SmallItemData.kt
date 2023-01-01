package com.velog.recyclerviewsample.data

data class SmallItemData(
    val smallData: String
) {
    override fun toString(): String {
        return "${javaClass.name}{" +
                "smallData=$smallData}"
    }
}