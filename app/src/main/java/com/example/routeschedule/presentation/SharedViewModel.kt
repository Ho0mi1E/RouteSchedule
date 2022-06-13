package com.example.routeschedule.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.routeschedule.data.TransportSchedule

class SharedViewModel: ViewModel() {


    val numberOfBus: LiveData<Int> get() = _numberOfBus
    private val _numberOfBus = MutableLiveData<Int>()

    val numberOfTrolleybus: LiveData<Int> get() = _numberOfTrolleybus
    private val _numberOfTrolleybus = MutableLiveData<Int>()

    val numberOfTram: LiveData<Int> get() = _numberOfTram
    private val _numberOfTram = MutableLiveData<Int>()

    val stops: LiveData<List<String>> get() = _stops
    private val _stops = MutableLiveData<List<String>>()

    val schedule: LiveData<List<String>> get() = _schedule
    private val _schedule = MutableLiveData<List<String>>()


    fun putNumberOfBus(number: Int){
        _numberOfBus.value = number
        _stops.value = TransportSchedule.getBusList(number)
    }

    fun putNumberOfTrolleybus(number: Int){
        _numberOfTrolleybus.value = number
        _stops.value = TransportSchedule.getTrolleyBusList(number)
    }

    fun putNumberOfTram(number: Int){
        _numberOfTram.value = number
        _stops.value = TransportSchedule.getTramList(number)
    }

    fun putSchedule(){
        _schedule.value = TransportSchedule.getSchedule()
    }

}