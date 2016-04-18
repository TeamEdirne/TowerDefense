package entities;

import java.awt.*;
import java.util.LinkedList;

public interface EnemyEntity {
    public void tick(LinkedList<BuildingEntity> buildingEntities);
    public void render(Graphics g);
    public Rectangle getBounds();

    public double getX();
    public double getY();

}
