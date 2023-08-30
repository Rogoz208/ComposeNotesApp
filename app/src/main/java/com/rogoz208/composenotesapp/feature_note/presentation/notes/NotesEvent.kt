package com.rogoz208.composenotesapp.feature_note.presentation.notes

import com.rogoz208.composenotesapp.feature_note.domain.model.Note
import com.rogoz208.composenotesapp.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder) : NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    data object RestoreNote: NotesEvent()
    data object ToggleOrderSection: NotesEvent()
}
