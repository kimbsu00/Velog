package com.velog.recyclerviewsample.data

data class AdItemData(
    val adData: String
) {
    override fun toString(): String {
        return "${javaClass.name}{" +
                "adData=$adData}"
    }
}