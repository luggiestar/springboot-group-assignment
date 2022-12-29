package com.example.project2.programme;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgrammeService {
    private final ProgrammeRepository programmeRepository;

    public ProgrammeService(ProgrammeRepository programmeRepository) {
        this.programmeRepository = programmeRepository;
    }

    public List<Programme> getProgramme() {
        return programmeRepository.findAll();
    }

    public void createNewProgramme(Programme programme) {
        Optional<Programme> checkProgrammeName = programmeRepository.findProgrammeByName(programme.getName());
        if(checkProgrammeName.isPresent()) {
            throw new IllegalStateException("Programme with the given name exist");
        }
        programmeRepository.save(programme);
    }
}
