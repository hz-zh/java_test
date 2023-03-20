class QuartsToGallons {
   public static void main(String[] args) {
       final int QUARTS_IN_GALLON = 4;
       int quartsNeeded = 18;
       int gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
       int extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
       System.out.println("A job that needs " + quartsNeeded +
       " quarts requires " + gallonsNeeded +
       " gallons plus " + extraQuartsNeeded + " quarts.");
   }
}
