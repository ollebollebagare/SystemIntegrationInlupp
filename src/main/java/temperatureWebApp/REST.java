package temperatureWebApp;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/Azure")


public class REST 
{
    @GET
    @Path("/allTemps")
    @Produces(MediaType.TEXT_PLAIN)
    public String getTemp() throws SQLException, ClassNotFoundException, IOException
    {
        return AzureFunctions.getAllTemperatures();
    }
    
    @GET
    @Path("/newTemp/{temp}")
    public void newTemp(@PathParam("temp") String temp) throws SQLException, ClassNotFoundException, IOException
    {
        AzureFunctions.insertNewTemp(temp);
    }
}
