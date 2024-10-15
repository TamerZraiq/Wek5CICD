package ie.atu.week5cicd;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be Blank")
    private String name;

    @Email(message = "Invalid email Address")
    private String email;

    @Min(value = 1, message = "Age must be greater than or equal to 1")
    private int age;

    @NotBlank(message = "Title cannot be Blank")
    private String title;

    @NotNull(message ="ID cannot be greater than 15 characters")
    private int id;

    @NotBlank(message = "Position cannot be blank")
    private String position;

    @NotBlank(message = "Department cannot be blank")
    private String department;


}
