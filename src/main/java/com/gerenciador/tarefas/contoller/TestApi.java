package com.gerenciador.tarefas.contoller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestApi {

@GetMapping("/test")
    public String test(){
        return "Funcionando";
    }
    @PostMapping("/welcome")
    public String testWelcome(@RequestBody String name){
        System.out.println(name);
        return "Deu certo!";
    }
}
