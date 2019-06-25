package src;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "factuur_regel")
public class FactuurRegel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "factuur_regel_id", unique = true, nullable = false)
    private Long id;

    // 1 factuur kan 1 meerdere factuurregels bevatten
    @OneToOne
    private Factuur factuur;

    @Embedded
    private Artikel artikel;

    public FactuurRegel() {}

    public FactuurRegel(Factuur factuur, Artikel artikel) {
        this.factuur = factuur;
        this.artikel = artikel;
    }

    /**
     *
     * @return  String   een printbare factuurregel
     */
    @Override
    public String toString() {
        return "FactuurRegel: " +
                "id=" + id +
                ", factuur=" + factuur +
                ", artikel=" + artikel;
    }

}
