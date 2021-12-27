class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int a = m.length;
        int b = m[0].length;
        if(t<m[0][0]||t>m[a-1][b-1])
            return false;
        if(m[0][0]==t)
            return true ;
        int k =0 ; 
for(int i = 0 ; i <a ;i ++ )
        if(m[i][b-1]==t)
            return true ;

        else if(m[i][b-1]>t){
            for(int j=0;j<b;j++){
                if(m[i][j]==t)
                    return true ;
            }
        }
       return false;
    }
}