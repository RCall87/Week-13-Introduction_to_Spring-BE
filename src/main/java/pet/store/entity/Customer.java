package pet.store.entity;
import javax.persistence.*;
import java.util.Set; // Import Set from java.util
import lombok.*;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;

    // Define relationships as instructed
    @ManyToMany(mappedBy = "customers", cascade = CascadeType.PERSIST)
    private Set<PetStore> petStores;

    // Constructors, getters, setters, and any other methods you need
}
