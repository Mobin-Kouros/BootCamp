package com.example.bootcamp.api;

import com.example.bootcamp.dto.MemberDto;
import com.example.bootcamp.entity.Member;
import com.example.bootcamp.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/member/")
public class MemberApi {

    @Autowired
    private MemberService service;

    @GetMapping("find_by_id/{id}")
    public Member findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping("add_member")
    public MemberDto addMember(@RequestBody MemberDto dto){
        return service.addMember(dto);
    }

    @DeleteMapping("delete_member/{id}")
    public void deleteMember(@PathVariable Long id){
        service.deleteMember(id);
    }

    @PutMapping("update_member")
    public Member updateMember(@RequestBody MemberDto dto){
        return service.updateMember(dto);
    }

}
