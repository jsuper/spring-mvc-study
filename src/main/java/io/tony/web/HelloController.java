package io.tony.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/greeting")
public class HelloController {

  @RequestMapping("/sayHi/to/{name}")
  @ResponseBody
  public String sayHello(@PathVariable String name) {
    return "Hello, "+name;
  }
}
