public class Skeleton extends Boss{


    private int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    @Override
    public String printinfo() {
        return super.printinfo() +"Weapon Type: "+getWeapon();
    }
}
