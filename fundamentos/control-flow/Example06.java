public class HelloWorld {
    public static void main(String[] args) {
      boolean isLatte = true, isIced = false, withMatcha = true;
      int itemsOrdered = 1, vanillaPumps = 3;

    if (isLatte && isIced){
      System.out.println("espresso, milk, ice, syrup");
    } else if(isLatte && withMatcha){
      System.out.println("matcha, oat mil, ice, vanilla");
    } else if(isLatte){
      System.out.println("espresso, steamed milk");
    } else {
      System.out.println("Select a drink to get started!");
    }
      if (itemsOrdered > 1){
        System.out.println("provide cup holder");
      } if (vanillaPumps >= 2){
        System.out.println("charge R$ 5 extra");
      }
    }
}
