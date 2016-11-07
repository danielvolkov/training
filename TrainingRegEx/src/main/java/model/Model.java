package model;

import model.entity.Note;

import java.util.ArrayList;

/**
 * Model class
 * Created by daniel.volkov on 05/11/16.
 */
public class Model {
    private ArrayList<Note> noteBook = new ArrayList<Note>();
    public ArrayList<Note> getNoteBook() {
        return noteBook;
    }

    /**
     * this method add entity into model noteBook
     * @param note
     */
    public void addNote(Note note) {
        noteBook.add(note);
    }
}
