public class avatar {
    int posX;
    int posY;
    int dx;
    int dy;

    int height;
    int width;
    String power;
    String role;
    String weakness;

    public avatar(){
        posX = 400;
        posY = 600;
        dx = 20;
        dy = 70;
        height = 175;
        width = 220;
        power = "run";
        role = "villain";
        weakness = "pride";
    }

    public avatar(int pPosX,int pPosY,int pDy, int pDx,int pHeight,int pWidth, String pPower, String pRole, String pWeakness)
    {
        posX = pPosX;
        posY = pPosY;
        dx = pDx;
        dy = pDy;

    }
    public void batman(){
        posX = 400;
        posY = 600;
        dx = 20;
        dy = 70;
        height = 175;
        width = 220;
        power = "run";
        role = "villain";
        weakness = "pride";
    }
    public void batman(int pPosX,int pPosY,int pDy, int pDx,int pHeight,int pWidth, String pPower, String pRole, String pWeakness)
        {
            posX = pPosX;
            posY = pPosY;
            dx = pDx;
            dy = pDy;



        }
    public void print(){
        System.out.println("the" + role + "can"+ power + "and their weakness is" + weakness);
        System.out.println("they are at the location (" + posX + ","+ posY +")");

    }

}
