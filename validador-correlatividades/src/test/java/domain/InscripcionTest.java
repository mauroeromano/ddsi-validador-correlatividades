package domain;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    @Test
    void aprobada() {
        Materia ads = new Materia("ads", List.of());
        Materia adc = new Materia("adc", List.of());
        Materia pdp = new Materia("pdp", List.of(ads));
        Materia ddsi = new Materia("ddsi", List.of(pdp, ads));
        Materia ssoo = new Materia("ssoo", List.of(adc));

        Alumno mauro = new Alumno("Mauro", "Romano", 1616523, List.of(pdp, ads));

        Inscripcion alternativa1 = new Inscripcion(mauro, List.of(ddsi));
        assertTrue(alternativa1.aprobada());

        Inscripcion alternativa2 = new Inscripcion(mauro, List.of(ddsi, ssoo));
        assertFalse(alternativa2.aprobada());
    }
}