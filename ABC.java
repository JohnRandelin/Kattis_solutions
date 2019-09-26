import java.util.Scanner;

public class ABC {
    
    public static void main(String[] args) {
        int[] list = {0, 0 ,0};
        char[] order = {0 ,0 ,0};
        int  i;
    
        Scanner ob = new Scanner(System.in);
    
        
        for(i=0; i<list.length; i++) 
        {
            int a = ob.nextInt();
             list[i] = a;
            
        }
        
         int n=list.length;
         
        for (i = 0; i < n-1; i++) {
            
            for (int j = 0; j < n-i-1; j++) {
                if (list[j] > list[j+1]) 
                { 
                    
                    int temp = list[j]; 
                    list[j] = list[j+1]; 
                    list[j+1] = temp; 
                } 
            }
        }
        
ob.nextLine();
String s = ob.nextLine();
        
        for(i=0; i<order.length; i++)
        {
            
             order[i] = s.charAt(i);
        }
        
        ob.close();

        
    if(order[0] == 'A' && order[1]=='B')
    {
        System.out.print(list[0]+" ");
        System.out.print(list[1]+" ");
        System.out.print(list[2]);
    }
    if(order[0] == 'A' && order[1]=='C')
    { 
        System.out.print(list[0]+" ");
        System.out.print(list[2]+" ");
        System.out.print(list[1]);
        }
    if(order[0] == 'C' && order[1]=='B')
    {
        
        System.out.print(list[2]+" ");
        System.out.print(list[1]+" ");
        System.out.print(list[0]);
        
    }
    if(order[0]=='C' && order[1]=='A')
    {
        System.out.print(list[2]+" ");
        System.out.print(list[0]+" ");
        System.out.print(list[1]);
    }

    if(order[0] == 'B' && order[1]=='A')
    { 
        System.out.print(list[1]+" ");
        System.out.print(list[0]+" ");
        System.out.print(list[2]);
     
    }
    if(order[0] == 'B' && order[1]=='C')
    { 
        System.out.print(list[1]+" ");
        System.out.print(list[2]+" ");
        System.out.print(list[0]);
    }
    }
    }

