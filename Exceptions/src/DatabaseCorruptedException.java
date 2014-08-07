public class DatabaseCorruptedException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    static String message = "Database is corrupted! Possible wrong input";
    
    public DatabaseCorruptedException(){
        super(message);
    }
    
    public DatabaseCorruptedException(String customMessage){
        super(message + " " + customMessage);
    }
    
    public static void main(String[] args) throws Exception{
        Exception dbc = new DatabaseCorruptedException("Wut?");
        throw dbc;
    }
}
