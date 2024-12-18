/*Write a Java program to create a Package “SY” which has a class SYMarks (members –  
ComputerTotal, MathsTotal, and ElectronicsTotal). Create another package TY which has a class  
TYMarks (members – Theory, Practicals). Create n objects of Student class (having rollNumber,  
name, SYMarks and TYMarks). Add the marks of SY and TY computer subjects and calculate  
the Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for >= 50 , Pass Class for > =40 else ‘FAIL’) and  
display the result of the student in proper format. */

import Marks.*;
import java.io.*;
class StudentInfo{
int rollno;
String name,grade;
public float gt,tyt,syt;
public float per;
public void get() throws IOException{
System.out.println("Enter roll number and name of the student: ");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
rollno=Integer.parseInt(br.readLine());
name=br.readLine();
}
}
public class StudentMarks {
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of students:");
int n=Integer.parseInt(br.readLine());
SYMarks sy[]=new SYMarks[n];
TYMarks ty[]=new TYMarks[n];
StudentInfo si[]=new StudentInfo[n];
for(int i=0;i<n;i++)
{
si[i]=new StudentInfo();
sy[i]=new SYMarks();
ty[i]=new TYMarks();
si[i].get();
sy[i].get();
ty[i].get();
si[i].syt=sy[i].ct+sy[i].et+sy[i].mt;
si[i].tyt=ty[i].pm+ty[i].tm;
si[i].gt=si[i].syt+si[i].tyt;
si[i].per=(si[i].gt/1200)*100;
if(si[i].per>=70) si[i].grade="A";
else if(si[i].per>=60) si[i].grade="B";
else if(si[i].per>=50) si[i].grade="C";
else if(si[i].per>=40) si[i].grade="Pass";
else si[i].grade="Fail";

}
System.out.println("Roll No\tName\tSyTotal\tTyTotal\tGrandTotal\tPercentage\tGrade");
for(int i=0;i<n;i++)
{
System.out.println(si[i].rollno+"\t"+si[i].name+"\t"+si[i].syt+"\t"+si[i].tyt+"\t"+si[i].gt+"\t\
t"+si[i].per+"\t\t"+si[i].grade);
}
}
}
