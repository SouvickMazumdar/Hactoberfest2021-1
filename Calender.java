import java.io.*;
 class calender
 {
     public static void main(String args[])throws IOException
     {
         BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enter the number of the month: ");
         int m=Integer.parseInt(br.readLine());
         System.out.println();
         System.out.print("Enter the year: ");
         int y=Integer.parseInt(br.readLine());
         System.out.println();
         int ar[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
         //String ar1[]={"","Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
         calender ob=new calender();
         int m1=9;
         int y1=2018;
         int u=7;
         int d=0,s=0,k;
         { 
              if (m>=m1)
              {
                 for(int i=m1;i<m;i++)
                {
                 s=s+ar[i];
                }
                k=s%7;
                 d=k+u;
                if (u>7)
                  d=d-u;
              }
                else
              {
                 for(int i=m;i<m1;i++)
                 {
                  s=s+ar[i];
                 }
                 k=s%7;
                  d=u-k;
                 
               }
            } 
            if(y%4==0)
            ar[2]=29; 
            int g=0,o,h;
         if(y<y1)
         {
                    o=y1-y;
                   
                   for(int i=y;i<y1;i++)
                   {
                       if(i%4==0)
                       g++;
                    }
                    h=(g+o)%7;
                    /*if(y%4==0&&m<=2 )
                      d=d-h;
                      
                      else*/
                      d=d-h;
                   if(d<=0)
                    d=7+d;
         }
         else
          {
                   o=y-y1;
                   
                   for(int i=y1;i<y;i++)
                   {
                       if(i%4==0)
                       g++;
                    }
                   h=(g+o)%7;
                   /*if(y%4==0 &&m>2)
                   d=d+h+1;
                   else*/
                   d=d+h;
                   
                   if(d>7)
                    d=d-7;
                }
                System.out.println("Mon"+"\t"+"Tue"+"\t"+"Wed"+"\t"+"Thu"+"\t"+"Fri"+"\t"+"Sat"+"\t"+"Sun");
                int v=1;
         for(int i=1;i<=6;i++)
             {
                 for(int j=1;j<=7;j++)
                 {
                     if(i==1&&j<(d-1))
                     {
                         System.out.print(" "+"\t");
                     }
                     else
                     {
                          if(v<=ar[m])
                          {
                              System.out.print(v+"\t");v++;
                            }
                            else
                            {
                                break;
                            }
                        }
                    }
                    System.out.println();
                }
           }     
        }     
             
           
   

     
