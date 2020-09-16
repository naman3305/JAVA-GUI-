class AllPrimes
{
    public static void main(String[] args) 
    {
       AllPrimes obj=new AllPrimes();
        
       for(int i=1;i<=100;i++)
       {
           if( obj.isprime(i) )
           {
               System.out.print(i+",");
           }
       }
    }
    
    boolean isprime(int n)
    {
        int i,flag=0;
        
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        
        if(flag==0)
            return (true);
        else
            return (false);
    }
}