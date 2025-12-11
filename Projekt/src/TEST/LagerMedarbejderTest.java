package TEST;

import Model.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LagerMedarbejderTest {
    // nogle hjælpemetoder 
    private LagerMedarbejder createLagerMedarbejder() {
        return new LagerMedarbejder("M1", "Test Medarbejder");
    }

    private Paafyldning createPaafyldning(LagerMedarbejder medarbejder, String destillatId) {
        Destillat destillat = new Destillat(
                destillatId,
                "NM-01",
                100.0,
                63.5
        );

        Fad fad = new Fad(
                "F1",
                200.0,
                "Oak",
                "Bourbon",
                "ledig",
                null
        );

        return new Paafyldning(
                "P-" + destillatId,
                50.0,
                63.0,
                LocalDate.of(2025, 1, 1),
                medarbejder,
                fad,
                destillat
        );
    }

    @Test
    void testGetAntalPaafyldninger() {
        LagerMedarbejder medarbejder = createLagerMedarbejder();

        // EC1
        assertEquals(0, medarbejder.getAntalPaafyldninger());

        // EC2
        medarbejder.addPaafyldning(createPaafyldning(medarbejder, "D1"));
        assertEquals(1, medarbejder.getAntalPaafyldninger());

        // EC3
        medarbejder.addPaafyldning(createPaafyldning(medarbejder, "D2"));
        medarbejder.addPaafyldning(createPaafyldning(medarbejder, "D3"));
        assertEquals(3, medarbejder.getAntalPaafyldninger());
    }

    @Test
    void testGetPaafyldningerReturnsCopy() {
        LagerMedarbejder medarbejder = createLagerMedarbejder();
        medarbejder.addPaafyldning(createPaafyldning(medarbejder, "D1"));
        medarbejder.addPaafyldning(createPaafyldning(medarbejder, "D2"));

        List<Paafyldning> copy = medarbejder.getPaafyldninger();

        // Samme størrelse til at starte med
        assertEquals(2, copy.size());

        // Vi ændrer kopien
        copy.clear();
        assertEquals(0, copy.size());

        // Intern liste må ikke ændres
        assertEquals(2, medarbejder.getAntalPaafyldninger());

        // Ny kopi skal igen vise 2
        assertEquals(2, medarbejder.getPaafyldninger().size());
    }

    @Test
    void testToStringReflectsPaafyldningCount() {
        LagerMedarbejder medarbejder = createLagerMedarbejder();

        // 0 påfyldninger
        String s0 = medarbejder.toString();
        assertTrue(s0.contains("(0 påfyldninger)"));
        assertTrue(s0.contains("M1"));
        assertTrue(s0.contains("Test Medarbejder"));

        // 2 påfyldninger
        medarbejder.addPaafyldning(createPaafyldning(medarbejder, "D1"));
        medarbejder.addPaafyldning(createPaafyldning(medarbejder, "D2"));

        String s2 = medarbejder.toString();
        assertTrue(s2.contains("(2 påfyldninger)"));
        assertTrue(s2.contains("M1"));
        assertTrue(s2.contains("Test Medarbejder"));
    }
}
