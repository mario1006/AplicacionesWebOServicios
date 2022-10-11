package Client;

import Server.Methods;
import jdk.swing.interop.SwingInterOpUtils;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.ArrayList;

public class RPCClient {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);


        ArrayList<Methods> coches = new ArrayList<Methods>();

        String numeroSerie;
        String marca = null;
        String modelo;
        String color;

        int limite =0;
        int opc;

        while(limite == 0){
            System.out.println("MENU");
            System.out.println("1. Crear Auto");
            System.out.println("2. Mostrar Autos");
            System.out.println("3. Buscar Autos");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Nuevo Auto");
                    sc.nextLine();
                    System.out.println("Ingresa numero de serie");
                    numeroSerie = sc.nextLine();
                    System.out.println("Ingresa marca");
                    marca = sc.nextLine();
                    System.out.println("Ingresa modelo");
                    modelo = sc.nextLine();
                    System.out.println("Ingresa color");
                    color = sc.nextLine();
                    Methods a = new Methods(numeroSerie,marca,modelo,color);
                    coches.add(a);
                    break;
                case 2:
                    System.out.println("TODOS LOS COCHES");
                    for (int i = 0;i<coches.size();i++){
                        System.out.println("Marca"+coches.get(i).getMarca());
                    }
                    break;
                case 3:
                    int encontrado = 0;
                    sc.nextLine();
                    System.out.println("BUSCAR AUTOS");
                    System.out.println("Ingresa el numero de Serie");
                    numeroSerie = sc.nextLine();
                    for (int i =0;i<coches.size();i++){
                        if (numeroSerie.equals(coches.get(i).getNumeroSerie())){
                            System.out.println("AUTO ENCONTRADO");
                            System.out.println("---------------------------------");
                            System.out.println("Marca: "+coches.get(i).getMarca());
                            System.out.println("Modelo: "+coches.get(i).getModelo());
                            System.out.println("Color: "+coches.get(i).getColor());
                            encontrado = 1;
                        }
                    }
                    if (encontrado == 0){
                        sc.nextLine();
                        System.out.println("AUNTO NO ENCONTRADO!");
                        numeroSerie = sc.nextLine();
                    }
                    break;
                case 4:
                     encontrado = 0;
                    sc.nextLine();
                    System.out.println("ELIMINAR AUTOS");
                    System.out.println("Ingresa el numero de Serie");
                    numeroSerie = sc.nextLine();
                    for (int i =0;i<coches.size();i++){
                        if (numeroSerie.equals(coches.get(i).getNumeroSerie())){
                            System.out.println("AUTO ENCONTRADO");
                            System.out.println("---------------------------------");
                            coches.remove(coches.get(i).getMarca());
                            /*System.out.println("Marca: "+coches.get(i).getMarca());
                            System.out.println("Modelo: "+coches.get(i).getModelo());
                            System.out.println("Color: "+coches.get(i).getColor());
                            encontrado = 1;*/
                        }
                    }
                    if (encontrado == 0){
                        sc.nextLine();
                        System.out.println("AUNTO NO ENCONTRADO!");
                        numeroSerie = sc.nextLine();
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }

    }
}

