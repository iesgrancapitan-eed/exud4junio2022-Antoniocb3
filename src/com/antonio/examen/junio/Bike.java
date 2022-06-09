package com.antonio.examen.junio;

/**
 * Clase bicicleta con los atributos "speed" y "gear"
 * 
 * @author Antonio Carmona Bascon
 *
 */
class Bike implements Vehicle {  
  /**
  * Velocidad
  */
  private int speed;
  /**
   * Marcha
   */
  private int gear;
    
  /**
   * Cambiar la marcha
   */
  @Override
public void changeGear(int newGear){     
      setGear(newGear);
  }
    
  /**
   * Incrementar la velocidad
   */
  @Override
public void speedUp(int increment){
      setSpeed(getSpeed() + increment);
  }
    
  /**
   * Decrepemtar la velocidad
   */
  @Override
public void applyBrakes(int decrement){     
      setSpeed(getSpeed() - decrement);
  }
    
  /**
   * Imprimir por pantalla la velocidad y la marcha
   */
  @Override
public void printStates() {
      System.out.println("speed: " + getSpeed()
          + " gear: " + getGear());
  }


  /**
   * Devuelve la velocidad y la marcha de la bicicleta
   */
@Override
public String toString() {
	return "Bike [speed=" + getSpeed() + ", gear=" + getGear() + "]";
}


/**
 *  Nos proporciona la velocidad
 *  
 * @return speed velocidad
 */
int getSpeed() {
	return speed;
}


/**
 * Nos devuelve la velocidad
 * 
 * @param speed velocidad
 */
void setSpeed(int speed) {
	this.speed = speed;
}


/**
 * Nos proporciona la marcha
 * 
 * @return gear marcha
 */
int getGear() {
	return gear;
}

/**
 * Nos devuelve la marcha
 * 
 * @param gear marcha
 */
void setGear(int gear) {
	this.gear = gear;
}
  
}

//class Bike implements Vehicle {
//    
//  int speed;
//  int gear;
//
//  @Override
//  public void changeGear(int newGear){
//        
//      gear = newGear;
//  }
//    
//  @Override
//  public void speedUp(int increment){
//        
//      speed = speed + increment;
//  }
//
// @Override
//  public void applyBrakes(int decrement){
//        
//      speed = speed - decrement;
//  }
//    
//  public void printStates() {
//      System.out.println("speed: " + speed
//          + " gear: " + gear);
//  } 
//}

//class GFG {
//    
//  public static void main (String[] args) {
//    
//      // creating an inatance of Bike
//      // doing some operations
//      Bike bicycle = new Bike();
//      bicycle.changeGear(2);
//      bicycle.speedUp(3);
//      bicycle.applyBrakes(1);
//        
//      System.out.println("Bike present state :");
//      bicycle.printStates();
//        
//      // creating instance of the bike.
//      Bike bike = new Bike();
//      bike.changeGear(1);
//      bike.speedUp(4);
//      bike.applyBrakes(3);
//        
//      System.out.println("Bike present state :");
//      bike.printStates();
//  }
//}