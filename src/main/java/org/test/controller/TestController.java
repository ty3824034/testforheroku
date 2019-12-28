package org.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

@GetMapping("")
public String msg()
{
  return "Hello";	
}
@GetMapping("/show")
public String msg1()
{
  return "Hello";	
}
}
