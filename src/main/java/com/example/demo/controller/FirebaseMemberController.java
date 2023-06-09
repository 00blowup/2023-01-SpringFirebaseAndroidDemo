package com.example.demo.controller;

import com.example.demo.domain.Member;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api")
public class FirebaseMemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/members")
    public String saveMember(@RequestBody Member member) throws ExecutionException {
        return memberService.saveMember(member);
    }
}
