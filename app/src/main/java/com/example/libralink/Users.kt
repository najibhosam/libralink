package com.example.libralink

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Users_table")
data class Users(
    @PrimaryKey(autoGenerate = true) val id : Int?,
    @ColumnInfo(name = "first_name") val first_name : String?,
    @ColumnInfo(name = "last_name")val last_name : String?
)
