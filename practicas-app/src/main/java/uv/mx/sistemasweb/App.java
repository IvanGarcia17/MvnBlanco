package uv.mx.sistemasweb;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        

        get("/aprobado", (req, res) -> {
            res.redirect("/practicas-app/src/main/java/uv/mx/sistemasweb/index.html");
            return null;
        });

        System.out.println("10");

    }
}
