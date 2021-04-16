package SEGURIDAD;

import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

public class encriptadorHash {

    
    public static String getHash(String clave){
        String hashValue ="";
        try {
            MessageDigest mensajeEntrada = MessageDigest.getInstance("SHA-256");
            mensajeEntrada.update(clave.getBytes());
            byte[] mensajeEncriptado = mensajeEntrada.digest();
            hashValue = DatatypeConverter.printHexBinary(mensajeEncriptado).toLowerCase();
        } catch (Exception e) {
            System.out.println("error = "+e.getMessage());
        }
        return hashValue;
    }
    

}
