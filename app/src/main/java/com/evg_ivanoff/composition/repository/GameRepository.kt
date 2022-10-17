package com.evg_ivanoff.composition.repository

import com.evg_ivanoff.composition.domain.entity.GameSettings
import com.evg_ivanoff.composition.domain.entity.Level
import com.evg_ivanoff.composition.domain.entity.Question

interface GameRepository {
    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}