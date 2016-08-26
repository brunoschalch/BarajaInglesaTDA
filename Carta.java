public class Carta {
  
public static final String ESPADAS =  "espadas";
public static final String DIAMANTES =  "diamantes";
public static final String TREBOLES =  "treboles";
public static final String CORAZONES =  "corazones"; 

public static final String JOKER =  "joker"; 

private boolean isJoker = false;
private int numero;
private String palo;

public Carta(String palo, int numero) {
  palo = palo.toLowerCase();
  if (palo.equals(ESPADAS) || palo.equals(DIAMANTES) || palo.equals(TREBOLES) || palo.equals(CORAZONES) ) {
    if (numero>=1 && numero<=13 ) {
      this.numero=numero;
      this.palo = palo;
    }
  }
}


public Carta() {
    //CARTA JOKER
    isJoker=true;
    this.palo = JOKER;
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
  } else {
    return numero + " de " + palo;
  }
}


}
