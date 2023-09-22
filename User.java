package com.geekster.usermanagement.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotBlank
    private Integer userId;
    @NotBlank
    private String Name;
    @NotBlank
    private String userName;
    @NotBlank
    private String address;
    @Size(min=10,max=10)
    @Pattern(regexp ="^[0-9]+$" , message ="contact should be just numbers!!")
    private String number;
}
