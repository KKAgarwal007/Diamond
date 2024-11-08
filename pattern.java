public class pattern {
    public static void main(String[] args) {

        int n = 5;
//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=i; j++) {
//                int sum = i + j;
//                if (sum % 2 == 0) {
//                    System.out.print("1 ");
//                } else {
//                    System.out.print("0 ");
//                }
//            }
//            System.out.println();
//
//        }

//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=n-i;j++){
//                System.out.print(" ");
//            }
//
//            for(int j = 1; j<=n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//
//            }
//
//            int space = 2 * (n - i);
//            for (int j = 1; j <= space; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//52
//        for (int i = n; i > 0; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//
//            }
//
//            int space = 2 * (n - i);
//            for (int j = 1; j <= space; j++) {
//                System.out.print(" ");
//            }252
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//
//        }

//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=n-i+1; j++){
//                System.out.print(" ");
//
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

//        for(int i = 1; i<=n; i++){
//            for(int j = 1; j<=n-i+1; j++ ){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<n-i+1; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i = n; i>0; i--){
            for(int j = 1; j<n-i+1; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
