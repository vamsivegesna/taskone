package com.taskone.firstservice.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class UserInput {

  @NotBlank(message = "Filed required.")
  @Size(min = 2)
  private String name;

  @NotNull(message = "Filed required.")
  private String surname;
}
