package bcp.com.pe.mspocblobkeyrxjava;

import com.azure.security.keyvault.secrets.SecretClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsPocBlobKeyRxjavaApplication implements CommandLineRunner {

    private final SecretClient implClient;

    public MsPocBlobKeyRxjavaApplication(SecretClient implClient) {
        this.implClient = implClient;
    }


    public static void main(String[] args) {
        SpringApplication.run(MsPocBlobKeyRxjavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("blob: " + implClient.getSecret("ntlc-blob-strg-ak-bck05").getValue());

    }
}
