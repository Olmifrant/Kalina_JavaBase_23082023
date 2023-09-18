package ua.hillel.kalina.lessons.less_004;

public class dz005 {
    public static void main(String[] args) {

 //          dz005 chinese dynasties from aliexpress

        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;
        int quantityLi = 860;

        int warriorMi = 9;
        int archerMi = 35;
        int riderMi = 12;
        double quantityMi = (860*1.5);

        double attackLevelLI = ((warriorLi + archerLi + riderLi) * quantityLi);
        double attackLevelMI = ((warriorMi + archerMi + riderMi) * quantityMi);

        System.out.println("Li Dynasty Warrior Attack Rate = " + attackLevelLI);
        System.out.println("Ming Dynasty Warrior Attack Rate = " + attackLevelMI);





    }
}
