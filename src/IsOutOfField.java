public class IsOutOfField {
    public boolean check(int x, int y, int FIELD_SIZE){
        if (x >= 0 && x <= FIELD_SIZE && y >= 0 && y <= FIELD_SIZE) {
            return true;
        }
        System.out.println("ХОД ВНЕ ПОЛЯ!");
        return false;
    }
}
