package acr.yoariht;

//Importamos las clases que usaremos
import java.net.DatagramPacket; 
import java.net.DatagramSocket;
import java.net.Socket;

public class SHolaD {
    public static void main( String[] args ){
        try{
            //El socket se declara y se inicia el proceso en el puerto 2000
            DatagramSocket s = new DatagramSocket(2000); 

            //Se muestra un mensaje de que se ha iniciado el servidor
            System.out.println("Servidor iniciado, esperando cliente");

            //Usamos un for(;;) sin rangos para que se use de manera indefinida como un ciclo infinito
            //También se puede utilizar un while(true) para mantener abierto el socket y recibir peticiones
            while(true){

                //Se crea una variable de tipo DatagramPacket que recibirá la información en paquetes de 2000 bytes
                // en el puerto 2000 donde se van a recibir los mensajes
                DatagramPacket p = new DatagramPacket(new byte[2000], 2000);

                //Se le da la instrucción al servidor s de recibir los paquetes previamente especificados
                s.receive(p);

                //Cuando llega un paquete, se muestra en pantalla la dirección y el puerto desde donde se está enviando
                System.out.println("Datagrama recibido desde " + p.getAddress() + ":" + p.getPort());

                // Se crea una variable de tipo String que será el mensaje envíado por el cliente luego de ser convertido de bytes
                // a una cadena para poder mostrarse de forma legible, leyendo desde el byte 0 hasta la el final del arreglo de bytes
                String msj = new String(p.getData(), 0, p.getLength());

                // Por último se muestra en pantalla el mensaje recibido 
                System.out.println("Con el mensaje: \n\t\t" + msj);
            }
        }catch (Exception e){
            // En caso de que falle al ejecutarse el código de recepción de mensajes en la sentencia try
            // se imprime en pantalla el error
            e.printStackTrace(System.out);
        }
    }
}
