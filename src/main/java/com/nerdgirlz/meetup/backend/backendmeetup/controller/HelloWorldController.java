package com.nerdgirlz.meetup.backend.backendmeetup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("/hello-nerdgirlz")
  public String helloWorld() {
    return "Hello meetup 35 desenvolvimento back end";
  }

}
