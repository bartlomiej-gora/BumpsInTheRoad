package com.github.bartlomiej.gora.bumps;

class BumpsTheRoad {
    private BumpsTheRoad() {
    }

    static String bumps(final String road) {
        int lenght = road.replace("_", "").length();
        return lenght > 15 ? "Car Dead" : "Woohoo!";
    }
}
