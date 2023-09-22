package com.notes.crud.app.modules.notes;

import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<NoteModel, Long> {

}
