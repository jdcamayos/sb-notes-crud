package com.notes.crud.app.modules.notes;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notes")
public class NoteController {
  @Autowired
  NoteService noteService;

  @GetMapping()
  public ArrayList<NoteModel> findAll() {
    return noteService.findAll();
  }

  @PostMapping()
  public NoteModel create(@RequestBody NoteModel note) {
    return this.noteService.createOne(note);
  }

  @GetMapping(path = "/{id}")
  public Optional<NoteModel> findOne(@PathVariable("id") Long id) {
    return this.noteService.findOne(id);
  }

  @DeleteMapping(path = "/{id}")
  public Boolean delete(@PathVariable("id") Long id) {
    return this.noteService.deleteOne(id);
  }
  
}
