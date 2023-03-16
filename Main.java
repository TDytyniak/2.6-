class Main {
  public static void main(String[] args) {
   double c=0;
    System.out.println("\nCelsjusza\tFahrenheita");
    for(int i=0;i<301;i++){
      double f = 32+((9.0)/(5.0))*c;
      System.out.println("\t"+c+"\t\t\t"+f);
      c++;
    }
  }
}