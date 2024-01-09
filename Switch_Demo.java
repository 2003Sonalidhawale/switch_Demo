import java.util.Scanner;

class Switch_Demo {

        public static void main(String[] args) 
        {

                int choice,num;
                Scanner sc=new Scanner(System.in);

                System.out.println("1:Number is even or odd \n2: Find out the grade (accept marks of 5 subject) \n3: Accept no and find out cube if no is divisible by \n4: Accept 3 number from user and find out the greatest");
                choice=sc.nextInt();
                switch(choice)
                {
                case 1:
                System.out.println("Enter the  number" );
                num=sc.nextInt();
                if(num%2==0)
                {
                        System.out.println("The number is even");
                }
                else
                {
                        System.out.println("The number is odd");
                }
                break;

                case 2:
                int Sub1,Sub2,Sub3,Sub4,Sub5,Total,per;
                System.out.println("Enter the marks of five subject");
                Sub1=sc.nextInt();
                Sub2=sc.nextInt();
                Sub3=sc.nextInt();
                Sub4=sc.nextInt();
                Sub5=sc.nextInt();

                Total=(Sub1+Sub2+Sub3+Sub4+Sub5);
                per=Total/5;

                System.out.println("Total marks:"+Total);

                if(per>=80)
                {
                System.out.println("The grade is A+");
            }
         else if(per>=60)
                {
                System.out.println("The grade is A");
            }
         else if(per>=35)
                {
                System.out.println("The grade is pass");
            }
         else 
                {
                System.out.println("The grade is fail");
            }

                break;

                case 3:
                        int n,res;
                        System.out.println("Enter the  number" );
                        n=sc.nextInt();

                        if(n%5==0)
                {                
                        {
                                res=n*n*n;
                        }
                        System.out.println("cube is:"+res);

                }
                        else
                        {
                                System.out.println("No is not divisible by 5");
                        }
                        break;

                case 4:
                        int num1,num2,num3;
                System.out.println("enter the value of num1=");
                num1=sc.nextInt();
                System.out.println("enter the value of num2=");
                num2=sc.nextInt();
                System.out.println("enter the value of num3=");
                num3=sc.nextInt();

                if (num1>num2 && num1>num3)

                {
                        System.out.println("num1 is greater");
                }
                else if(num2>num1 && num3>num2)
                {
                        System.out.println("num2 is greater");
                }
                else if(num3>num1 && num3>num2)
                {
                        System.out.println("num3 is greater");
                }        
                else
                {
                        System.out.println("Invalid");
                }

                break;        

        default:
                System.out.println("Enter invalid choice");
                break;
        }
}
}