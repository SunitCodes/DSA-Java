class Solution {
    public int heightChecker(int[] heights) {
        int expected[]=new int[heights.length];
        int c=0;

        for(int i=0;i<heights.length;i++)
            expected[i]=heights[i];

        for(int i=0;i<expected.length-1;i++)
        {
            for(int j=0;j<expected.length-1-i;j++)
            {
                if(expected[j]>expected[j+1]){
                    int temp=expected[j+1];
                    expected[j+1]=expected[j];
                    expected[j]=temp;
                }
            }
        }

        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i])
            c++;
        }
        return c;
    }
}