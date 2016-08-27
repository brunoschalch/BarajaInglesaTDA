public class Carta {
  
public static final String ESPADAS =  "espadas";
public static final String DIAMANTES =  "diamantes";
public static final String TREBOLES =  "treboles";
public static final String CORAZONES =  "corazones"; 

public static final String JOKER =  "joker"; 

private boolean isJoker = false;
private int numero;
private String palo;
private boolean esRojo;

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


}
