public class Comercial {
    protected String nombre;
    protected String direccion;
    protected String email;

    private static Comercial _instance = null;

    private Comercial(){}

    public static Comercial Instance()
    {
        if (_instance == null)
            _instance = new Comercial();
        return _instance;
    }
}
