/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rasmus
 */
public class Main {

    public static void main(String[] args) {

        Box isoBox = new Box(20);
        Box laatikko = new Box(10);
        isoBox.add(laatikko);
        laatikko.add(new Book("Horstman", "Core Java", 5));
        isoBox.weight();
        System.out.println(isoBox);
                System.out.println(laatikko);
    }

}
