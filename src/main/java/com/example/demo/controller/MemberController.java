package com.example.demo.controller;

import com.example.demo.domain.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
public class MemberController {

    @GetMapping("/test")
    public ArrayList<Member> memberTest() {
        return new ArrayList(Arrays.asList(
                new Member("ewha", "이대생", "1234"),
                new Member("hello", "공대생", "5678")
        ));
    }
}
