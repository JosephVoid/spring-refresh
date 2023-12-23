package com.warmup.warmup.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.function.client.WebClient;

import com.warmup.warmup.models.Task;
import com.warmup.warmup.models.TaskRepository;

@Controller // This tells spring that it is a controller
@RequestMapping(path = "/task") // This class handles request starting with /demo
public class MainController {
    class ForBody {
        public String name;
        ForBody(String n) {
            this.name = n;
        }
    }
    
    @Autowired // Get the auto generated repository (means interface for the model, like an ORM)
    private TaskRepository taskRepository;

    @PostMapping("/add" )
    public @ResponseBody String addNewTask (@RequestParam String task) {
        Task t = new Task();
        t.setTask(task);
        taskRepository.save(t);
        return "Added";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping(path = "/api")
    public @ResponseBody String reqAPI() {
        WebClient.Builder builder = WebClient.builder();

        //For a GET request
        String PokeList = builder.build()
            .get()
            .uri("https://pokeapi.co/api/v2/pokemon/")
            .retrieve()
            .bodyToMono(String.class)
            .block();
        
        // For a POST request
        // String response = builder.build()
        //     .post()
        //     .uri("http://localhost:8081/task/add", QueryBuilder -> QueryBuilder.query(null).queryParam("task", "WebClient").build())
        //     .header("Accept", "application/json, text/plain, */*")
        //     .bodyValue(new ForBody("Test"))
        //     .retrieve()
        //     .bodyToMono(String.class)
        //     .block();
            

        return PokeList;
    }
}
