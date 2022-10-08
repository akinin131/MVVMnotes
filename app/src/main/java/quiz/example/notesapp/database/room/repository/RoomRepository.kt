package quiz.example.notesapp.database.room.repository

import androidx.lifecycle.LiveData
import quiz.example.notesapp.database.DatabaseRepository
import quiz.example.notesapp.database.room.dao.NoteRoomDao

import quiz.example.notesapp.model.Note

class RoomRepository(private val Dao:NoteRoomDao): DatabaseRepository {

    override val readAll: LiveData<List<Note>>
        get() = Dao.getAllNotes()

    override suspend fun create(note: Note, onSuccess: () -> Unit) {
        Dao.addNote(note = note)
    }

    override suspend fun update(note: Note, onSuccess: () -> Unit) {
        Dao.updateNote(note = note)
    }

    override suspend fun delete(note: Note, onSuccess: () -> Unit) {
        Dao.deleteNote(note=note)
    }
}