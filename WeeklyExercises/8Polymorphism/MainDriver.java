import java.util.Base64;

interface Encryptable {
    void encrypt();
    String decrypt();
}

class Secret implements Encryptable {
    private String secret;

    public Secret(String secret) {
        this.secret = secret;
    }

    @Override
    public void encrypt() {
        this.secret = new StringBuilder(this.secret).reverse().toString();
    }

    @Override
    public String decrypt() {
        return new StringBuilder(this.secret).reverse().toString();
    }

    public String getSecret() {
        return secret;
    }
}

class Password implements Encryptable {
    private String password;

    public Password(String password) {
        this.password = password;
    }

    @Override
    public void encrypt() {
        this.password = Base64.getEncoder().encodeToString(this.password.getBytes());
    }

    @Override
    public String decrypt() {
        byte[] decodedBytes = Base64.getDecoder().decode(this.password);
        return new String(decodedBytes);
    }

    public String getPassword() {
        return password;
    }
}

public class MainDriver {
    public static void main(String[] args) {
        Encryptable obj1 = new Secret("Hello, world!");
        Encryptable obj2 = new Password("ObjectOrientedProgramming123");

        obj1.encrypt();
        System.out.println("Encrypted Secret: " + ((Secret) obj1).getSecret());

        obj2.encrypt();
        System.out.println("Encrypted Password: " + ((Password) obj2).getPassword());

        System.out.println("Decrypted Secret: " + obj1.decrypt());
        System.out.println("Decrypted Password: " + obj2.decrypt());
    }
}
