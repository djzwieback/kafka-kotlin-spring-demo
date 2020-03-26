package risc.exxeta.com.helloworld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/hello")
    fun getHello(@RequestParam name: String): String {
        return "Hello World $name"
    }
}
