package com.abdallah.jokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class JokesProvider {

    private List<String> jokes = new ArrayList<>();
    private Random random = new Random();

    public JokesProvider() {
        fetchJokes();
    }

    /**
     * Simulates fetching jokes from a web service.
     */
    private void fetchJokes() {
        jokes.add("A family of mice were surprised by a big cat. Father Mouse jumped and said, \"Bow-wow!\" The cat ran away. \"What was that, Father?\" asked Baby Mouse. \"Well, son, that's why it's important to learn a second language.\" ");
        jokes.add("My friend said he knew a man with a wooden leg named Smith. \n" +
                "So I asked him \"What was the name of his other leg?\"");
        jokes.add("A man goes to the doctor and says, \"Doctor, wherever I touch, it hurts.\" \n" +
                "The doctor asks, \"What do you mean?\" \n" +
                "The man says, \"When I touch my shoulder, it really hurts. If I touch my knee - OUCH! When I touch my forehead, it really, really hurts.\" \n" +
                "The doctor says, \"I know what's wrong with you - you've broken your finger!\" ");
        jokes.add("A man asks a farmer near a field, \"Sorry sir, would you mind if I crossed your field instead of going around it? You see, I have to catch the 4:23 train.\"\n" +
                "\n" +
                "The farmer says, \"Sure, go right ahead. And if my bull sees you, you'll even catch the 4:11 one.\"");
        jokes.add("Teacher: Did your father help you with your homework? \n" +
                "Student: No, he did it all by himself.");
        jokes.add("My boss is so unpopular even his own shadow refuses to follow him.");
        jokes.add("A person who speaks two languages is bilingual...A person who speaks three languages is trilingual...A person who speaks four or more languages is multilingual. \n" +
                "What is a person who speaks one language? \n" +
                "An American.");
        jokes.add("- \"My wife suffers from a drinking problem.\"\n" +
                "= \"Oh is she an alcoholic?\"\n" +
                "- \"No, I am, but she's the one who suffers.\"");
    }

    public String provide() {
        int randomPos = random.nextInt(jokes.size());
        return jokes.get(randomPos);
    }

}
