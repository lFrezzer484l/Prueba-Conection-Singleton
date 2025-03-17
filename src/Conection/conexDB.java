package conection;

public class conexDB {
    //decaracion
    private static conexDB instancia;
    //private static conexion instancia = new conexion();
    
    //para evitar instancia mediante operador "new"
    private conexDB() {
        
    }
    
    //para obtener la instancia unicamente por este metodo
    //notese la palabra reservada "static" hace posible el acceso mediante clase.metodo
    public static conexDB getInstancia(){
        if(instancia == null){
            instancia = new conexDB();
        }
        return instancia;
    }
    
    //metodo prueba
    public void conectar(){
        System.out.println("Me conecte a a DB");
    }
    
    //metodo prueba
    public void desconectar(){
        System.out.println("Me desconecte de la BD");
    }
}