 class Test{
  public static void main(String[] args) {

    // size of the triangle
    int size = 5;
    for (int i = 1; i <= size; i++) {
      // print stars
      for (int j = 1; j <= size - i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
