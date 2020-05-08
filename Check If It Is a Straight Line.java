/**
*You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. 
*Check if these points make a straight line in the XY plane.
**/

//Solution: Using cross product for Collinearity

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2)
            return(true);
        int x1=coordinates[0][0],x2=coordinates[1][0],y1=coordinates[0][1],y2=coordinates[1][1];
        for(int i=2;i<coordinates.length;i++)
        {
            if(((coordinates[i][1]-y1)*(coordinates[i][0]-x2))!=((coordinates[i][1]-y2)*(coordinates[i][0]-x1)))
                return false;
        }
        return true;
        
    }
}
