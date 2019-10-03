package movies;
import util.Input;

import java.util.ArrayList;


public class MoviesApplication {


    public static void main(String[] args) {
        Input input = new Input();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(9);
        nums.add(34);
        nums.add(16);
        nums.clear();
        nums.add(14);
        for (int num: nums) {
            System.out.println(num);
        }


        boolean keepGoing = true;
        int userPick;
        do {
            System.out.println(
                    "\nWhat would you like to do?\n" +
                            "\n" +
                            "0 - exit\n" +
                            "1 - view all movies\n" +
                            "2 - view movies in the animated category\n" +
                            "3 - view movies in the drama category\n" +
                            "4 - view movies in the horror category\n" +
                            "5 - view movies in the scifi category\n" +
                            "6 - view movies in the musical category\n" +
                            "\n" +
                            "Enter your choice:");
            userPick = input.getInt(0, 6);
            if(userPick == 0) {
                keepGoing = false;
            }else if(userPick == 1) {
                allTitles();
            }else if(userPick == 2){
                animatedTitles();
            }else if(userPick == 3){
                dramaTitles();
            }else if(userPick == 4){
                horrorTitles();
            }else if(userPick == 5){
                scifiTitles();
            }else if (userPick == 6){
                musicalTitles();
            }
        }while (keepGoing);




    }


    public static void allTitles(){
        for(int i = 0; i < MoviesArray.findAll().length; i++ ){
            String titleAndGenre = MoviesArray.findAll()[i].getMovieName() + " -- " + MoviesArray.findAll()[i].getMovieCategory();
            System.out.println(titleAndGenre);
        }
    }

    public static void animatedTitles(){
        for(int i = 0; i < MoviesArray.findAll().length; i++ ){
            String titleAndGenre = MoviesArray.findAll()[i].getMovieName() + " -- " + MoviesArray.findAll()[i].getMovieCategory();
            if( MoviesArray.findAll()[i].getMovieCategory().equalsIgnoreCase("animated")){
                System.out.println(titleAndGenre);
            }
        }
    }

    public static void dramaTitles(){
        for(int i = 0; i < MoviesArray.findAll().length; i++ ){
            String titleAndGenre = MoviesArray.findAll()[i].getMovieName() + " -- " + MoviesArray.findAll()[i].getMovieCategory();
            if( MoviesArray.findAll()[i].getMovieCategory().equalsIgnoreCase("drama")){
                System.out.println(titleAndGenre);
            }
        }
    }

    public static void horrorTitles(){
        for(int i = 0; i < MoviesArray.findAll().length; i++ ){
            String titleAndGenre = MoviesArray.findAll()[i].getMovieName() + " -- " + MoviesArray.findAll()[i].getMovieCategory();
            if( MoviesArray.findAll()[i].getMovieCategory().equalsIgnoreCase("horror")){
                System.out.println(titleAndGenre);
            }
        }
    }

    public static void scifiTitles(){
        for(int i = 0; i < MoviesArray.findAll().length; i++ ){
            String titleAndGenre = MoviesArray.findAll()[i].getMovieName() + " -- " + MoviesArray.findAll()[i].getMovieCategory();
            if( MoviesArray.findAll()[i].getMovieCategory().equalsIgnoreCase("scifi")){
                System.out.println(titleAndGenre);
            }
        }
    }

    public static void musicalTitles(){
        for(int i = 0; i < MoviesArray.findAll().length; i++ ){
            String titleAndGenre = MoviesArray.findAll()[i].getMovieName() + " -- " + MoviesArray.findAll()[i].getMovieCategory();
            if( MoviesArray.findAll()[i].getMovieCategory().equalsIgnoreCase("musical")){
                System.out.println(titleAndGenre);
            }
        }
    }


}
