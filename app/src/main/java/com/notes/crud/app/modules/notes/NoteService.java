package com.notes.crud.app.modules.notes;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {
  @Autowired
  private NoteRepository noteRepository;

  public NoteModel createOne(NoteModel note) {
    return noteRepository.save(note);
  }

  public Optional<NoteModel> findOne(Long id) {
    return noteRepository.findById(id);
  }

  public ArrayList<NoteModel> findAll() {
    return (ArrayList<NoteModel>) noteRepository.findAll();
  }

  public boolean deleteOne(Long id) {
    try {
      noteRepository.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
