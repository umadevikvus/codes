#include<stdio.h>
#include<conio.h>
void main()
{
    char a;
    printf("enter the character:");
    scanf("%c",&a);
    if((a>=65)&&(a<=90)||(a>=97)&&(a<=122))
        printf("alphabet");
    else
        printf("not alphabet");
}
