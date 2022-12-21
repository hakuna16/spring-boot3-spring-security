package com.rituj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {

  @GetMapping(value = "/hello")
  public String helloWorld() {
    return "Hello From Spring boot 3";
  }

  @GetMapping(value = "/good-bye")
  public String helloWorldEnd() {
    return "Good bye From Spring boot 3 ";
  }
}
