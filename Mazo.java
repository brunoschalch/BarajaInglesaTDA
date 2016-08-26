public class Mazo {
  
  private Carta[] cartas= new Carta[54];
  
  public Mazo() {
    generarMazo();
  }
  
  private void generarMazo() {
    //generar carta por carta y llenar arreglo
  }
  
  public Carta regresarCartaenPosicion(int index) {
    if (index>53 || index<0) {
      //nope
      return cartas[0];
    } else {
      return cartas[index];
    }
  
  }



}
