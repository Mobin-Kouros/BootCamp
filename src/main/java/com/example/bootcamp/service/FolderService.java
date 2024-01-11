package com.example.bootcamp.service;

import com.example.bootcamp.entity.Folder;
import com.example.bootcamp.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class FolderService {

    @Autowired
    private FolderRepository repository;

    public void createDirectory(Folder folder){
        File file = new File(folder.getFilePath() == null ? "/path/" : "/path/" + folder.getFilePath());
        file.mkdir();
        repository.save(folder);
    }
}
