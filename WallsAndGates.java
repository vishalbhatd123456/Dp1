class Solution {
       private static final int EMPTY = Integer.MAX_VALUE;
        private static final int GATE = 0;
        private static final List<int[]> DIRECTIONS = Arrays.asList(
            new int[] {1,0},
            new int[] {-1,0},
            new int[] {0,1},
            new int[]{0, -1}
        );
    
    public void wallsAndGates(int[][] rooms) {
//         int count = 0;
        
//         for(int i=0;i<rooms.length;i++)
//         {
//             for(int j=0;j<rooms[i].length;j++)
//             {
//                 if(rooms[i][j] == -1)
//                 {
//                     count = count;
//                 }
//                 if(rooms[i][j] == 0)
//                 {
//                     count = count;
//                 }
//                 else
//                 {
//                     count++;
//                 }
//             }
//         }
//         return count;
//         int m = rooms.length;
//         if(m==0)return;
        
//         int n = rooms[0].length;
//         Queue<int[]> q = new LinkedList<>();
        
//         for(int row = 0;row<m;row++)
//         {
//             for(int col = 0;col<n;col++)
//             {
//                 if(rooms[row][col] == GATE)
//                 {
//                     q.add(new int[] {row,col});
//                 }
//             }
//         }
        
//         while(!q.isEmpty())
//         {
//             int[] point = q.poll();
//             int row = point[0];
//             int col = point[1];
            
//             for(int[] direction:DIRECTIONS)
//             {
//                 int r = row+direction[0];
//                 int c = col+direction[1];
//                 if(r<0 || c<0 ||r>=m||c>=n|| rooms[r][c]!=EMPTY)
//                 {
//                     continue;
//             }
//             rooms[r][c] = rooms[row][col]+1;
//             q.add(new int[] {r,c});
//         }
     
        
//     }
// }
        for(int i=0;i<rooms.length;i++)
        {
            for(int j = 0;j<rooms[i].length;++j)
            {
                if(rooms[i][j] == 0)
                {
                    dfs(i,j,0,rooms);
                }
            }
        }
}
    
    public void dfs(int row,int col,int distance,int[][] rooms)
    {
        if(row>=rooms.length ||row<0|| col>=rooms[row].length|| col<0|| rooms[row][col]<distance)
        {
            return;
        }
        
        rooms[row][col] = distance;
        dfs(row+1,col,distance+1,rooms);
        dfs(row-1,col,distance+1,rooms);
        dfs(row,col+1,distance+1,rooms);
        dfs(row,col-1,distance+1,rooms);
    }
}
