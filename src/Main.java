public class Main {
    public static void main(String[] args) {
        Boss boss=new Boss();
        Weapon weapon = new Weapon();
        weapon.setNuclearWeapons("mars");
        boss.setUron(200);
        boss.setWeapon(weapon);
        boss.setJizn("beskonechniy");
        System.out.println(boss.printinfo());




        System.out.println("Informasiya o Bosse: " +"Uron: " + boss.getUron()+ " Jizn Bossa: " + boss.getJizn() +
                " Nazvaniya orujiya: "+ weapon.getNuclearWeapons() );

        Skeleton skeleton1=new Skeleton();
        skeleton1.setNumberOfArrows(230);
        System.out.println("Informasiya o skelete 1 : "+ skeleton1.getNumberOfArrows());

        Skeleton skeleton2=new Skeleton();
        skeleton2.setJizn("best");
        skeleton2.setUron(900);
        System.out.println("Informasiya o skelete 2 : " + "Jizn: " + skeleton2.getJizn() + " Uron: "+ skeleton2.getUron());


    }




}