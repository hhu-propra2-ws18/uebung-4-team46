package de.hhu.propra.db.data;

import de.hhu.propra.db.entities.Kunde;
import org.springframework.data.repository.CrudRepository;

import java.awt.*;
import java.util.List;

public interface KundeRepository extends CrudRepository<Kunde, Long> {
    List<Kunde> findKundeByAutos_Farbe(String farbe);
}
