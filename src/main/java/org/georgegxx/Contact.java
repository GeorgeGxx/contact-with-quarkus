package org.georgegxx;

import jakarta.persistence.*;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Pattern;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

    @Id
    @GeneratedValue
    public Long id;

//    @NotBlank
    @Pattern(
            regexp = "^[A-Za-zÁÉÍÓÚáéíóúÑñ.'\\- ]+$",
            message = "Nombre inválido (solo letras, espacios, puntos o guiones)"
    )
    @Column
    public String name;

//    @NotBlank(message = "Correo obligatorio")
//    @Email(message = "Correo inválido")
//    @Size(max = 100, message = "Máximo 100 caracteres")
//    @Pattern(
//        regexp = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$",
//        message = "Correo electrónico no válido"
//    )
    @Column
    public String email;
    public boolean dataProtection;

}
