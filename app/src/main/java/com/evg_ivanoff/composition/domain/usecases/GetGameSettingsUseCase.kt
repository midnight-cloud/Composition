package com.evg_ivanoff.composition.domain.usecases

import com.evg_ivanoff.composition.domain.entity.GameSettings
import com.evg_ivanoff.composition.domain.entity.Level
import com.evg_ivanoff.composition.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}