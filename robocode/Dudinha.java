package Dudinha;

import robocode.*;

public class Dudinha extends Robot { //HERANÇA
    public void run() { // METODO
        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
            turnRight(Math.random() * 360);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) { //METODO
        double enemyBearing = e.getBearing();
        double enemyHeading = e.getHeading();
        double enemyVelocity = e.getVelocity();
        double futureX = getX() + Math.sin(Math.toRadians(enemyHeading)) * enemyVelocity;
        double futureY = getY() + Math.cos(Math.toRadians(enemyHeading)) * enemyVelocity;
        double radarTurn = enemyBearing; 
        turnRadarRight(radarTurn); 
        double angleToEnemy = Math.atan2(futureX - getX(), futureY - getY());
        double gunTurn = Math.toDegrees(angleToEnemy) - getGunHeading();
        turnGunRight(gunTurn); 

        fire(1);
    }

    public void onHitByBullet(HitByBulletEvent e) { //METODO
        back(50);
        turnRight(90);
    }

    public void onHitWall(HitWallEvent e) { // METODO
        back(20);
        turnRight(90);
    }

    public void onRobotDeath(RobotDeathEvent e) { //METODO
    }
}
