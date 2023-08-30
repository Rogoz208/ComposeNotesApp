package com.rogoz208.composenotesapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.rogoz208.composenotesapp.ui.theme.BabyBlue
import com.rogoz208.composenotesapp.ui.theme.LightGreen
import com.rogoz208.composenotesapp.ui.theme.RedOrange
import com.rogoz208.composenotesapp.ui.theme.RedPink
import com.rogoz208.composenotesapp.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)
