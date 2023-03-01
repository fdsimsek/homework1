public class Main {
    public static void main(String[] args) {
        int number = 1;
        int remainder = number % 2;
        boolean isPrime = true;

        if(number==1){
            System.out.println("1 asal sayı değildir");
            return;
        }

        if (number<2){
            System.out.println("Geçersiz sayı");
        }

        for (int i=2; i<number;i++){
            if (number % 2 ==0){
                isPrime  = false;
            }
        }

        if(isPrime == true){
            System.out.println(number+ " asaldır");
        }else {
            System.out.println(number+ " asal değildir");
        }
    }
}