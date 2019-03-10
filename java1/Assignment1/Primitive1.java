class Primitive1
{
public static void main(String args[])
{
boolean a=false;
byte b=12;
int c=13;
float d=10.50f;
double e=20.50;
/* b=c+b;possible lossy conversion from int to byte
System.out.println(b);*/
 b=(byte)(c+b);    //explicit conversion  int to byte
 System.out.println(b);
int k=c+c;
System.out.println(k);
int l=b+120;//implicit conversion

/*c=d+10;  can not convert float to int */

c=(int)(d+10);//explicit conversion from float to int 


System.out.println(l);
//b=b+b;// possible lossy conversion from int to byte but we can resolve this by using short circuit operator
b+=b;//short circuit operator will implicitly converts its right side equation into left side data type so there will be no error
System.out.println(b);
c=c+c;
System.out.println(c);
float f=12.55f;
f=f+10;
System.out.println(f);
/*float m=10.80;// incompatible types: possible lossy conversion from double to float :for float we have to use 10.80f
m=m+10;
System.out.println(m);*/

d=(float)(e+e);//explict convertion from double to float

e=d+d;
e=

}
}