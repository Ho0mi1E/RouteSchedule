package com.example.routeschedule.data.storage

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TrolleybusBus(
    @PrimaryKey
    val number: String
)
