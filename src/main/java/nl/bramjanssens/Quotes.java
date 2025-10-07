package nl.bramjanssens;

import java.util.Random;

public class Quotes {

    private static final String[] FORREST_GUMP_QUOTES = {
            // "Life is like a box of chocolates. You never know what you're gonna get.",
            "Stupid is as stupid does.",
            "Run, Forrest, run!",
            "My mama always said, 'You've got to put the past behind you before you can move on.'",
            "I'm not a smart man, but I know what love is.",
            "Sometimes, I guess there just aren't enough rocks.",
            "Me and Jenny goes together like peas and carrots.",
            "I just felt like running.",
            "That's all I have to say about that.",
            "Mama always had a way of explaining things so I could understand them.",
            "I may not be a smart man, but I know what love is.",
            "Dear God, make me a bird so I can fly far, far away from here.",
            "I'm pretty tired... I think I'll go home now.",
            "Lieutenant Dan, you got new legs!",
            "Bubba was my best good friend.",
            "Mama says they was magic shoes. They could take me anywhere.",
            "I'd make a good husband, Jenny.",
            "Have you found Jesus yet, Gump?",
            "Mama says, 'Stupid is as stupid does.'",
            "I'm sorry I ruined your New Year's Eve party, Lieutenant Dan.",
            "My name's Forrest Gump. People call me Forrest Gump.",
            "Now you wouldn't believe me if I told you, but I could run like the wind blows.",
            "From that day on, we was always together. Jenny and me was like peas and carrots.",
            "Anyway, like I was sayin', shrimp is the fruit of the sea.",
            "I don't know if we each have a destiny, or if we're all just floating around accidental-like on a breeze.",
            "If you're ever a shrimp boat captain, that's the day I'm an astronaut.",
            "Nobody gives a horse's shit about us, do they, Dan?",
            "Forrest, you don't know what love is.",
            "My mama always said you've got to put the past behind you before you can move on.",
            "Mama always said dying was a part of life."
    };

    private static final Random random = new Random();

    public static String random() {
        int index = random.nextInt(FORREST_GUMP_QUOTES.length);
        return FORREST_GUMP_QUOTES[index];
    }
}
