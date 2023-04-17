package co.develhope.firstapi1.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/{name}")
    public String getName (@PathVariable String name){
        return "Name: " + name;
    }

    @PostMapping("/{name}")
    public String ReversedName (@PathVariable String name) {
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.reverse();
        return "Reversed name: " + stringBuilder;
    }
}
