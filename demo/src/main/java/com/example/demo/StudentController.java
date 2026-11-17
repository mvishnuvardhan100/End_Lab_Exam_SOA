
package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.Map;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudent(@PathVariable int id) {

        if (id == 101) {
            return ResponseEntity.ok(
                    Map.of(
                            "id", 101,
                            "name", "Vishnu",
                            "branch", "CSE"
                    )
            );
        }

        return ResponseEntity.status(404)
                .body(Map.of("message", "Student not found"));
    }
}
