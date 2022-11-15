import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;

import javax.crypto.Cipher;

class Criptografia {

    public static KeyPair gerarChavePublicoPriva()
    throws NoSuchAlgorithmException {
        KeyPairGenerator geradorChave = 
        KeyPairGenerator.getInstance("RSA");

        geradorChave.initialize(2048);

        KeyPair par = geradorChave.generateKeyPair();
        return null;
    }

    public static String cifrar(String mensagem,
    PublicKey publicKey) {
        byte messaToByte = mensagem.getBytes();
        Cipher cifrador = Cipher.getInstance("RSA/ECB/PKCS1Padding");

        cifrador.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] bytesCripto = cifrador.doFinal(mes)
    }
}