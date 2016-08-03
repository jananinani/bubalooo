# bubaloooint a[]=new int[n];
 int b[]=new int[2];
 int prev=0;
 for(int i=0;i<n;a[i++]=in.nextInt());
 for(int i=0;i<a.length;i++){
     for(int j=i+1;j<a.length;j++){
         int sum=a[i]+a[j];
         if(prev==0)
             prev=sum;
         if(sum > 0){
             if(sum < prev ){
                 prev=sum;
                 b[0]=a[i];
                 b[1]=a[j];
             }
         }
         else if(sum < 0){
             if(-sum < prev){
                 prev=sum;
                 b[0]=a[i];
                 b[1]=a[j];
             }
         }
     }
 }

    System.out.println(b[0]+" "+b[1]);
