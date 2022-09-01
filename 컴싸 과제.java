   public static int min(int[] a) {
      int min = a[0]; 
      for(int i = 0; i < a.length; i++) {
      
         if (a[i] < min)
            min = a[i];
      }
      if (a.length == 0 || a == null) {
         throw new IllegalArgumentException();
      }
      return min;
   }
