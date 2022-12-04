package co.edu.iudigital.helpmeuid.model;

import static lombok.AccessLevel.PRIVATE;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity // convierte en una entidad de Hibernate
@Table(name = "roles")
@Getter
@Setter
@FieldDefaults(level = PRIVATE) // coloca los campos como privados
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "nombre", length = 45, nullable = false)
    String nombre;

    String descripcion;

    // bidireccional
    @ManyToMany(mappedBy = "roles") // opcional
    List<Usuario> usuarios;
}
