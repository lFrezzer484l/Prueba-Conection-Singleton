package app;

import conection.conexDB;

public class app {
    public static void main(String[] args){
        //instanciacion por constructor prohibido por ser "private"
        //conexion c = new conexion();
        conexDB c = conexDB.getInstancia();
        c.conectar();
        c.desconectar();
        
        boolean rpta = c instanceof conexDB;
        System.out.println(rpta);
    }
}