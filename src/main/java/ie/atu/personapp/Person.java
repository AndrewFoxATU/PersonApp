package ie.atu.personapp;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @NotBlank(message = "You must enter a name")
    private String name;
    //
    @NotBlank(message = "You must enter a title")
    private String title;
    //
    @Min(value=1, message=" ID must be greater or equal to 1")
    private int id;
    //
    @Min(value=0, message="Age must be greater or equal to 0")
    private int age;
    //
    @Email(message = "Email is not valid")
    private String email;
    //
    @NotBlank(message = "You must enter a position")
    private String position;
    //
    @NotBlank(message = "You must enter a department")
    private String department;

}
