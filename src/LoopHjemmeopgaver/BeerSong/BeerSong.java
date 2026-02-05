package LoopHjemmeopgaver.BeerSong;

public class BeerSong {
        private int bottles;

        public BeerSong(int bottles) {
            this.bottles = bottles;
        }

        public void countBeer() {
            int i = bottles;
            while (i > 0) {

                    System.out.println( i + " bottles of beer on the wall, " + i + " bottles of beer!\n" +
                            "Take one down, pass it around, " + (i - 1) + " bottles of beer on the wall.\n");
                    i--;
                }
            System.out.println("No more bottles of beer on the wall! 🍾");
        }
}
