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

public static int max(int[] a) throws IllegalArgumentException { 
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException("Array is null or it has zero length");
      }
      int max = a[0]; 
      for(int i = 0; i < a.length; i++) {
      
         if (a[i] > max)
            max = a[i];
      }
   
   
      return max;
   }

