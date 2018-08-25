#include <stdio.h>
#include <math.h>

double Power(double x, int n){
   if (n == 0){
      return 1.0000;
   }
   else {
      return x*Power(x, n-1);
   }
}

int Factorial(int n){
   if (n == 1){
      return 1;
   }
   else {
      return n*Factorial(n-1);
   }
}

double sinx(double x, int m){
   double sum = 0.0;
   double temp = 0.0;
   int b = 1;
   while(b <= m){
      temp = Power(-1.0, b-1)/Factorial((2*b)-1);
      temp = temp*Power(x, (2*b)-1);
      sum = sum+temp;
      b++;
   }
   return sum;
}

main(){
   auto double x;
   auto int n;
   auto double r;
   auto double s;
   auto char c;

   do {
      printf("Enter Angle X : ");
      scanf("%lf", &x);

      printf("Enter Number of Approximations: ");
      scanf("%d", &n);

      s = sinx(x, n);
      r = sin(x);
      x = (float)x;
      printf("sinx (%.1f, %d) = %.12f, sin(%.1f) = %.12f\n",x,n,s,x,r);

      printf("Do Another?");
      scanf(" %c", &c);

   }while ((c == 'y') || (c == 'Y'));
   return 0;
}
