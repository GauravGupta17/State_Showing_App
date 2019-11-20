package com.example.myapplication2

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
 data class Person( var name:String ="",
                    var college:String ="") : Parcelable





   /* constructor(parcel: Parcel) : this() {
        name = parcel.readString().toString()
        college = parcel.readString().toString()


    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

        parcel.writeString(name)
        parcel.writeString(college)

    }


    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Person> {
        override fun createFromParcel(parcel: Parcel): Person {
            return Person(parcel)
        }

        override fun newArray(size: Int): Array<Person?> {
            return arrayOfNulls(size)
        }
    }*/
