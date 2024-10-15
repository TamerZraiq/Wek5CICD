package ie.atu.week5cicd;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
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
    @Size(max = 13, message ="Title cannot be greater than 13 characters")
    private String title;
    @NotBlank(message = "Employee ID cannot be Blank")
    @Size(max = 13, message ="ID cannot be greater than 13 characters")
    private String id;
    @NotBlank(message = "Position cannot be blank")
    private String position;
    @NotBlank(message = "Department cannot be blank")
    private String department;


}
