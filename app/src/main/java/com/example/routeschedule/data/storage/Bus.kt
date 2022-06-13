package com.example.routeschedule.data.storage

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Relation

@Entity
data class Bus(
   @PrimaryKey
   val number: String
)