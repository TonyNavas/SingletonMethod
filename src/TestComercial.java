public class TestComercial {
    public static void main(String[] args)
    {
        Comercial comercial = Comercial.Instance();
        comercial.setNombre("Comercial de Juegos");
        comercial.setDireccion("Santa Mónica California");
        comercial.setEmail("support.activition.com");
        visualiza();
    }
    public static void visualiza()
    {
        Comercial cm = Comercial.Instance();
        cm.visualiza();
    }
}
