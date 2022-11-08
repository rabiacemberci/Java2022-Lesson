package kodlama.io.rentACar.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="brands")
@Data  // setter getter
@AllArgsConstructor //parametreli
@NoArgsConstructor //parametresizler
@Entity
public class Brand {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id siotomatik artan
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
}
