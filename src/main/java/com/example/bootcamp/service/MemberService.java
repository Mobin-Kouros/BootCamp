package com.example.bootcamp.service;

import com.example.bootcamp.dto.MemberDto;
import com.example.bootcamp.entity.Member;
import com.example.bootcamp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MemberService {

    @Autowired
    private MemberRepository repository;

    @Transactional
    public MemberDto addMember(MemberDto dto){
        dto =  Member.convert(repository.save(MemberDto.convert(dto)));
        return dto;
    }

    @Transactional
    public void deleteMember(Long id){
        repository.deleteById(id);
    }

    @Transactional
    public Member updateMember(MemberDto dto){
        return repository.save(dto.convert(dto));
    }

    public Member findById(Long id){
        return repository.findById(id).get();
    }
}

