package com.example.encryptapp.controller;



import com.example.encryptapp.model.TextRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class EncryptDecryptController {

    private static final String KEY = "Reddy";

    @PostMapping("/encrypt")
    public String encrypt(@RequestBody TextRequest request) {
        return xorOperation(request.getText(), KEY);
    }

    @PostMapping("/decrypt")
    public String decrypt(@RequestBody TextRequest request) {
        return xorOperation(request.getText(), KEY);
    }

    private String xorOperation(String input, String key) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            result.append((char)(input.charAt(i) ^ key.charAt(i % key.length())));
        }
        return result.toString();
    }
}
