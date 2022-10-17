package com.evg_ivanoff.composition.domain.entity.usecases

import com.evg_ivanoff.composition.domain.entity.GameSettings
import com.evg_ivanoff.composition.domain.entity.Level
import com.evg_ivanoff.composition.domain.entity.repository.gameRepository

class GetGameSettingsUseCase(private val repository: gameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}