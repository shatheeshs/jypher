import Service.Base64;

public class Jypher {

    public String encodeBase64(String encodeVal) {
        Base64 base64 = new Base64();
        return base64.encode(encodeVal);
    }

}

