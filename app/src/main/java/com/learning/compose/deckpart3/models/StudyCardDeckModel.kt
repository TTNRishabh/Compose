package com.learning.compose.deckpart3.models

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import com.learning.compose.common.*
import com.learning.compose.deckpart3.StudyCard

data class StudyCardDeckModel(
    var current: Int,
    val dataSource: List<StudyCard>,
    val visible: Int = 3,
    val screenWidth: Int,
    val screenHeight: Int
) {
    private val colors = arrayOf(primaryColor, secondaryColor, tertiaryColor)
    val count = dataSource.size
    val visibleCards: Int = StrictMath.min(visible, dataSource.size - current)

    fun cardVisible(visibleIndex: Int) = dataSource[dataSourceIndex(visibleIndex)]

    private fun dataSourceIndex(visibleIndex: Int): Int {
        return current + visibleIndex
    }

    fun colorForIndex(visibleIndex: Int): Color {
        val index = dataSourceIndex(visibleIndex)
        val colorIndex = index % colors.size
        return colors[colorIndex]
    }

    @Composable
    fun cardWidthPx(): Float {
        return with(LocalDensity.current) { cardWidth.toPx() }
    }

    @Composable
    fun cardHeightPx(): Float {
        return with(LocalDensity.current) { cardHeight.toPx() }
    }
}