interface Municipal {
  public void tipo();
}

interface Intermunicipal {
  public void tipo2();
}

interface Internacional {
  public void tipo3();
}

class Tipo implements Municipal, Intermunicipal, Internacional {
  int costo;

  public void tipo() {
    costo = 5000;
    System.out.println("Tiempo envio 12 horas");
  }

  public void tipo2() {
    costo = 15000;
    System.out.println("Tiempo envio 36 horas");
  }

  public void tipo3() {
    costo = 25000;
    System.out.println("Tiempo envio 90 horas");
  }
}

class Principal {
  public static void main(String[] args) {
    Tipo myEnvio = new Tipo();
    myEnvio.tipo();
    myEnvio.tipo2();
    myEnvio.tipo3();
  }
}

