package src;
        import java.util.Arrays;
        import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.*;

class AdministratieTest {

    private int[] testAantal = {45, 56, 34, 39, 40, 31}; // 40.8333
    private double[] testOmzet = {567.70, 498.25, 458.90}; // 508.2833
    private double[] testDagOmzet =  {321.35, 450.50, 210.45, 190.85, 193.25,
            159.90, 214.25, 220.90, 201.90, 242.70, 260.35};

    @Test
    void berekenGemiddeldAantal() {
        double dit = Administratie.berekenGemiddeldAantal(testAantal);
        assertEquals(dit, 40.8333, 0.0001);
        // test passed
    }

    @Test
    void berekenGemiddeldeOmzet() {
        double dat = Administratie.berekenGemiddeldeOmzet(testOmzet);
        assertEquals(dat, 508.2833, 0.0001);
        // test passed
    }


    @org.junit.jupiter.api.Test
    void berekenDagOmzet() {
        double[] test = Administratie.berekenDagOmzet(testDagOmzet);
        System.out.println(Arrays.toString(test));
        // first test: [542.25, 652.4, 453.15, 451.20000000000005, 193.25, 159.9, 214.25]
        // klopt want maandagwaardes: 321.35 (testDagOmzet[0]) + 220.90 (testDagOmzet[7]) = 542.25
    }
}





