import java.util.*;
public class chap_3
{
public static void main(String[] args)
{
System.out.println("Ex 1=");
printNumbers(5);
printNumbers(15);
System.out.println("\nEx 2=");
printpowerof2(10);
System.out.println("Ex 3=");
printpowerofN(4,3);
System.out.println();
printpowerofN(5,6);
System.out.println();
printpowerofN(-2,8);
System.out.println();
System.out.println("Ex 4 =");
printsquare(3,7);
System.out.println("Ex 5 =");
printgrid(4,6);
System.out.println("Ex 6 =");
System.out.println(largerAbsVal(11,2));
System.out.println(largerAbsVal(4,-5));
System.out.println("Ex 7=");
System.out.println(largerAbsVal1(7,-2,-11));
System.out.println(largerAbsVal1(-4,5,2));
System.out.println("Ex 8=");
quadratic(1,-7,12);
quadratic(1,3,2);
System.out.println("Ex 9: lastdigit(3572) = " + lastdigit(3572));
System.out.println(" lastdigit(-972) = " + lastdigit(-947));
System.out.println("Ex 10: Area of circle with radius 2.0 = " + area(2.0));System.out.println("Ex 11=");
distance(1,0,4,4);
distance(10,2,3,15);
System.out.println("Ex 12=");
scientific(6.23,5);
scientific(1.9,-2);
System.out.println("Ex 13=");
pay(5.50,6);
pay(4.00,11);
System.out.println("Ex 14=");
cylindersurfacearea(3.0,4.5);
System.out.println("Ex 15=");
spherevolume(2.0);
System.out.println("Ex 16=");
trianglearea(8,5.2,7.1);
System.out.println("Ex 17=");
System.out.println("\"" + padstring ("hello" ,8) +"\"");
System.out.println("\""+padstring("congratulations",8) +"\"");
System.out.println("Ex 18=");
vertical("hey now");
System.out.println("Ex 19=");
printreverse("hello there!");
// For Ex 20 + 21
Scanner console =new Scanner(System.in);
System.out.println("Ex 20=");
inputBirthday(console);
System.out.println("Ex 21=");
System.out.print("Please enter your full name:");
Scanner console1 =new Scanner(System.in);
String name = console1.nextLine();
processname(name);
System.out.println();
}
// Ex 1
public static void printNumbers(int n){
for(int i=1; i<=n; i++)
{
System.out.print("[ " + i + " ]");
}
}
//Ex 2
public static void printpowerof2(int number)
{
int i;
System.out.print("1");
int result=1;
for ( i=1; i<=number;i++)
{
result =result *2;
System.out.print(result + " ");
}
}
//Ex 3
public static void printpowerofN(int base,int exponent)
{
System.out.print("1");
int result =1;
for(int i=1; i<=exponent;i++)
{
result=result * base;
System.out.print(result + " ");
}
}
//Ex 4
public static void printsquare(int min,int max) {
for (int i=0; i<=4; i++)
{
for (int j=min+i; j<=max; j++)
{
System.out.print(j);
}
for (int k=0; k<=i -1;k++) {
System.out.print(min + k);
}}
}
//Ex 5
public static void printgrid(int r, int c)
{
for (int i=1; i<=r; i++)
{
for(int j=0; j<=c-1; j++)
{
System.out.print(i+4 * j + " " );
}
System.out.println();
}
}
// Ex 6
public static double largerAbsVal(int a, int b)
{
a=Math.abs(a);
b=Math.abs(b);
return Math.max(a,b);
}
//Ex 7
public static double largerAbsVal1(int a, int b,int c)
{
a=Math.abs(a);
b=Math.abs(b);
c=Math.abs(c);
int d=Math.max(a,b);
return Math.max(c,d);
}
//Ex 8
public static void quadratic (int a, int b,int c)
{
Double root=Math.sqrt(b * b - 4 * a * c);
Double d=(-b +root) /2 * a;Double e= (-b -root) / 2 *a;
System.out.println(" x= "+ d);
System.out.println(" x= "+ e);
}
// Ex 9
public static int lastdigit (int n)
{
return (int) Math.abs(n%10);
}
// Ex 10
public static double area(double r)
{
double a=r*r*Math.PI;
return a;
}
// Ex 11
public static double distance(double x1,double y1, double x2, double y2)
{
Double d =Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
return d;
}
// Ex 12
public static double scientific (double b, int t)
{
double n =b * Math.pow(10,t);
return n;
}
//Ex 13
public static double pay(double s,int h)
{
Double p=s * Math.min(h,8) +1.5 *s*(Math.max(8,h) -8);
return p;
}
//Ex 14
public static double cylindersurfacearea(double r, double h)
{
Double a=2 * Math.PI * r * r +2 * Math.PI * r * h;
return a;}
// Ex 15
public static double spherevolume(double r)
{
Double v=4 * Math.PI * r * r * r /3;
return v;
}
//Ex 16
public static double trianglearea(double a, double b, double c)
{
Double s=(a+b+c) /2;
Double area=Math.sqrt(s * (s-a) * (s-b) * (s-c));
return area;
}
//Ex 17
public static String padstring(String s,int l)
{
int n=s.length();
int g=1 - n;
for (int i=0; i<=g - 1;l++) {
s=s + " ";
}
return s;
}
//Ex 18
public static void vertical(String s)
{
int l=s.length();
for (int i=0; i<=l-1; i++) {
System.out.println(s.charAt(i));}
}
//Ex 19
public static void printreverse(String s)
{
int n=s.length();
for (int i=n-1; i>=0;i--){
System.out.println(s.charAt(i));
}
}
//Ex20
public static void inputBirthday(Scanner c)
{
System.out.print("On what day of the month were you born?:");
int day = c.nextInt();
System.out.print("What is the name of the month in which you were "+ "born?;");
String month = c.next();
System.out.print("During what year were you born? : ");
int year = c.nextInt();
System.out.print("You were born on "+ month + " "+ day +" , "+ year + ". \tYou're mighty old!");
}
//Ex 21
public static void processname(String name)
{
	String a[] = name.split(" ");

	System.out.print("reverse name: " + a[1] + ", " + a[0]);


}
}
