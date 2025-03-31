public class ParametroInvalidoException extends Exception {

    public ParametroInvalidoException(String message) {
        super(message);
    }

    public void validarParametros(int numero1, int numero2) throws ParametroInvalidoException {
        if (numero1 > numero2) { 
            throw new ParametroInvalidoException("O primeiro parametro deve ser menor que o segundo.");
        }
    }
}
