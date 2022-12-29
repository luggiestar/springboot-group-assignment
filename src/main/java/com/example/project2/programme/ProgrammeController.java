package com.example.project2.programme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/programme")
public class ProgrammeController {
    private final ProgrammeService programmeService;

    @Autowired
    public ProgrammeController(ProgrammeService programmeService) {
        this.programmeService = programmeService;
    }

    @GetMapping
    public List<Programme> getProgramme() {
        return programmeService.getProgramme();
    }

    @PostMapping
    public void createNewProgramme(Programme programme) {
        programmeService.createNewProgramme(programme);
    }
}
