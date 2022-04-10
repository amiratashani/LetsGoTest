package com.example.letsgotest.game.model


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class GameUnitTests {

    @Test
    fun whenIncrementingScore_shouldIncrementCurrentScore() {
        val game = Game()
        game.incrementScore()
        assertThat(game.currentScore).isEqualTo(1)
    }

    @Test
    fun whenIncrementingScore_aboveHighScore_shouldAlsoIncrementHighScore() {
        val game = Game()
        game.incrementScore()
        assertThat(game.highestScore).isEqualTo(1)
    }

    @Test
    fun whenIncrementingScore_belowHighScore_shouldNotIncrementHighScore() {
        val game = Game(10)
        game.incrementScore()
        assertThat(game.highestScore).isEqualTo(10)
    }
}