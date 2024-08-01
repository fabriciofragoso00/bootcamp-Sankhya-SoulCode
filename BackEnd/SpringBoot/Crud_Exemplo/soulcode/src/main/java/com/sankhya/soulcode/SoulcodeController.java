// https://www.dio.me/articles/ambiente-de-desenvolvimento-java-e-springboot-com-vscode

// https://start.spring.io/

package com.sankhya.soulcode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoulcodeController {
    @GetMapping
    public String hello(){
        return "Hell World";
    }
}
