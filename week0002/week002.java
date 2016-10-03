import java.util.Scanner;

/**
 *
 * @author HuuRobo-PC
 */
public class week002 {
    public static void main(String[] args){
        int n, i, j, count = 0 , upi, boti, leftj, rightj;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Ma trận có "+n*n+" số");
        upi = 0; boti = n-1; leftj = 0; rightj = n-1; i = upi; j = leftj;
        while(count != (n*n)){
            while(i == upi && j <= rightj){count++;arr[i][j]=count;j++;}j--;i++;
            while(j == rightj && i <= boti){count++;arr[i][j]=count;i++;}i--;j--;
            while(i == boti && j >= leftj){count++;arr[i][j]=count;j--;}i--;j++;
            while(j == leftj && i >= upi+1){count++;arr[i][j]=count;i--;}i++;
            upi+=1; boti-=1;leftj+=1;rightj-=1;i=upi;j=leftj;    
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
                System.out.println();
        }
    }
}
