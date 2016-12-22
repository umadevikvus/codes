#include<stdio.h>
#include<conio.h>
void main()
{
    char a;
    printf("enter the character:");
    scanf("%c",&a);
    if((a>=65)&&(a<=90))
        printf("capital letter");
    else if((a>=97)&&(a<=122))
        printf("lowercase letters");
    else if((a>=48)&&(a<=57))
        printf("a digit");
    else
        printf("special character");
}
