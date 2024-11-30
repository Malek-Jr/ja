package ex1;

public class student {
void print() {
System.out.println("Student says good lecture");}
}
class Gamer extends student {
void print()
{System.out.println("Gamer says good game!");
}}
class MyApp {
public static void main(String []args)
{
student a = new student();
student b = new Gamer();Gamer c = new Gamer();
a.print();
b.print();
}}