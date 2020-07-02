/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gantt;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author KevinB
 */
public class Cola {

    protected Node Cabecera;
    protected Node Final;
    
    public Cola() {
        Cabecera = null;
    }

    public void insert(int llegada, int rafaga, String nom, int fil, int rRestante) {
        Node tmp = new Node(llegada, rafaga, nom, fil, rRestante);
        int l = longitud();
        if (l > 0) {
        Node aux1 = Cabecera;
        while (aux1.next!=null){
            aux1=aux1.next;
        }System.out.println("Va despues de:");
            System.out.println(aux1.nombre);
        aux1.setNext(tmp);
    }
        else {
            Cabecera = tmp;
        }
        
    
    }

    public void extraer(int x) {
        while (x > 0) {
            int l = longitud();
            System.out.println("Borraremos a "+Cabecera.nombre);
           // System.out.println("Será cabeca "+Cabecera.next.nombre);
            if (l > 1) {
                Cabecera=Cabecera.next;
            }else{
                Cabecera=null;
                System.out.println("Queda vacia la cola");
            }
            x--;
        }

    }

    public int longitud() {
        int cont = 0;
        Node tmp = Cabecera;
        while (tmp != null) {
            cont = cont + 1;
            tmp = tmp.getNext();
        }
        if (cont==0){
            System.out.println("COLA VACIA");
        }
        return cont;
    }

    public ArrayList<Node> nodosCola() {
        ArrayList<Node> rafagas = new ArrayList<Node>();
        
        if (!isEmpty()) {
            Node tmp = Cabecera;
            while (tmp != null) {
                rafagas.add(tmp);
                tmp = tmp.getNext();         
            }
        }
        
        return rafagas;
    }

    public boolean isEmpty() {
        if (Cabecera == null) {
            return true;
        } else {
            return false;
        }
    }

}
