package com.pmwr.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
/*
 * The FileUploadRestController in a Spring Boot application handles file uploads. 
 * It listens for POST requests at /api/upload and takes a file as input. 
 * When a file is uploaded, the method saves it and sends back a message saying the file was successfully uploaded, mentioning the file's name.
 */
@RestController
public class FileUploadRestController {

    @PostMapping("/api/upload")
    public ResponseEntity<String> handleFileUpload(@RequestParam("file") MultipartFile file) {
        // Your logic to handle the file, such as saving it

        String message = "You successfully uploaded " + file.getOriginalFilename() + "!";
        return ResponseEntity.ok().body(message);
    }
}

