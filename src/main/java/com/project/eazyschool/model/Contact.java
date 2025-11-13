package com.project.eazyschool.model;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NonNull;

@Data
public class Contact {
    @NotBlank(message = "The feild should not be blank!!")
    @Size(min = 3)
    private String name;
    @NotBlank(message = "The feild should not be blank!!")
    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    private String mobileNum;
    @NotBlank(message = "The feild should not be blank!!")
    @Email(message = "Please enter a valid emial!!!")
    private String email;
    @NotBlank(message = "The feild should not be blank!!")
    @Size(min = 3, message = "Message must be atleast 3 character long.")
    private String message;
    @NotBlank(message = "The feild should not be blank!!")
    @Size(min = 5, message="Size must be atleast 5 character long.")
    private String subject;
}
