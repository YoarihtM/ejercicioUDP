package acr.yoariht;

//Importamos las clases que usaremos
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class CHolaD {
    public static void main(String[] args) {
        try{
            // En la sentencia try declaramos el socket de datagrama, no especificamos puerto ya que 
            // en esta versión será un socket cliente
            DatagramSocket cl = new DatagramSocket();

            // Se muestra el inicio del socket y se muestra en pantalla
            System.out.println("Cliente iniciado, escriba un mensaje de saludo");

            // Declaramos un BufferedReader que leerá lo que introduzcamos por consola
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Se guardará lo introducido en consola en una variable de tipo String
            String mensaje = br.readLine();

            // Obtenemos los bytes de la cadena y los guardamos en un array de tipo byte
            byte[] b = mensaje.getBytes();

            // Se declara la cadena dst que será la dirección del servidor
            String dst = "127.0.0.1";

            // Se declara el int que será el puerto al que pertenece el proceso del socket servidor
            int pto = 2000;

            // Se crea un DatagramPacket que va a envíar los bytes de la cadena introducida a la dirección 
            // del servidor en el puerto especificado
            DatagramPacket p = new DatagramPacket(b, b.length, InetAddress.getByName(dst), pto);

            // Se envía el paquete a través del socket cliente
            cl.send(p);

            // Cerramos el socket luego de enviar el paquete
            cl.close();
        }catch (Exception e){
            // En caso de que falle al ejecutarse el código de recepción de mensajes en la sentencia try
            // se imprime en pantalla el error
            e.printStackTrace(System.out);
        }
    }
}
