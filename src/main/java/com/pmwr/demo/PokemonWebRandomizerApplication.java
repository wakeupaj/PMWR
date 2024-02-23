package com.pmwr.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class PokemonWebRandomizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonWebRandomizerApplication.class, args);
	}
	@GetMapping("/")
    public String displayUploadForm() {
        return "upload"; // This refers to upload.html in the templates directory
    }
}
