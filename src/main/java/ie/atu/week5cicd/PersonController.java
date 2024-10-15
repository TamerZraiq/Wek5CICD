package ie.atu.week5cicd;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class PersonController {
    List<Person>personList = new ArrayList<>();
    @GetMapping
    public List<Person> getPerson() {
        return personList;
    }
    @PostMapping("/createPerson")
    public List<Person> addPerson(@Valid @RequestBody Person person) {
        personList.add(person);
        return personList;
    }
}
