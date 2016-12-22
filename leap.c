#include<stdio.h>
#include<conio.h>
void main()
{
int year;
scanf("%d",&year);
if(((year%4)==0)&&((year%100)!=0))
   printf("its leap yr");
else
   printf("it is not leap yr");
getch();
}
