package com.example.bootcamp.repository;

import com.example.bootcamp.entity.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {

}
