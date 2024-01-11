package com.example.bootcamp.api;

import com.example.bootcamp.entity.Folder;
import com.example.bootcamp.service.FolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class FolderApi {

    @Autowired
    private FolderService folderService;

    @PostMapping("/create")
    public void createFolder(@RequestBody Folder folder){
        folderService.createDirectory(folder);
    }
}
