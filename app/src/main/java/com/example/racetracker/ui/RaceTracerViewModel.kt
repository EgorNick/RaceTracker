package com.example.racetracker.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class RaceTracerViewModel: ViewModel() {
    val playerOne = RaceParticipant(name = "Player 1", progressIncrement = 1)
    val playerTwo = RaceParticipant(name = "Player 2", progressIncrement = 2)

    var raceInProgress by mutableStateOf(false)

}