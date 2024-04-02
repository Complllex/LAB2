public class Fine {
    IsOutOfField isOutOfField = new IsOutOfField();
    public int fine(int x, int y, Player unit, char[][] battlefield, int FIELD_SIZE, final char SWAMP_TILE, final char TREE_TILE){
        if(isOutOfField.check(x,y,FIELD_SIZE)==false) return 999;
        int fine = 0;
        System.out.println("DEBUG: " + unit.x + " "+ unit.y + " " + Math.abs(unit.x - x));
        if(unit.x < x) {
            for (int i = 1; i < Math.abs(unit.x - x)+2; i++) {
                if (battlefield[unit.x + i][unit.y] == SWAMP_TILE || battlefield[x][y] == TREE_TILE) {
                    fine++;
                }
            }
        }else{
            for (int i = 1; i < Math.abs(unit.x - x)+2; i++) {
                if (battlefield[unit.x - i][unit.y] == SWAMP_TILE || battlefield[x][y] == TREE_TILE) {
                    fine++;
                }
            }
        }
        if(unit.y < y){
            for(int j=1; j < Math.abs(unit.y - y)+2; j++){
                if (battlefield[x][unit.y+j] == SWAMP_TILE || battlefield[x][y] == TREE_TILE) {
                    fine++;
                }
            }
        }else {
            for(int j=1; j < Math.abs(unit.y - y)+2; j++){
                if (battlefield[x][unit.y-j] == SWAMP_TILE || battlefield[x][y] == TREE_TILE) {
                    fine++;
                }
            }
        }
        System.out.println("ШТРАФ: " + fine);
        return fine;
    }
}
