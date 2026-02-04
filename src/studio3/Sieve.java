import java.util.Scanner;
public class Sieve {
public static void main(String[] args) {
        
Scanner in = new Scanner(System.in);
System.out.println("Up to what number do you wish for the prime numbers to be?");
int n = in.nextInt();

boolean[] sieve = new boolean[n + 2];

for(int i = 2; i < n ; i++){
sieve[i - 2] = true;

}
int j = 0;
for(int e = 2; e < n; e++){
if (sieve[e - 2] = true) {
    int num = e;
    int y = (num * num) + (j * num);
    sieve[y] = false;
    j++;
    }
}
for(int x = 0; x < n; x++){
if (sieve[x] = true){
    System.out.println(x + 2);
}
}

}











}

