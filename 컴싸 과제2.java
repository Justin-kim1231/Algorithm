   public static int kmin(int[] a, int k) {  
      if (a == null || a.length == 0 || k < 1 || k > a.length) {
         throw new IllegalArgumentException();
      }
      int distinctvalues = 1;
      for (int i = 0; i < a.length - 1; i++) {
         if (a[i] != a[i+1]) {
            distinctvalues++;
         }
      }
      if (k > distinctvalues) {
         throw new IllegalArgumentException();
      }
      int[] b = Arrays.copyOf(a, a.length);
      Arrays.sort(b);
      int kmin = 0;
      
      if ( k == 1) {
         kmin = b[0];
         return kmin;
      }
      else if ( k == distinctvalues) {
         kmin = b[k-1];
         return kmin;
      }         
      for (int i = 0; i < k - 1; i++) {
         if (b[i] == b[i+1]) {
            k++;
         }
         kmin = b[k-1];
      }
      return kmin;
   }
