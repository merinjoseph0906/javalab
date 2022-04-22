public class Array4  
{  
public static void main(String[] args)   
{  
  
int[] a = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};  
System.out.println("Array elements after sorting:");  

for (int i = 0; i < a.length; i++)   
{  
for (int j = i + 1; j < a.length; j++)   
{  
int tmp = 0;  
if (a[i] > a[j])   
{  
tmp = a[i];  
a[i] = a[j];  
a[j] = tmp;  
}  
}  

System.out.println(a[i]);  
}  
}  
}  