package br.eti.tiagosousa.jsfinanceiro.util;

import br.eti.tiagosousa.jsfinanceiro.excecao.JsFinanceiroException;
import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import org.apache.commons.codec.binary.Base64;


/**
 * @author Tiago Sousa
 * 08/09/2017
 * www.tiagosousa.eti.br
 */
public class MD5 {
    private static final String UNICODE_FORMAT = "UTF8";
    public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
    private final KeySpec ks;
    private final SecretKeyFactory skf;
    private final Cipher cipher;
    byte[] arrayBytes;
    private final String myEncryptionKey;
    private final String myEncryptionScheme;
    SecretKey key;

    public MD5() throws Exception {
        myEncryptionKey = "ThisIsSpartaThisIsSparta";
        myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
        arrayBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
        ks = new DESedeKeySpec(arrayBytes);
        skf = SecretKeyFactory.getInstance(myEncryptionScheme);
        cipher = Cipher.getInstance(myEncryptionScheme);
        key = skf.generateSecret(ks);
    }


    public String encrypt(String unencryptedString) throws JsFinanceiroException {
        String encryptedString = null;
        try {
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainText = unencryptedString.getBytes(UNICODE_FORMAT);
            byte[] encryptedText = cipher.doFinal(plainText);
            encryptedString = new String(Base64.encodeBase64(encryptedText));
        } catch (Exception e) {
            throw new JsFinanceiroException(e.toString());
        }
        return encryptedString;
    }

    public String decrypt(String encryptedString) throws JsFinanceiroException {
        String decryptedText = null;
        try {
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] encryptedText = Base64.decodeBase64(encryptedString.getBytes());
            byte[] plainText = cipher.doFinal(encryptedText);
            decryptedText= new String(plainText);
        } catch (Exception e) {
            throw new JsFinanceiroException(e.toString());
        }
        return decryptedText;
    }
}