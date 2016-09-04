public class Carta implements Comparable<Carta> {
  
public static final String ESPADAS =  "espadas";
public static final String DIAMANTES =  "diamantes";
public static final String TREBOLES =  "treboles";
public static final String CORAZONES =  "corazones"; 

public static final String JOKER =  "joker"; 

private boolean isJoker = false;
private int numero;
private String palo;
private boolean esRojo;

public final int sortingID;

//el sortingID sirve para poder comparar cartas (mayor a, menor a e igual a)
public Carta(String palo, int numero) {
  palo = palo.toLowerCase();
  if (palo.equals(ESPADAS) || palo.equals(DIAMANTES) || palo.equals(TREBOLES) || palo.equals(CORAZONES) ) {
    if (numero>=1 && numero<=13 ) {
      this.numero=numero;
      this.palo = palo;
      if (palo.equals(CORAZONES) || palo.equals(DIAMANTES)) {
        esRojo=true;
      }
    }
  }
  
  if (palo.equals(ESPADAS)) {
    sortingID = numero-1;
  } else if (palo.equals(DIAMANTES)) {
    sortingID = numero+12;
  } else if (palo.equals(TREBOLES)) {
    sortingID = numero+25;
  } else {
    sortingID = numero+38;
  }
  
  
}


public Carta() {
    //CARTA JOKER
    isJoker=true;
    this.palo = JOKER;
    sortingID = 52;
}

public boolean isJoker() {
  return isJoker;
}

public int getNumero() {
  return numero;
}

public String getPalo() {
  return palo;
}

public String toString() {
  if (isJoker) {
    return "Joker";
  } else if (numero==1) {
    return "Ace" + " de " + palo;
  }  else if (numero<=10) {
    return numero + " de " + palo;
  } else if (numero == 11) {
    return "Jack" + " de " + palo;
  } else if (numero == 12) {
    return "Queen" + " de " + palo;
  } else if (numero == 13) {
    return "King" + " de " + palo;
  } else {
    return "error";
  }
}

public boolean esRoja() {
  return esRojo;
}

public boolean esNegra() {
  return !esRojo;
}

public boolean esMayor(Carta otra) {
  return this.sortingID>otra.sortingID;
}

public boolean esMenor(Carta otra) {
  return this.sortingID<otra.sortingID;
}

public boolean esIgual(Carta otra) {
  return this.sortingID==otra.sortingID;
}


}
