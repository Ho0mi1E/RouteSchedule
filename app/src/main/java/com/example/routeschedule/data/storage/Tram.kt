package com.example.routeschedule.data.storage

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Tram(
    @PrimaryKey
    val number: String
)