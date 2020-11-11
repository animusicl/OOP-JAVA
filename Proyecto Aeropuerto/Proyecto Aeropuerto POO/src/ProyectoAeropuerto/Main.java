
package ProyectoAeropuerto;

import java.util.Scanner;


public class Main {
   static Scanner entrada = new Scanner (System.in);
   final static int num = 4; //numero de aeropuertos
   static Aeropuerto aeropuertos[] = new Aeropuerto[num];
   
    public static void main (String [] args) {
        
    InsertarDatosAeropuerto(aeropuertos);
   
    menu();
   
    }
    
    public static void InsertarDatosAeropuerto (Aeropuerto aero[]) {
    aero[0] = new AeropuertoPublico (80000000, "Jorge Chavez", "Lima", "Peru");
    aero[0].insertarCompañia(new Compañia("AeroPeru"));
    aero[0].insertarCompañia(new Compañia("LATAM"));
    aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB20", "Lima", "Mexico", 150.2, 150));
    aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB21", "Lima", "Buenos Aires", 170.90, 160));
    aero[0].getCompañia("LATAM").insertarVuelo(new Vuelo("AL30", "Lima", "Cordoba", 300.40, 160));
    aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajeros(new Pasajero("Acosta,Maria", "AF6542", "Argentina"));
    aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajeros(new Pasajero("Acosta, Pedro", "AF6553", "Argentina"));
    aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajeros(new Pasajero("Raimundo, Amalia", "AF8899", "Argentina"));
    aero[0].getCompañia("AeroPeru").getVuelo("IB21").insertarPasajeros(new Pasajero("Acosta, Diego", "AF6541", "Argentina"));
    aero[0].getCompañia("AeroPeru").getVuelo("IB21").insertarPasajeros(new Pasajero("Acosta, Victoria", "AF6378", "Argentina"));
    aero[0].getCompañia("AeroPeru").getVuelo("IB21").insertarPasajeros(new Pasajero("Lopez Lotero, Anto", "AF6522", "Argentina"));
    aero[0].getCompañia("LATAM").getVuelo("AL30").insertarPasajeros(new Pasajero("Perez, Jorge", "JL7621", "Argentina"));
    aero[0].getCompañia("LATAM").getVuelo("AL30").insertarPasajeros(new Pasajero("Verri, Franco", "JL6655", "Argentina"));
    aero[0].getCompañia("LATAM").getVuelo("AL30").insertarPasajeros(new Pasajero("Guglielmetti, Federico", "JL8732", "Argentina"));
   
    aero[1] = new AeropuertoPublico (95000000, "Charles de Gaulle", "Paris", "Francia");
    aero[1].insertarCompañia(new Compañia ("Norwegian"));
    aero[1].insertarCompañia(new Compañia("Lufthansa"));
    aero[1].getCompañia("Norwegian").insertarVuelo(new Vuelo("NW51", "Paris", "Londres", 40.70, 150));
    aero[1].getCompañia("Norwegian").insertarVuelo(new Vuelo("NW52", "Paris", "Oslo", 120.50, 150));
    aero[1].getCompañia("Lufthansa").insertarVuelo(new Vuelo("LF81", "Paris", "Copenhague", 110.70, 160));
    aero[1].getCompañia("Lufthansa").insertarVuelo(new Vuelo("LF82", "Paris", "Rabat", 80.70, 160));
    aero[1].getCompañia("Norwegian").getVuelo("NW51").insertarPasajeros(new Pasajero("Manzano, Magali", "MM8587", "Chilena"));
    aero[1].getCompañia("Norwegian").getVuelo("NW51").insertarPasajeros(new Pasajero("Manzano, Lucas", "MM8597", "Chilena"));
    aero[1].getCompañia("Norwegian").getVuelo("NW52").insertarPasajeros(new Pasajero("Acosta, Guadalupe", "AG6140", "Argentina"));
    aero[1].getCompañia("Norwegian").getVuelo("NW52").insertarPasajeros(new Pasajero("Matta, Anju", "AG6146", "Argentina"));
    aero[1].getCompañia("Lufthansa").getVuelo("LF81").insertarPasajeros(new Pasajero("Ivanoff, Matias", "IV6140", "Boliviana"));
    aero[1].getCompañia("Lufthansa").getVuelo("LF81").insertarPasajeros(new Pasajero("Ivanoff, Bruno", "IV6789", "Boliviana"));
    aero[1].getCompañia("Lufthansa").getVuelo("LF82").insertarPasajeros(new Pasajero("Bottega, Juan", "BJ4466", "Boliviana"));
    aero[1].getCompañia("Lufthansa").getVuelo("LF82").insertarPasajeros(new Pasajero("Bottega, Daniel", "BJ4485", "Boliviana"));
   
    aero[2] = new AeropuertoPrivado("EZEIZA", "Buenos Aires", "Argentina");
    aero[2].insertarCompañia(new Compañia("Aerolineas Argentinas"));
    aero[2].insertarCompañia(new Compañia("GOL"));
    aero[2].insertarCompañia(new Compañia("IBERIA"));
    String empresas[] = {"Cobresol", "Anguila34"};
    ((AeropuertoPrivado)aero[2]).insertarEmpresas(empresas);
    aero[2].getCompañia("Aerolineas Argentinas").insertarVuelo(new Vuelo("OP20", "Buenos Aires", "Mendoza", 150.90, 150));
    aero[2].getCompañia("Aerolineas Argentinas").insertarVuelo(new Vuelo("OP22", "Buenos Aires", "Mendoza", 170.90, 160));
    aero[2].getCompañia("GOL").insertarVuelo(new Vuelo("AA33", "Buenos Aires", "Rio de Janeiro", 270.90, 170));
    aero[2].getCompañia("GOL").insertarVuelo(new Vuelo("AA36", "Buenos Aires", "Angra dos Reis", 260.90, 140));
    aero[2].getCompañia("IBERIA").insertarVuelo(new Vuelo("JL74", "Buenos Aires", "Madrid", 560.90, 160));
    aero[2].getCompañia("IBERIA").insertarVuelo(new Vuelo("JL76", "Buenos Aires", "Galicia", 660.90, 150));
    aero[2].getCompañia("Aerolineas Argentinas").getVuelo("OP20").insertarPasajeros(new Pasajero("Carrillo, Javier", "AP9842", "Mexicano"));
    aero[2].getCompañia("Aerolineas Argentinas").getVuelo("OP20").insertarPasajeros(new Pasajero("Huatuco, Cesar", "XZ9842", "Peruano"));
    aero[2].getCompañia("Aerolineas Argentinas").getVuelo("OP22").insertarPasajeros(new Pasajero("Llera, Daniela", "AZ9882", "Argentina"));
    aero[2].getCompañia("Aerolineas Argentinas").getVuelo("OP22").insertarPasajeros(new Pasajero("Farley, Paola", "AZ7799", "Argentina"));
    aero[2].getCompañia("GOL").getVuelo("AA33").insertarPasajeros(new Pasajero("Matta, Maria Rosa", "MR8587", "Argentina"));
    aero[2].getCompañia("GOL").getVuelo("AA33").insertarPasajeros(new Pasajero("Matta, Maria Cristina", "MR8586", "Argentina"));
    aero[2].getCompañia("GOL").getVuelo("AA36").insertarPasajeros(new Pasajero("Olmedo, Lucia", "OM8587", "Argentina"));
    aero[2].getCompañia("GOL").getVuelo("AA36").insertarPasajeros(new Pasajero("Olmedo, Maria del Rosario", "OM8523", "Argentina"));
    aero[2].getCompañia("IBERIA").getVuelo("JL74").insertarPasajeros(new Pasajero("Cañete, Nicolas", "NC9999", "Española"));
    aero[2].getCompañia("IBERIA").getVuelo("JL74").insertarPasajeros(new Pasajero("Dellamea, Patricia", "NC9977", "Española"));
    aero[2].getCompañia("IBERIA").getVuelo("JL76").insertarPasajeros(new Pasajero("Moraschetti, Matias", "GC1255", "Argentina"));
    aero[2].getCompañia("IBERIA").getVuelo("JL76").insertarPasajeros(new Pasajero("Sterpone, Gabriel", "GC1251", "Italiana"));
    
    aero[3] = new AeropuertoPrivado ("Aeroparque", "Buenos Aires", "Argentina");
    aero[3].insertarCompañia(new Compañia("Azul Airlines"));
    aero[3].insertarCompañia(new Compañia("Avianca"));
    String empressas[] = {"Swissport", "Dnata"}; 
   ((AeropuertoPrivado)aero[3]).insertarEmpresas(empressas);
    aero[3].getCompañia("Azul Airlines").insertarVuelo(new Vuelo("MP12", "Buenos Aires", "Bahia", 123.70, 160));
    aero[3].getCompañia("Azul Airlines").insertarVuelo(new Vuelo("MP14", "Buenos Aires", "Fortaleza", 143.70, 150));
    aero[3].getCompañia("Avianca").insertarVuelo(new Vuelo("CT87", "Buenos Aires", "Chile", 98.30, 140));
    aero[3].getCompañia("Avianca").insertarVuelo(new Vuelo("CT89", "Buenos Aires", "Colombia", 110.30, 140));
    aero[3].getCompañia("Azul Airlines").getVuelo("MP12").insertarPasajeros(new Pasajero("Matta, Milagros", "MP5322", "Argentina"));
    aero[3].getCompañia("Azul Airlines").getVuelo("MP12").insertarPasajeros(new Pasajero("Calvo, Pablo", "MP5388", "Argentina"));
    aero[3].getCompañia("Azul Airlines").getVuelo("MP14").insertarPasajeros(new Pasajero("Calvo, Silvana", "MP4122", "Española"));
    aero[3].getCompañia("Azul Airlines").getVuelo("MP14").insertarPasajeros(new Pasajero("Calvo, Matias", "MP4188", "Española"));
    aero[3].getCompañia("Avianca").getVuelo("CT87").insertarPasajeros(new Pasajero("Acosta, Camila", "AZ3975", "Brasilera"));
    aero[3].getCompañia("Avianca").getVuelo("CT87").insertarPasajeros(new Pasajero("Acosta, Agustina", "AZ3935", "Brasilera"));
    aero[3].getCompañia("Avianca").getVuelo("CT89").insertarPasajeros(new Pasajero("Irala, Sol", "IS2020", "Venezolana"));
    aero[3].getCompañia("Avianca").getVuelo("CT89").insertarPasajeros(new Pasajero("Simonit, Kalenna", "IS2019", "Venezolana"));
    
    
    }
    
    
    public static void menu (){
        String nombreAeropuerto;
        int opcion;
        Aeropuerto aeropuerto;
        String nombreCompañia = null;
        Compañia compañia;
        String origen, destino;
        
        do { System.out.println("\t.:MENU:.");
        
        System.out.print("\n1. Ver aeropuertos gestionados (publicos o privados)");
        System.out.print("\n2. Ver empresas (Privado) o subvencion (Publico)");
        System.out.print("\n3. Ver lista de compañias de un Aeropuerto");
        System.out.print("\n4. Ver rutas aereas por compañia");
        System.out.print("\n5. Ver opciones de vuelo de una ruta especifica.");
        System.out.print("\n6. Salir");
        System.out.print("\nElija la opcion que desea: ");
        opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1: //Ver aeropuertos gestionados (publicos o privados)
                    System.out.println("");
                    mostrarDatosAeropuertos(aeropuertos);
                    break;
            case 2: //Ver empresas (Privado) o subvencion (Publico)
                    System.out.println("");
                    mostrarPatrocinio(aeropuertos);
                    break;
            case 3: //Ver lista de compañias de un Aeropuerto
                    entrada.nextLine();
                    System.out.print("\nIntroduzca el nombre del aeropuerto: ");
                    nombreAeropuerto = entrada.nextLine();
                    aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                    if (aeropuerto == null) {
                    System.out.print("\nEl aeropuerto no existe."); }
                    else {   mostrarCompañias(aeropuerto);    }
                    break;
            case 4: //Ver rutas aereas por compañia
                    entrada.nextLine();
                    System.out.print("\nDigite el nombre de un Aeropuerto: ");
                    nombreAeropuerto = entrada.nextLine();
                    aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                    if (aeropuerto == null) {
                    System.out.print("\nEl aeropuerto no existe."); }
                    else {System.out.print("\nIntroduzca el nombre de la compañia: ");
                          nombreCompañia = entrada.nextLine();   
                          compañia = aeropuerto.getCompañia(nombreCompañia); 
                          mostrarVuelos(compañia);
                    }
                    break;
            case 5: //Ver opciones de vuelo de una ruta especifica
                entrada.nextLine();
                 System.out.print("\nIntroduzca Ciudad Origen: ");
                 origen = entrada.nextLine();
                 System.out.print("\nIntroduzca Ciudad Destino: ");
                 destino = entrada.nextLine();
                 mostrarRutasAereas(origen, destino, aeropuertos);
                    break;
            case 6: break;
            default: System.out.print("\nError! Digite una opcion nuevamente");
            }
        System.out.println("");
                } while(opcion != 6);
    }
    
    
    public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]){
    for (int i = 0; i<aeropuertos.length; i++) {
        if (aeropuertos[i] instanceof AeropuertoPrivado) {
       
        
        System.out.print("\nAeropuerto Privado");
        System.out.print("\nNombre: "+aeropuertos[i].getNombre());
        System.out.print("\nCiudad: "+aeropuertos[i].getCiudad());
        System.out.print("\nPais: "+aeropuertos[i].getPais());
        
        System.out.println("");
        }
        else { System.out.print("\nAeropuerto Publico");
               System.out.print("\nNombre: "+aeropuertos[i].getNombre());
               System.out.print("\nCiudad: "+aeropuertos[i].getCiudad());
               System.out.print("\nPais: "+aeropuertos[i].getPais()); 
               
               System.out.println("");  }
    }
                }
    
  public static void mostrarPatrocinio(Aeropuerto aeropuertos[]) {
   String empresas[];
   
   for (int i=0;i<aeropuertos.length;i++) {
   if (aeropuertos[i] instanceof AeropuertoPrivado) {
   System.out.print("\nAeropuerto Privado: "+aeropuertos[i].getNombre());
   empresas = ((AeropuertoPrivado)aeropuertos[i]).getListaEmpresas(); //downcasting
   
   System.out.println("\nEmpresas: ");
   for (int j=0; j<empresas.length; j++) {
   System.out.println(empresas[j]); }
    }
   else {
        System.out.print("\nAeropuerto Publico: "+aeropuertos[i].getNombre());
        System.out.print("\nSubvencion: "+((AeropuertoPublico)aeropuertos[i]).getSubvencion());
   }
   System.out.println("");
            }
 }  
    
 public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto aeropuertos[]) {
 boolean encontrado = false;
 int i = 0;
 Aeropuerto aero = null;
 while ((!encontrado) && i <aeropuertos.length){
 if (nombre.equals(aeropuertos[i].getNombre())) {
 encontrado = true;
 aero = aeropuertos[i];   }
 i++;
 
 }
 return aero;
 }
  
 public static void mostrarCompañias(Aeropuerto aeropuerto) {
 System.out.println("\nLas compañias del Aeropuerto "+aeropuerto.getNombre()+" son: ");
 for (int i = 0; i< aeropuerto.getNumCompañia(); i++) {
 System.out.println(aeropuerto.getCompañia(i).getNombre());
           }
  }
 
 public static void mostrarVuelos(Compañia compañia) {
 Vuelo vuelo;
 System.out.print("\nLos vuelos de la compañia "+compañia.getNombre()+" son: ");
 for (int i=0; i<compañia.getNumVuelo(); i++) {
 vuelo = compañia.getVuelo(i);
 System.out.print("\nIdentificador: "+vuelo.getIdentificador());
 System.out.print("\nCiudad Origen: "+vuelo.getCiudadOrigen());
 System.out.print("\nCiudad Destino: "+vuelo.getCiudadDestino());
 System.out.print("\nPrecio: $"+vuelo.getPrecio());
 System.out.println("");
        }
 
    }

 public static Vuelo[] buscarVuelos (String origen, String destino, Aeropuerto aeropuertos[]) {
 Vuelo vuelo;
 int contador = 0;
 Vuelo listaVuelos[];
     for (int i=0; i<aeropuertos.length; i++) { //recorremos aeropuertos
        for (int j=0; j<aeropuertos[i].getNumCompañia(); j++) { //recorremos compañias
             for (int k=0; k<aeropuertos[i].getCompañia(j).getNumVuelo(); k++) { //recorremmos vuelos
             vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
             if ((origen.equals(vuelo.getCiudadOrigen()) && (destino.equals(vuelo.getCiudadDestino())))) {
             contador++;
            }
         
        }
    }
}
 
listaVuelos = new Vuelo[contador];
int q = 0;     

 for (int i=0; i<aeropuertos.length; i++) { //recorremos aeropuertos
     for (int j=0; j<aeropuertos[i].getNumCompañia(); j++) { //recorremos compañias
         for (int k=0; k<aeropuertos[i].getCompañia(j).getNumVuelo(); k++) { //recorremmos vuelos
         vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
         if ((origen.equals(vuelo.getCiudadOrigen()) && (destino.equals(vuelo.getCiudadDestino())))) {
             listaVuelos[q] = vuelo;
             q++;
            }
          }
        }
      }
      return listaVuelos;
    }
 
 public static void mostrarRutasAereas (String origen, String destino, Aeropuerto aeropuertos[]) {
 Vuelo vuelos[];
 
 vuelos = buscarVuelos (origen, destino, aeropuertos);
 if (vuelos.length == 0) {
 System.out.print("\nLa ruta aerea no existe.");   }
 else {
 System.out.print("\nVuelos encontrados: ");
 for (int i=0; i<vuelos.length;i++) {
 System.out.print("\nIdentificador: "+vuelos[i].getIdentificador());
 System.out.print("\nCiudad Origen: "+vuelos[i].getCiudadOrigen());
 System.out.print("\nCiudad Destino: "+vuelos[i].getCiudadDestino());
 System.out.print("\nPrecio: $"+vuelos[i].getPrecio());
 System.out.println("");
                        }
                    }
             }
        }

 