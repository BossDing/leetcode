package math;

public class UglyNumberII {
    public int nthUglyNumber(int n) {
        int[] ugly=new int[n];
        ugly[0]=1;
        int p2=0,p3=0,p5=0;//分别表示可以用来乘235来生成新的uglynum的数的下标
        for(int i=1;i<n;i++){
        	ugly[i]=Math.min(Math.min(ugly[p2]*2, ugly[p3]*3), ugly[p5]*5);
        	if (ugly[i]==ugly[p2]*2) {
				p2++;
			}
        	if (ugly[i]==ugly[p3]*3) {
				p3++;
			}
        	if (ugly[i]==ugly[p5]*5) {
				p5++;
			}
        }
        return ugly[n-1];
    }

}
