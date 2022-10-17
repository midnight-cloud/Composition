package com.evg_ivanoff.composition.domain.entity.usecases

import com.evg_ivanoff.composition.domain.entity.Question
import com.evg_ivanoff.composition.domain.entity.repository.gameRepository

class GenerateQuestionUseCase(
    private val repository: gameRepository
) {

    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}