package com.example.firstproject.controller;

// 컨트롤러 선언과 동시에 자동으로 임포트
import org.springframework.stereotype.Controller;
// Model 패키지 자동 임포트
import org.springframework.ui.Model;
// URL 연결 요청(@GetMapping)과 동시에 자동으로 임포트
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 컨트롤러 선언
public class FirstController {

    @GetMapping("/hi") // URL 요청 접수
    public String niceToMeetYou(Model model) { // 메서드 작성
        model.addAttribute("username", "hongpark");
        return "greetings"; // greeding.mustache 파일 반환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "홍길동");
        return "goodbye"; // goodbye.mustache 반환
    }
}
