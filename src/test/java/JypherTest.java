import static org.junit.jupiter.api.Assertions.*;

class JypherTest {


    @org.junit.jupiter.api.Test
    void encodeBase64() {
        Jypher jypher = new Jypher();
        System.out.println(jypher.encodeBase64("ettes vs"));
    }
}