package game.bases;

/**
 * Created by cuonghx2709 on 7/16/2017.
 */
public class Contraints {
    float top;
    float bottom;
    float left;
    float right;

    public Contraints(float top, float bottom, float left, float right) {
        this.top = top;
        this.bottom = bottom;
        this.left = left;
        this.right = right;
    }

    public void make (Vector2D position){
        position.x = MathX.clamp(position.x, left, right);
        position.y = MathX.clamp(position.y, top, bottom);
    }
}
