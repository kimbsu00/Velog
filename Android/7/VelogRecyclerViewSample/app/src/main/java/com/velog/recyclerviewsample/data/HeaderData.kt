package com.velog.recyclerviewsample.data

data class HeaderData(
    val headerData: String
) {
    override fun toString(): String {
        return "${javaClass.name}{" +
                "headerData=$headerData}"
    }
}