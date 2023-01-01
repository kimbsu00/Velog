package com.velog.recyclerviewsample.data

data class FooterData(
    val footerData: String
) {
    override fun toString(): String {
        return "${javaClass.name}{" +
                "footerData=$footerData}"
    }
}