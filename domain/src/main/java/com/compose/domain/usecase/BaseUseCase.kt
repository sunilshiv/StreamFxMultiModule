package com.compose.domain.usecase

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

abstract class BaseUseCase<in P, R> {
    suspend operator fun invoke(params: P): Result<R> {
        return try {
            Result.success(execute(params))
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    protected abstract suspend fun execute(params: P): R
}