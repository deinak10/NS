package com.example.demo.Form;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UserForm {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;

}
