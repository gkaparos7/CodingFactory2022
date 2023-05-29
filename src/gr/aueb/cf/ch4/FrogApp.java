package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * enas mikros vatraxos thelei na perasei ena potami
 * o frog vrisketai sti thesi x, kai thelei na ftasei
 * sti thesi y i se thesi megaluteri apo autin.
 * o frog jumps a fixed distance d.
 * to programma auto vriskei ton elahisto arithmo jumps,pou o frog prepei na kanei
 * oste na ftasei sto stoxo tou.gia paradeigma an exoume x = 10, y=85 kai d =30,
 * tote o frog tha xreiastei 3 jumps. giati tha ksekinisei apo to 10
 * kai meta to protojump paei sto 40, meta sto 70 kai telos sto 100.
 */
public class FrogApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jump = 0;
        int x = 0;
        int y = 0;
        int counter = 0;

        System.out.println("Please insert start, end, jump");
        x = in.nextInt();
        y = in.nextInt();
        jump = in.nextInt();

        for (int i = x; i <= y; i+= jump) {
            counter++;
        }

        //ή counter = (int) Math.ceil((y - x) / (double) jump);
        System.out.printf("The frog needs %d jumps", counter);

    }
}
