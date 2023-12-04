package net.internalerror.springtesting;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class PingController {

  @GetMapping(value = "/ping", produces = MediaType.APPLICATION_JSON_VALUE)
  public String ping() {
    return "pong";
  }

  @GetMapping(value = "/pong", produces = MediaType.APPLICATION_JSON_VALUE)
  public String pong() {
    return "ping";
  }

}
