package Dudinha;

import robocode.*;

// Classe que representa o robô Dudinha, que herda da classe Robot do Robocode
public class Dudinha extends Robot {
    
    // Método principal que define o comportamento do robô
    public void run() {
        while (true) {
            ahead(100);
            turnGunRight(360);
            back(100);
            turnGunRight(360);
            turnRight(Math.random() * 360);
        }
    }

    // Método chamado quando o robô escaneia outro robô
    public void onScannedRobot(ScannedRobotEvent e) {
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

    // Método chamado quando o robô é atingido por uma bala
    public void onHitByBullet(HitByBulletEvent e) {
        back(50);
        turnRight(90);
    }

    // Método chamado quando o robô colide com uma parede
    public void onHitWall(HitWallEvent e) {
        back(20);
        turnRight(90);
    }

}
