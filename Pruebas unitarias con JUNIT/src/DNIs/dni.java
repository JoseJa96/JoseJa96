package DNIs;
/**
 * 
 * @author JoseJa
 *
 */
public class dni {
    private int dni = 0;
    private char letra = ' ';

    /**
     * 
     */
    public dni ()
    {
        dni = 0;
        letra =' ';	
    }

    public char calcularLetra (String dni) 
    {
    	
    	if (dni.length() != 8 || dni.contains(" ") || dni == "00000000" || dni == "") {
    		return ' ';    		
    	}  
    	
    	int dni2 = Integer.parseInt(dni);
        this.dni = dni2;
        return letra = letra(dni2);    	
    }

    private char letra(int dni)
    {
        String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int auxiliar = dni % 23;
        char letra = juegoCaracteres.charAt(auxiliar);
        return letra; 
    } 

    public void setDni (int dni)
    {
        this.dni = dni;
    }

    public int getDni()
    {
        return dni;
    }

    public void mostrar()
    {
        System.out.println(dni + "-" + letra);
    }

}