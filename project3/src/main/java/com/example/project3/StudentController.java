package com.example.project3;


        import java.util.*;

        import org.springframework.beans.factory.annotation.*;
        import org.springframework.http.*;

        import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    // RESTful API methods for Retrieval operations

    @GetMapping("/students")
    public List<Student> list() {
        return service.listAll();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> get(@PathVariable Integer id) {
        try {
            Student product = service.get(id);
            return new ResponseEntity<Student>(product, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
    }
    // RESTful API method for Create operation

    @PostMapping("/post")
    public void add(@RequestBody Student product) {
        service.save(product);
    }

    // RESTful API method for Update operation

    @PutMapping("put/{id}")
    public ResponseEntity<?> update(@RequestBody Student product, @PathVariable Integer id) {
        try {
            Student existProduct = service.get(id);
            service.save(product);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // RESTful API method for Delete operation
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}