import java.util.*;
import java.io.*;

class app{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter size:");
int n=s.nextInt();

// Logic to Square Pattern:
for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
        System.out.print("* ");
    }
    System.out.println();
    }
}
}

/* Output:
Enter size:
5
* * * * *
* * * * *
* * * * *
* * * * *
* * * * * 
*/

// Logic to Increasing Triangle Pattern
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }
    System.out.println();
}

/* Output:
Enter size:
5
*
* *
* * *
* * * *
* * * * *
 */

 // Logic to Decreasing Triangle Pattern
 for(int i=1;i<=n;i++){
    for(int j=n;j>=i;j--){
        System.out.print("* ");
    }
    System.out.println();
}
    

 /* Output:
Enter size:
5
* * * * *
* * * *
* * *
* *
*
*/

// Logic to Right Sided Triangle Pattern
for(int i=1;i<=n;i++){
    for(int j=n;j>=i;j--){
        System.out.print("  ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }
    System.out.println();
}

/* Output:
Enter size:
5
          *
        * *
      * * *
    * * * *
  * * * * *
*/

// Logic to Right Sided Triangle Pattern
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print("  ");
    }
    for(int j=i;j<=n;j++){
        System.out.print("* ");
    }
    System.out.println();
}

/* Output:
Enter size:
5
  * * * * *
    * * * *
      * * *
        * *
          *
*/

// Logic to Hill Triangle Pattern
for(int i=1;i<=n;i++){
    for(int j=n;j>=i;j--){
        System.out.print("  ");
    }
    for(int j=1;j<i;j++){
        System.out.print("* ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }
    System.out.println();
}

/* Output:
Enter size:
5
          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
*/

// Logic to Hill Triangle Pattern
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print("  ");
    }
    for(int j=i;j<n;j++){
        System.out.print("* ");
    }
    for(int j=i;j<=n;j++){
        System.out.print("* ");
    }
    System.out.println();
}

/* Output:
Enter size:
5
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *
*/

// Logic to Diamond Pattern
for(int i=1;i<n;i++){
    for(int j=n;j>=i;j--){
        System.out.print("  ");
    }
    for(int j=1;j<i;j++){
        System.out.print("* ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("* ");
    }
    System.out.println();
}

for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print("  ");
    }
    for(int j=i;j<n;j++){
        System.out.print("* ");
    }
    for(int j=i;j<=n;j++){
        System.out.print("* ");
    }
    System.out.println();
}


/* Output:
Enter size:
5
          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *
*/

// Logic to Triangle Pattern with Letters starting from 'A'
for(int i=1,p='A';i<=n;i++,p++){
  for(int j=1;j<=i;j++){
  System.out.print((char)p);
  }
  System.out.println();
  }

/* Output:
Enter size:
5
A
BB
CCC
DDDD
EEEEE
*/

// Logic to Triangle Pattern with Letters starting from 'E'
for(int i=1,p='E';i<=n;i++,p--){
  for(int j=1;j<=i;j++){
  System.out.print((char)p+" ");
  }
  System.out.println();
  }

/* Output:
Enter size:
5
E
D D
C C C
B B B B
A A A A A
*/

// Logic to Triangle Pattern with Letters increment of 2
for(int i=1,p='A';i<=n;i++,p+=2){
  for(int j=1;j<=i;j++){
  System.out.print((char)p+" ");
  }
  System.out.println();
  }

/* Output:
Enter size:
5
A
C C
E E E
G G G G
I I I I I
*/

// Logic to Triangle Pattern with Letters A & B
for(int i=1;i<=n;i++){
  for(int j=1;j<=i;j++){
  if(i%2==0) System.out.print("B ");
  else System.out.print("A ");
  
  }
  System.out.println();
  }

/* Output:
Enter size:
5
A
B B
A A A
B B B B
A A A A A
*/

// Logic to Triangle Pattern with Letter Z and number 0
for(int i=1;i<=n;i++){
  int p=n;
  for(int j=1;j<i;j++) System.out.print("  ");
  for(int j=i;j<=n;j++){
  if(i%2==0) System.out.print("0 ");
  else System.out.print("Z ");
  }
  System.out.println();
  }

/* Output:
Enter size:
5
Z Z Z Z Z
  0 0 0 0
    Z Z Z
      0 0
        Z
*/

// Logic to Diamond Pattern with Letters
for(int i=1,p='A';i<n;i++,p++){
  for(int j=i;j<=n;j++) System.out.print("  ");
  for(int j=1;j<i;j++) System.out.print((char)p+" ");
  for(int j=1;j<=i;j++) System.out.print((char)p+" ");
  System.out.println();
  }
  for(int i=1,p='E';i<=n;i++,p--){
  for(int j=1;j<=i;j++) System.out.print("  ");
  for(int j=i;j<n;j++) System.out.print((char)p+" ");
  for(int j=i;j<=n;j++) System.out.print((char)p+" ");
  System.out.println();
  }

/* Output:
Enter size:
5
          A
        B B B
      C C C C C
    D D D D D D D
  E E E E E E E E E
    D D D D D D D
      C C C C C
        B B B
          A
*/

// Logic to Triangle Pattern with Letters
for(int i=1;i<=n;i++){
  for(int j=1,p='A';j<=i;j++,p++){
  System.out.print((char)p+" ");
  }
  System.out.println();
  }

/* Output:
Enter size:
5
A
A B
A B C
A B C D
A B C D E
*/

// Logic to Triangle Pattern with Letters
for(int i=1;i<=n;i++){
  for(int j=1;j<i;j++){
  System.out.print("  ");
  }
  for(int j=i,p='A';j<=n;j++,p++){
  System.out.print((char)p+" ");
  }
  System.out.println();
  }

/* Output:
Enter size:
5
A B C D E
  A B C D
    A B C
      A B
        A
*/

// Logic to Hill Pattern with Letters
for(int i=1;i<=n;i++){
  for(int j=i;j<=n;j++){
  System.out.print("  ");
  }
  for(int j=1,p='A';j<=2*i-1;j++,p++){
  System.out.print((char)p+" ");
  }
  System.out.println();
  }

/* Output:
Enter size:
5
          A
        A B C
      A B C D E
    A B C D E F G
  A B C D E F G H I
*/

// Logic to Triangle Pattern with Letters
for(int i=1,k='E';i<=n;i++,k--){
  int p=k;
  for(int j=1;j<=i;j++) System.out.print("  ");
  for(int j=i;j<=n;j++) System.out.print((char)p--+" ");
  System.out.println();
  }

/* Output:
Enter size:
5
  E D C B A
    D C B A
      C B A
        B A
          A
*/

// Logic to Hill Pattern with Letters
for(int i=1;i<=n;i++){
  int p='A';
  for(int j=i;j<=n;j++) System.out.print("  ");
  for(int j=1;j<i;j++) System.out.print((char)p+++" ");
  for(int j=1;j<=i;j++) System.out.print((char)p--+" ");
  System.out.println();
  }

/* Output:
Enter size:
5
          A
        A B A
      A B C B A
    A B C D C B A
  A B C D E D C B A
*/

// Logic to Triangle Pattern with Numbers
for(int i=1;i<=n;i++){
  int p=5;
  for(int j=1;j<=i;j++) System.out.print(p--+" ");
  System.out.println();
  }

/* Output:
Enter size:
5
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/

// Logic to Triangle Pattern with Numbers
for(int i=1,p=1;i<=n;i++,p++){
  int k=p;
  for(int j=i;j<=n;j++) System.out.print(k+++" ");
  System.out.println();
  }

/* Output:
Enter size:
5
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
*/

// Logic to Triangle Pattern with Numbers
for(int i=1,p=1;i<=n;i++,p++){
  for(int j=1;j<=i;j++) System.out.print(p+" ");
  System.out.println();
  }

/* Output:
Enter size:
5
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/

// Logic to Triangle Pattern with Numbers
for(int i=1,p=5;i<=n;i++,p--){
  for(int j=1;j<=i;j++) System.out.print(p+" ");
  System.out.println();
  }

/* Output:
Enter size:
5
5
4 4
3 3 3
2 2 2 2
1 1 1 1 1
*/

// Logic to Triangle Pattern with Numbers
for(int i=1,p=0;i<=n;i++,p+=2){
  for(int j=1;j<=i;j++) System.out.print(p+" ");
  System.out.println();
  }

/* Output:
Enter size:
5
0
2 2
4 4 4
6 6 6 6
8 8 8 8 8
*/

// Logic to Triangle Pattern with Numbers
for(int i=1;i<=n;i++){
  for(int j=1;j<=i;j++) {
  if(i%2==0) System.out.print("2 ");
  else System.out.print("1 ");
  }
  System.out.println();
  }

/* Output:
Enter size:
5
1
2 2
1 1 1
2 2 2 2
1 1 1 1 1
*/

// Logic to Diamond Pattern with Numbers
for(int i=1,p=1;i<=n;i++,p++){
  for(int j=i;j<=n;j++) {
  System.out.print("  ");
  }
  for(int j=1;j<=2*i-1;j++){
  System.out.print(p+" ");
  }
  System.out.println();
  }
  
  for(int i=4,p=6;i>0;i--,p++){
  for(int j=i;j<=n;j++) {
  System.out.print("  ");
  }
  for(int j=1;j<=2*i-1;j++){
  System.out.print(p+" ");
  }
  System.out.println();
  }

/* Output:
Enter size:
5
          1
        2 2 2
      3 3 3 3 3
    4 4 4 4 4 4 4
  5 5 5 5 5 5 5 5 5
    6 6 6 6 6 6 6
      7 7 7 7 7
        8 8 8
          9
*/

// Logic to Diamond Pattern with Numbers
for(int i=1,p=1;i<=n;i++,p++){
  for(int j=i;j<=n;j++) {
  System.out.print("  ");
  }
  for(int j=1;j<=2*i-1;j++){
  System.out.print(p+" ");
  }
  System.out.println();
  }
  
  for(int i=4,p=4;i>0;i--,p--){
  for(int j=i;j<=n;j++) {
  System.out.print("  ");
  }
  for(int j=1;j<=2*i-1;j++){
  System.out.print(p+" ");
  }
  System.out.println();
  }

/* Output:
Enter size:
5
          1
        2 2 2
      3 3 3 3 3
    4 4 4 4 4 4 4
  5 5 5 5 5 5 5 5 5
    4 4 4 4 4 4 4
      3 3 3 3 3
        2 2 2
          1
*/

// Logic to Triangle Pattern with Numbers
for(int i=1;i<=n;i++){
  for(int j=1,p=1;j<=i;j++,p++){
  System.out.print(p+" ");
  }
  System.out.println();
  }

/* Output:
Enter size:
5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

// Logic to Triangle Pattern with Numbers
for(int i=1;i<=n;i++){
  for(int j=1;j<i;j++){
  System.out.print("  ");
  }
  for(int j=i,p=1;j<=n;j++,p++){
  System.out.print(p+" ");
  }
  System.out.println();
  }

/* Output:
Enter size:
5
1 2 3 4 5
  1 2 3 4
    1 2 3
      1 2
        1
*/

// Logic to Hill Pattern with Numbers
for(int i=1;i<=n;i++){
  for(int j=i;j<=n;j++){
  System.out.print("  ");
  }
  for(int j=1,p=1;j<=2*i-1;j++,p++){
  System.out.print(p+" ");
  }
  System.out.println();
  }

/* Output:
Enter size:
5
          1
        1 2 3
      1 2 3 4 5
    1 2 3 4 5 6 7
  1 2 3 4 5 6 7 8 9
*/

// Logic to Hill Pattern with Numbers
for(int i=1;i<=n;i++){
  int p=1;
  for(int j=i;j<=n;j++){
  System.out.print("  ");
  }
  for(int j=1;j<i;j++){
  System.out.print(p+++" ");
  }
  for(int j=1;j<=i;j++){
  System.out.print(p--+" ");
  }
  System.out.println();
  }

/* Output:
Enter size:
5
          1
        1 2 1
      1 2 3 2 1
    1 2 3 4 3 2 1
  1 2 3 4 5 4 3 2 1
*/

// Logic to Triangle Pattern with Numbers
int p=1;
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print(p+++" ");
}
System.out.println();
}

/* Output:
Enter size:
5
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

  
  
    