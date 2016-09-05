public class Mazo {
  
  private Carta[] cartas= new Carta[54];
  
  public Mazo() {
    generarMazo();
  }
  
  private void generarMazo() {
    //generar carta por carta y llenar arreglo
    //empezar por espadas, seguir con diamantes, treboles y corazones
    for (int i=0; i<54 ; i++) {
      if (i<13) {
        cartas[i]=new Carta(Carta.ESPADAS, (i+1));
      } else if (i<26) {
         cartas[i]=new Carta(Carta.DIAMANTES, (i%13+1));
      } else if (i<39) {
         cartas[i]=new Carta(Carta.TREBOLES, (i%13+1));
      } else if (i<52) {
         cartas[i]=new Carta(Carta.CORAZONES, (i%13+1));
      } else {
        cartas[i] = new Carta();
      }
    }

  }
  
  public Carta regresarCartaenPosicion(int index) {
    if (index>53 || index<0) {
      //nope
      return cartas[0];
    } else {
      return cartas[index];
    }
  
  }
  
  public String toString() {
    String regresar="";
    for (Carta carta : cartas) {
      regresar+=carta+"\n";
    }
    return regresar;
  }
  
  public Carta[] getMazo() {
    return cartas;
  }

public void shuffle() {
  
  
}


}
