package inher;

class Pclass{
   
    void pmethod() {
    System.out.println("This is parent class");

  }
}

class Childclass extends Pclass {
  public void cmethod() {
    System.out.println("This is child class");
  }
}

class Ans {

  public static void main(String[] args) {
    Pclass m = new Pclass();
    Childclass n = new Childclass();
    m.pmethod();
      n.cmethod();
      
    }
  }									
  