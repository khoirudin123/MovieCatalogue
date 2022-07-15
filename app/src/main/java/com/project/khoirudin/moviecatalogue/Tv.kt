package com.project.khoirudin.moviecatalogue

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Tv(
    @SerializedName("id")
    val id : String ?,

    @SerializedName("name")
    val name : String?,

    @SerializedName("poster_path")
    val poster : String?,

    @SerializedName("first_air_date")
    val date : String?,

    @SerializedName("overview")
    val overview : String?,

    @SerializedName("original_language")
    val originallanguage : String?,

    @SerializedName("popularity")
    val popularity : String?,



    ) : Parcelable {
    constructor() : this("", "", "", "","","","",)
}
