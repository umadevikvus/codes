#include<stdio.h>
#include<conio.h>
void main()
{
    int a,b,c;
    printf("enter the values");
    scanf("%d %d %d",&a,&b,&c);
    if((a>b)&&(a>c))
        printf("%d is greater",a);
    else if((b>c)&&(b>a))
        printf("%d is greater",b);
    else
        printf("%d is greater",c);
    getch();

}
